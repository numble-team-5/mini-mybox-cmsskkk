package kr.ron2.minibox.restdocs;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.extension.ExtendWith;
import org.springframework.boot.test.autoconfigure.web.reactive.WebFluxTest;
import org.springframework.restdocs.RestDocumentationContextProvider;
import org.springframework.restdocs.RestDocumentationExtension;
import org.springframework.test.web.reactive.server.WebTestClient;
import org.springframework.web.context.WebApplicationContext;

import static org.springframework.restdocs.webtestclient.WebTestClientRestDocumentation.documentationConfiguration;

@ExtendWith(RestDocumentationExtension.class)
@WebFluxTest
public abstract class RestDocsTest {

    private WebTestClient webTestClient;

    @BeforeEach
    void setUp(WebApplicationContext wc, RestDocumentationContextProvider provider) {
        this.webTestClient = WebTestClient.bindToApplicationContext(wc)
                .configureClient()
                .filter(documentationConfiguration(provider))
                .build();
    }

}

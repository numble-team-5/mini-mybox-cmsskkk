package kr.ron2.minibox.restdocs;

import kr.ron2.minibox.storage.application.StorageService;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.extension.ExtendWith;
import org.springframework.boot.test.autoconfigure.web.reactive.WebFluxTest;
import org.springframework.boot.test.mock.mockito.MockBean;
import org.springframework.context.ApplicationContext;
import org.springframework.restdocs.RestDocumentationContextProvider;
import org.springframework.restdocs.RestDocumentationExtension;
import org.springframework.test.web.reactive.server.WebTestClient;
import org.springframework.web.reactive.config.EnableWebFlux;

import static org.springframework.restdocs.webtestclient.WebTestClientRestDocumentation.documentationConfiguration;

@ExtendWith(RestDocumentationExtension.class)
@EnableWebFlux
@WebFluxTest
public abstract class RestDocsTest {

    protected WebTestClient webTestClient;

    @MockBean
    protected StorageService storageService;

    @BeforeEach
    void setUp(ApplicationContext ac, RestDocumentationContextProvider provider) {
        this.webTestClient = WebTestClient.bindToApplicationContext(ac)
                .configureClient()
                .filter(documentationConfiguration(provider))
                .build();
    }

}

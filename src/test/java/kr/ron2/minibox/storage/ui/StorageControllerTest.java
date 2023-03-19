package kr.ron2.minibox.storage.ui;

import kr.ron2.minibox.restdocs.RestDocsTest;
import org.junit.jupiter.api.BeforeEach;
import org.springframework.restdocs.payload.JsonFieldType;
import org.springframework.restdocs.snippet.Snippet;

import static org.springframework.restdocs.payload.PayloadDocumentation.fieldWithPath;
import static org.springframework.restdocs.payload.PayloadDocumentation.responseFields;


class StorageControllerTest extends RestDocsTest {

    private static final Snippet ROOT_RESPONSE_FEILDS = responseFields(
        fieldWithPath("storageInfo.storageId").type(JsonFieldType.STRING).description("저장소 아이디"),
        fieldWithPath("storageInfo.usedArea").type(JsonFieldType.NUMBER).description("사용된 공간"),
        fieldWithPath("storageInfo.maxArea").type(JsonFieldType.NUMBER).description("최대 공간"),
        fieldWithPath("resources.resourceId").type(JsonFieldType.STRING).description("자원(파일 또는 디렉토리)"),
        fieldWithPath("resources.parentId").type(JsonFieldType.STRING).description("상위 디렉토리의 아이디"),
        fieldWithPath("resources.isDirectory").type(JsonFieldType.BOOLEAN).description("디렉토리 여부"),
        fieldWithPath("resources.size").type(JsonFieldType.NUMBER).description("자원의 사이즈(용량)").optional(),
        fieldWithPath("resources.innerResources[]").type(JsonFieldType.ARRAY).description("내부 자원정보들").optional()
    );


    @BeforeEach
    void setUp() {
    }

//    @Test
//    void getRoot() {
//        String memberId = "u9u9jfjodf";
//        StorageInfo storageInfo = new StorageInfo("123hr", BigDecimal.valueOf(30.00D), BigDecimal.valueOf(100.00D));
//        ResourcesResponse resourcesResponse = new ResourcesResponse("1jjoijdof", "123hr", true, BigDecimal.ZERO, new ArrayList<>());
//        RootResponse rootResponse = new RootResponse(storageInfo, resourcesResponse);
//        Mono<RootResponse> response = Mono.just(rootResponse);
//        given(this.storageService.getStorageRoot(memberId))
//                .willReturn(response);
//
//        this.webTestClient.get()
//                .uri("/api/resources")
//                .header(HttpHeaders.AUTHORIZATION, memberId)
//                .header(HttpHeaders.ACCEPT, MediaType.APPLICATION_JSON_VALUE)
//                .header(HttpHeaders.CONTENT_TYPE, MediaType.APPLICATION_JSON_VALUE)
//                .exchange()
//
//                .expectStatus().isOk()
//                .expectBody()
//                .consumeWith(document("storage/get", ROOT_RESPONSE_FEILDS));
//
//
//    }
}

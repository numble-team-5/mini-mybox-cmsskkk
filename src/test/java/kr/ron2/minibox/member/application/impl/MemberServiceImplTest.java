package kr.ron2.minibox.member.application.impl;

import kr.ron2.minibox.member.application.MemberService;
import kr.ron2.minibox.member.domain.MemberMongoDBRepository;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.ActiveProfiles;
import org.springframework.test.context.DynamicPropertyRegistry;
import org.springframework.test.context.DynamicPropertySource;
import org.springframework.transaction.annotation.Transactional;
import org.testcontainers.containers.MongoDBContainer;

import static org.assertj.core.api.Assertions.assertThat;

@SpringBootTest
@Transactional
@ActiveProfiles("test")
class MemberServiceImplTest {

    private static final MongoDBContainer mongoDBContainer;

    static {
        mongoDBContainer = new MongoDBContainer("mongo:6.0").withReuse(true);
        mongoDBContainer.start();
    }
    @DynamicPropertySource
    public static void setMongoProperties(DynamicPropertyRegistry registry) {
        registry.add("spring.data.mongodb.uri", mongoDBContainer::getReplicaSetUrl);

    }


    @Autowired
    private MemberService memberService;

    @Autowired
    private MemberMongoDBRepository memberMongoDBRepository;

    @BeforeEach
    void setUp() {}

    @Test
    @DisplayName("member 저장 기본 테스트")
    void saveTest() {
        Long memberId = 1L;
        String name = "박두칠";
        String email = "cms05041@gmail.com";

        Long savedMemberId = memberService.save(memberId, name, email);

        assertThat(savedMemberId).isEqualTo(memberId);

    }
}

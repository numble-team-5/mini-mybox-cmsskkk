package kr.ron2.minibox.member.application.impl;

import kr.ron2.minibox.member.application.MemberService;
import kr.ron2.minibox.member.domain.MemberMongoDBRepository;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;

import static org.assertj.core.api.Assertions.assertThat;

@SpringBootTest
class MemberServiceImplTest {

    @Autowired
    private MemberService memberService;

    @Autowired
    private MemberMongoDBRepository memberMongoDBRepository;

    @BeforeEach
    void setUp() {
        memberMongoDBRepository.deleteAll();
    }

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

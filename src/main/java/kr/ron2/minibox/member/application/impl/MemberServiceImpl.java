package kr.ron2.minibox.member.application.impl;

import kr.ron2.minibox.member.application.MemberService;
import kr.ron2.minibox.member.domain.Member;
import kr.ron2.minibox.member.domain.MemberMongoDBRepository;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

@Service
@RequiredArgsConstructor
@Transactional(readOnly = true)
public class MemberServiceImpl implements MemberService {

    private final MemberMongoDBRepository memberMongoDBRepository;

    @Override
    @Transactional
    public Long save(Long id, String name, String email) {

        Member member = memberMongoDBRepository.save(new Member(id, name, email));
        return member.getId();
    }
}

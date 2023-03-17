package kr.ron2.minibox.member.domain;

import org.springframework.data.mongodb.repository.MongoRepository;

public interface MemberMongoDBRepository extends MongoRepository<Member, Long> {
}

package dev.hyein.springdatajpademo.repository;

import com.querydsl.jpa.impl.JPAQueryFactory;
import dev.hyein.springdatajpademo.entity.Member;
import dev.hyein.springdatajpademo.entity.QMember;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Repository;

@Repository
@RequiredArgsConstructor
public class MemberRepositoryCustomImpl implements MemberRepositoryCustom{
    private final JPAQueryFactory jpaQueryFactory;

    private static final QMember member = QMember.member;

    @Override
    public Member searchById(String id) {
        return jpaQueryFactory
                .selectFrom(member)
                .where(member.id.eq("1"))
                .fetchOne()
                ;
    }
}

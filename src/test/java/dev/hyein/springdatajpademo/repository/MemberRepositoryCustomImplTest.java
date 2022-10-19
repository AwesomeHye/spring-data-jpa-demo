package dev.hyein.springdatajpademo.repository;

import dev.hyein.springdatajpademo.entity.Member;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;

import static org.junit.jupiter.api.Assertions.*;

@SpringBootTest
class MemberRepositoryCustomImplTest {
    @Autowired
    MemberRepository memberRepository;

    @Test
    @DisplayName("id 로 Member 찾기")
    void findMemberById() {
        String id = "1";

        Member member = memberRepository.searchById(id);
        Assertions.assertNotNull(member);
        Assertions.assertEquals(id, member.getId());
    }
}
package dev.hyein.springdatajpademo.repository;

import dev.hyein.springdatajpademo.entity.Member;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.Optional;

public interface MemberRepository extends JpaRepository<Member, String>, MemberRepositoryCustom {
}

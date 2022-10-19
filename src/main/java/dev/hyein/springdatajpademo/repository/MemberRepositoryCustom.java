package dev.hyein.springdatajpademo.repository;

import dev.hyein.springdatajpademo.entity.Member;

public interface MemberRepositoryCustom {
    Member searchById(String id);
}

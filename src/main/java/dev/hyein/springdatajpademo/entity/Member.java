package dev.hyein.springdatajpademo.entity;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;

import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name = "MEMBER")
@NoArgsConstructor @AllArgsConstructor
@Getter
public class Member {
    @Id
    private String id;
    private String name;
    private Integer age;
}

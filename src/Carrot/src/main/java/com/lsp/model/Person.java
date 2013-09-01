package com.lsp.model;

import javax.persistence.EnumType;
import javax.persistence.Enumerated;

import org.springframework.roo.addon.javabean.RooJavaBean;
import org.springframework.roo.addon.jpa.entity.RooJpaEntity;
import org.springframework.roo.addon.json.RooJson;
import org.springframework.roo.addon.tostring.RooToString;

@RooJavaBean
@RooToString
@RooJpaEntity
@RooJson
public class Person {

    private int age;

    private String email;

    private String password;

    private String name;

    private String idCardNumber;

    @Enumerated(EnumType.STRING)
    private Sex sex;
}

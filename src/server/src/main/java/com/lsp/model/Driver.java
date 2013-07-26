package com.lsp.model;

import org.springframework.roo.addon.javabean.RooJavaBean;
import org.springframework.roo.addon.jpa.entity.RooJpaEntity;
import org.springframework.roo.addon.json.RooJson;
import org.springframework.roo.addon.tostring.RooToString;

@RooJpaEntity
@RooToString
@RooJavaBean
@RooJson
public class Driver {

    private String licence;
}

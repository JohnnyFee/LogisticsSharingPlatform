package com.jf.lsp.model.localtion;

import javax.persistence.ManyToOne;

import org.springframework.roo.addon.javabean.RooJavaBean;
import org.springframework.roo.addon.jpa.entity.RooJpaEntity;
import org.springframework.roo.addon.tostring.RooToString;

/**
 * 地址.
 */
@RooJavaBean
@RooToString
@RooJpaEntity
public class Location {
	/** 省. */
	@ManyToOne
	private Area privince;

	/** 市. */
	@ManyToOne
	private Area city;

	/** 县. */
	@ManyToOne
	private Area region;

	/** 街道. */
	private String street;
}

package com.lsp.model.transportation;

import org.springframework.roo.addon.javabean.RooJavaBean;
import org.springframework.roo.addon.jpa.entity.RooJpaEntity;
import org.springframework.roo.addon.tostring.RooToString;

/**
 * 货物提供商.
 * 
 * @author feiq
 */
@RooToString
@RooJpaEntity
@RooJavaBean
public class CommodityProvider {

	/** 公司名称. */
	private String companyName;

	/** 联系人. */
	private String contactName;

	/** 电话号码. */
	private String telephoneNumber;

	/** 手机号码. */
	private String mobilePhoneNumber;
}

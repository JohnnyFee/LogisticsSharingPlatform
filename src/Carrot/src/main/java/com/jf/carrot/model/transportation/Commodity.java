package com.jf.carrot.model.transportation;

import javax.persistence.ManyToOne;

import org.springframework.roo.addon.javabean.RooJavaBean;
import org.springframework.roo.addon.jpa.activerecord.RooJpaActiveRecord;
import org.springframework.roo.addon.json.RooJson;
import org.springframework.roo.addon.tostring.RooToString;

import com.jf.carrot.model.localtion.Location;

@RooJavaBean
@RooToString
@RooJpaActiveRecord
@RooJson
public class Commodity {
	private String name;

	/**
	 * 单位
	 */
	private String unit;

	/**
	 * 货物提供商
	 */
	@ManyToOne
	private CommodityProvider provider;

	/**
	 * 货物地址
	 */
	@ManyToOne
	private Location location;
}

package com.jf.lsp.model.transportation;

import javax.persistence.EnumType;
import javax.persistence.Enumerated;
import javax.persistence.ManyToOne;

import org.springframework.roo.addon.javabean.RooJavaBean;
import org.springframework.roo.addon.jpa.entity.RooJpaEntity;
import org.springframework.roo.addon.json.RooJson;
import org.springframework.roo.addon.tostring.RooToString;

import com.jf.lsp.model.Driver;

/**
 * 车辆信息.
 */
@RooJpaEntity
@RooToString
@RooJavaBean
@RooJson
public class Vehicle {
	/** 车辆长度. */
	private int length;

	/** 车辆状态. */
	@Enumerated(EnumType.STRING)
	private VehicleStatus status;

	/** 车牌号码. */
	private String plateNumber;

	/** 司机. */
	@ManyToOne
	private Driver driver;

	/** 车辆类型. */
	private VehicleType type;
}

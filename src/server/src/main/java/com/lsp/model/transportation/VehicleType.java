/*
 * 
 */
package com.lsp.model.transportation;

/**
 * 车辆类型.
 */
public enum VehicleType {

	/** 自卸车. */
	RollOffSkipLoader(0x01),
	/** 全挂车. */
	FullTrailer(0x02),

	/** 半挂车. */
	SemiTrailer(0x03),

	/** 单桥. */
	SingleBridge(0x04),

	/** 双桥. */
	DoubleBridge(0x05),

	/** 高栏. */
	HighFence(0x06),

	/** 五轮车. */
	FiveWheels(0x07),

	/** 后八轮. */
	EightWheelsInRear(0x08),

	/** 前四后八. */
	FourInFrontAndEightInRear(0x09),

	/** 前四后四. */
	FourInFrontAndFourInRear(0x10),

	/** 二拖三. */
	TowAndThree(0x11),

	/** 罐车. */
	Tanker(0x12),

	/** 平板车. */
	FlatPlatform(0x13),

	/** 保温车. */
	ThermosVan(0x14),

	/** 冷藏车. */
	RefrigeratedVan(0x15),

	/** 封闭车. */
	FullClosedCar(0x16),
	/** 半封闭车. */
	SemiClosedCar(0x17),

	/** 棉被车. */
	QuiltCar(0x18),

	/** 集装箱运输车. */
	LongWheelbaseTruck(0x19),

	/** 斯泰尔. */
	Steyr(0x20),

	/** 大篷车. */
	Caravan(0x21),
	/** 大货车. */
	HeavyTruck(0x20),

	/** 轻型货车. */
	LightTruck(0x21),

	/** 厢式货车. */
	Van(0x22);

	/** The value. */
	private int value;

	/**
	 * Instantiates a new vehicle type.
	 * 
	 * @param value
	 *            the value
	 */
	VehicleType(int value) {
		this.value = value;
	}

	public int getValue() {
		return value;
	}

}

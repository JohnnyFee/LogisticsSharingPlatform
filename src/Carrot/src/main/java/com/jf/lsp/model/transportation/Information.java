package com.jf.lsp.model.transportation;

import java.util.Date;

import javax.persistence.ManyToOne;
import javax.persistence.OneToOne;
import javax.persistence.Temporal;
import javax.persistence.TemporalType;

import org.springframework.format.annotation.DateTimeFormat;
import org.springframework.roo.addon.javabean.RooJavaBean;
import org.springframework.roo.addon.jpa.entity.RooJpaEntity;
import org.springframework.roo.addon.json.RooJson;
import org.springframework.roo.addon.tostring.RooToString;

import com.jf.lsp.model.localtion.Location;

/**
 * The Class InformationTemplate.
 */
@RooJavaBean
@RooToString
@RooJpaEntity
@RooJson
public class Information {

	/** 从地点. */
	@ManyToOne
	private Location fromArea;

	/** 到地点. */
	@ManyToOne
	private Location toArea;

	/** 货物. */
	@OneToOne
	private Commodity commodity;

	/** 货物质量. */
	private int commodityQuantity;

	/** 车辆长度. */
	private int vehicleLength;

	/** 车辆类型. */
	private String vehicleType;

	/** 运费. */
	private double freight;

	/** 运费计算单位. */
	private String freightUnit;

	/** 运费说明. */
	private String freightComment;

	/** 车辆数量. */
	private int vehicleCount;

	/** 信息内容. */
	private String content;

	/** 联系电话. */
	private String telephoneNumber;

	/** 手机电话号码. */
	private String mobilePhoneNumber;

	/** 创建日期. */
	@Temporal(TemporalType.DATE)
	@DateTimeFormat(style = "S-")
	private Date createDate;

	/** 最后修改时间. */
	@Temporal(TemporalType.DATE)
	@DateTimeFormat(style = "S-")
	private Date lastModifyDate;

	/** 信息状态. */
	private InformationStatus status;
}

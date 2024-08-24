package com.entity;

import com.baomidou.mybatisplus.annotations.TableId;
import com.baomidou.mybatisplus.annotations.TableName;
import javax.validation.constraints.NotBlank;
import javax.validation.constraints.NotEmpty;
import javax.validation.constraints.NotNull;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import java.lang.reflect.InvocationTargetException;

import java.io.Serializable;
import java.util.Date;
import java.util.List;

import org.springframework.format.annotation.DateTimeFormat;
import com.fasterxml.jackson.annotation.JsonFormat;
import org.apache.commons.beanutils.BeanUtils;
import com.baomidou.mybatisplus.annotations.TableField;
import com.baomidou.mybatisplus.enums.FieldFill;
import com.baomidou.mybatisplus.enums.IdType;


/**
 * 方案详情
 * 数据库通用操作实体类（普通增删改查）
 * @author 
 * @email 
 * @date 2024-04-16 20:26:50
 */
@TableName("fanganxiangqing")
public class FanganxiangqingEntity<T> implements Serializable {
	private static final long serialVersionUID = 1L;


	public FanganxiangqingEntity() {
		
	}
	
	public FanganxiangqingEntity(T t) {
		try {
			BeanUtils.copyProperties(this, t);
		} catch (IllegalAccessException | InvocationTargetException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}
	
	/**
	 * 主键id
	 */
    @TableId(type = IdType.AUTO)
    private Long id;
	/**
	 * 服务名称
	 */
					
	private String fuwumingcheng;
	
	/**
	 * 方案类型
	 */
					
	private String fanganleixing;
	
	/**
	 * 美食推荐
	 */
					
	private String meishituijian;
	
	/**
	 * 酒店推荐
	 */
					
	private String jiudiantuijian;
	
	/**
	 * 包车服务
	 */
					
	private String baochefuwu;
	
	/**
	 * 购买门票
	 */
					
	private String goumaimenpiao;
	
	/**
	 * 方案图片
	 */
					
	private String fangantupian;
	
	/**
	 * 用户账号
	 */
					
	private String yonghuzhanghao;
	
	/**
	 * 用户姓名
	 */
					
	private String yonghuxingming;
	
	/**
	 * 跨表用户id
	 */
					
	private Long crossuserid;
	
	/**
	 * 跨表主键id
	 */
					
	private Long crossrefid;
	
	
	@JsonFormat(locale="zh", timezone="GMT+8", pattern="yyyy-MM-dd HH:mm:ss")
	@DateTimeFormat
	private Date addtime;

	public Date getAddtime() {
		return addtime;
	}
	public void setAddtime(Date addtime) {
		this.addtime = addtime;
	}

	public Long getId() {
		return id;
	}

	public void setId(Long id) {
		this.id = id;
	}
	/**
	 * 设置：服务名称
	 */
	public void setFuwumingcheng(String fuwumingcheng) {
		this.fuwumingcheng = fuwumingcheng;
	}
	/**
	 * 获取：服务名称
	 */
	public String getFuwumingcheng() {
		return fuwumingcheng;
	}
	/**
	 * 设置：方案类型
	 */
	public void setFanganleixing(String fanganleixing) {
		this.fanganleixing = fanganleixing;
	}
	/**
	 * 获取：方案类型
	 */
	public String getFanganleixing() {
		return fanganleixing;
	}
	/**
	 * 设置：美食推荐
	 */
	public void setMeishituijian(String meishituijian) {
		this.meishituijian = meishituijian;
	}
	/**
	 * 获取：美食推荐
	 */
	public String getMeishituijian() {
		return meishituijian;
	}
	/**
	 * 设置：酒店推荐
	 */
	public void setJiudiantuijian(String jiudiantuijian) {
		this.jiudiantuijian = jiudiantuijian;
	}
	/**
	 * 获取：酒店推荐
	 */
	public String getJiudiantuijian() {
		return jiudiantuijian;
	}
	/**
	 * 设置：包车服务
	 */
	public void setBaochefuwu(String baochefuwu) {
		this.baochefuwu = baochefuwu;
	}
	/**
	 * 获取：包车服务
	 */
	public String getBaochefuwu() {
		return baochefuwu;
	}
	/**
	 * 设置：购买门票
	 */
	public void setGoumaimenpiao(String goumaimenpiao) {
		this.goumaimenpiao = goumaimenpiao;
	}
	/**
	 * 获取：购买门票
	 */
	public String getGoumaimenpiao() {
		return goumaimenpiao;
	}
	/**
	 * 设置：方案图片
	 */
	public void setFangantupian(String fangantupian) {
		this.fangantupian = fangantupian;
	}
	/**
	 * 获取：方案图片
	 */
	public String getFangantupian() {
		return fangantupian;
	}
	/**
	 * 设置：用户账号
	 */
	public void setYonghuzhanghao(String yonghuzhanghao) {
		this.yonghuzhanghao = yonghuzhanghao;
	}
	/**
	 * 获取：用户账号
	 */
	public String getYonghuzhanghao() {
		return yonghuzhanghao;
	}
	/**
	 * 设置：用户姓名
	 */
	public void setYonghuxingming(String yonghuxingming) {
		this.yonghuxingming = yonghuxingming;
	}
	/**
	 * 获取：用户姓名
	 */
	public String getYonghuxingming() {
		return yonghuxingming;
	}
	/**
	 * 设置：跨表用户id
	 */
	public void setCrossuserid(Long crossuserid) {
		this.crossuserid = crossuserid;
	}
	/**
	 * 获取：跨表用户id
	 */
	public Long getCrossuserid() {
		return crossuserid;
	}
	/**
	 * 设置：跨表主键id
	 */
	public void setCrossrefid(Long crossrefid) {
		this.crossrefid = crossrefid;
	}
	/**
	 * 获取：跨表主键id
	 */
	public Long getCrossrefid() {
		return crossrefid;
	}

}

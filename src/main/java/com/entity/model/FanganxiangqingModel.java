package com.entity.model;

import com.entity.FanganxiangqingEntity;

import com.baomidou.mybatisplus.annotations.TableName;
import java.util.Date;
import org.springframework.format.annotation.DateTimeFormat;

import com.fasterxml.jackson.annotation.JsonFormat;
import java.io.Serializable;
 

/**
 * 方案详情
 * 接收传参的实体类  
 *（实际开发中配合移动端接口开发手动去掉些没用的字段， 后端一般用entity就够用了） 
 * 取自ModelAndView 的model名称
 * @author 
 * @email 
 * @date 2024-04-16 20:26:50
 */
public class FanganxiangqingModel  implements Serializable {
	private static final long serialVersionUID = 1L;

	 			
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

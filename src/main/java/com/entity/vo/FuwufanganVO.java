package com.entity.vo;

import com.entity.FuwufanganEntity;

import com.baomidou.mybatisplus.annotations.TableName;
import java.util.Date;
import org.springframework.format.annotation.DateTimeFormat;

import com.fasterxml.jackson.annotation.JsonFormat;
import java.io.Serializable;
 

/**
 * 服务方案
 * @author 
 * @email 
 * @date 2024-04-16 20:26:49
 */
public class FuwufanganVO  implements Serializable {
	private static final long serialVersionUID = 1L;

	 			
	/**
	 * 方案类型
	 */
	
	private String fanganleixing;
		
	/**
	 * 方案图片
	 */
	
	private String fangantupian;
		
	/**
	 * 起点
	 */
	
	private String qidian;
		
	/**
	 * 途径路段
	 */
	
	private String tujingluduan;
		
	/**
	 * 终点
	 */
	
	private String zhongdian;
		
	/**
	 * 简介
	 */
	
	private String jianjie;
		
	/**
	 * 价格
	 */
	
	private Double jiage;
		
	/**
	 * 评论数
	 */
	
	private Integer discussnum;
		
	/**
	 * 收藏数
	 */
	
	private Integer storeupnum;
				
	
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
	 * 设置：起点
	 */
	 
	public void setQidian(String qidian) {
		this.qidian = qidian;
	}
	
	/**
	 * 获取：起点
	 */
	public String getQidian() {
		return qidian;
	}
				
	
	/**
	 * 设置：途径路段
	 */
	 
	public void setTujingluduan(String tujingluduan) {
		this.tujingluduan = tujingluduan;
	}
	
	/**
	 * 获取：途径路段
	 */
	public String getTujingluduan() {
		return tujingluduan;
	}
				
	
	/**
	 * 设置：终点
	 */
	 
	public void setZhongdian(String zhongdian) {
		this.zhongdian = zhongdian;
	}
	
	/**
	 * 获取：终点
	 */
	public String getZhongdian() {
		return zhongdian;
	}
				
	
	/**
	 * 设置：简介
	 */
	 
	public void setJianjie(String jianjie) {
		this.jianjie = jianjie;
	}
	
	/**
	 * 获取：简介
	 */
	public String getJianjie() {
		return jianjie;
	}
				
	
	/**
	 * 设置：价格
	 */
	 
	public void setJiage(Double jiage) {
		this.jiage = jiage;
	}
	
	/**
	 * 获取：价格
	 */
	public Double getJiage() {
		return jiage;
	}
				
	
	/**
	 * 设置：评论数
	 */
	 
	public void setDiscussnum(Integer discussnum) {
		this.discussnum = discussnum;
	}
	
	/**
	 * 获取：评论数
	 */
	public Integer getDiscussnum() {
		return discussnum;
	}
				
	
	/**
	 * 设置：收藏数
	 */
	 
	public void setStoreupnum(Integer storeupnum) {
		this.storeupnum = storeupnum;
	}
	
	/**
	 * 获取：收藏数
	 */
	public Integer getStoreupnum() {
		return storeupnum;
	}
			
}

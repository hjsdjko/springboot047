package com.entity.model;

import com.entity.FuwuyudingEntity;

import com.baomidou.mybatisplus.annotations.TableName;
import java.util.Date;
import org.springframework.format.annotation.DateTimeFormat;

import com.fasterxml.jackson.annotation.JsonFormat;
import java.io.Serializable;
 

/**
 * 服务预订
 * 接收传参的实体类  
 *（实际开发中配合移动端接口开发手动去掉些没用的字段， 后端一般用entity就够用了） 
 * 取自ModelAndView 的model名称
 * @author 
 * @email 
 * @date 2024-04-16 20:26:49
 */
public class FuwuyudingModel  implements Serializable {
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
	 * 价格
	 */
	
	private Double jiage;
		
	/**
	 * 用户账号
	 */
	
	private String yonghuzhanghao;
		
	/**
	 * 用户姓名
	 */
	
	private String yonghuxingming;
		
	/**
	 * 用户手机
	 */
	
	private String yonghushouji;
		
	/**
	 * 优惠折扣
	 */
	
	private Double youhuizhekou;
		
	/**
	 * 计算费用
	 */
	
	private String jisuanfeiyong;
		
	/**
	 * 下单日期
	 */
		
	@JsonFormat(locale="zh", timezone="GMT+8", pattern="yyyy-MM-dd HH:mm:ss")
	@DateTimeFormat 
	private Date xiadanriqi;
		
	/**
	 * 备注
	 */
	
	private String beizhu;
		
	/**
	 * 是否审核
	 */
	
	private String sfsh;
		
	/**
	 * 审核回复
	 */
	
	private String shhf;
		
	/**
	 * 是否支付
	 */
	
	private String ispay;
				
	
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
	 * 设置：用户手机
	 */
	 
	public void setYonghushouji(String yonghushouji) {
		this.yonghushouji = yonghushouji;
	}
	
	/**
	 * 获取：用户手机
	 */
	public String getYonghushouji() {
		return yonghushouji;
	}
				
	
	/**
	 * 设置：优惠折扣
	 */
	 
	public void setYouhuizhekou(Double youhuizhekou) {
		this.youhuizhekou = youhuizhekou;
	}
	
	/**
	 * 获取：优惠折扣
	 */
	public Double getYouhuizhekou() {
		return youhuizhekou;
	}
				
	
	/**
	 * 设置：计算费用
	 */
	 
	public void setJisuanfeiyong(String jisuanfeiyong) {
		this.jisuanfeiyong = jisuanfeiyong;
	}
	
	/**
	 * 获取：计算费用
	 */
	public String getJisuanfeiyong() {
		return jisuanfeiyong;
	}
				
	
	/**
	 * 设置：下单日期
	 */
	 
	public void setXiadanriqi(Date xiadanriqi) {
		this.xiadanriqi = xiadanriqi;
	}
	
	/**
	 * 获取：下单日期
	 */
	public Date getXiadanriqi() {
		return xiadanriqi;
	}
				
	
	/**
	 * 设置：备注
	 */
	 
	public void setBeizhu(String beizhu) {
		this.beizhu = beizhu;
	}
	
	/**
	 * 获取：备注
	 */
	public String getBeizhu() {
		return beizhu;
	}
				
	
	/**
	 * 设置：是否审核
	 */
	 
	public void setSfsh(String sfsh) {
		this.sfsh = sfsh;
	}
	
	/**
	 * 获取：是否审核
	 */
	public String getSfsh() {
		return sfsh;
	}
				
	
	/**
	 * 设置：审核回复
	 */
	 
	public void setShhf(String shhf) {
		this.shhf = shhf;
	}
	
	/**
	 * 获取：审核回复
	 */
	public String getShhf() {
		return shhf;
	}
				
	
	/**
	 * 设置：是否支付
	 */
	 
	public void setIspay(String ispay) {
		this.ispay = ispay;
	}
	
	/**
	 * 获取：是否支付
	 */
	public String getIspay() {
		return ispay;
	}
			
}

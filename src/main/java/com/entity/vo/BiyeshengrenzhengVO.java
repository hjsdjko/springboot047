package com.entity.vo;

import com.entity.BiyeshengrenzhengEntity;

import com.baomidou.mybatisplus.annotations.TableName;
import java.util.Date;
import org.springframework.format.annotation.DateTimeFormat;

import com.fasterxml.jackson.annotation.JsonFormat;
import java.io.Serializable;
 

/**
 * 毕业生认证
 * @author 
 * @email 
 * @date 2024-04-16 20:26:49
 */
public class BiyeshengrenzhengVO  implements Serializable {
	private static final long serialVersionUID = 1L;

	 			
	/**
	 * 用户姓名
	 */
	
	private String yonghuxingming;
		
	/**
	 * 毕业学校
	 */
	
	private String biyexuexiao;
		
	/**
	 * 学生证
	 */
	
	private String xueshengzheng;
		
	/**
	 * 学号
	 */
	
	private String xuehao;
		
	/**
	 * 是否审核
	 */
	
	private String sfsh;
		
	/**
	 * 审核回复
	 */
	
	private String shhf;
				
	
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
	 * 设置：毕业学校
	 */
	 
	public void setBiyexuexiao(String biyexuexiao) {
		this.biyexuexiao = biyexuexiao;
	}
	
	/**
	 * 获取：毕业学校
	 */
	public String getBiyexuexiao() {
		return biyexuexiao;
	}
				
	
	/**
	 * 设置：学生证
	 */
	 
	public void setXueshengzheng(String xueshengzheng) {
		this.xueshengzheng = xueshengzheng;
	}
	
	/**
	 * 获取：学生证
	 */
	public String getXueshengzheng() {
		return xueshengzheng;
	}
				
	
	/**
	 * 设置：学号
	 */
	 
	public void setXuehao(String xuehao) {
		this.xuehao = xuehao;
	}
	
	/**
	 * 获取：学号
	 */
	public String getXuehao() {
		return xuehao;
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
			
}

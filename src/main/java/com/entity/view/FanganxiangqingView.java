package com.entity.view;

import com.entity.FanganxiangqingEntity;

import com.baomidou.mybatisplus.annotations.TableName;
import org.apache.commons.beanutils.BeanUtils;
import java.lang.reflect.InvocationTargetException;
import java.math.BigDecimal;

import java.io.Serializable;
import com.utils.EncryptUtil;
 

/**
 * 方案详情
 * 后端返回视图实体辅助类   
 * （通常后端关联的表或者自定义的字段需要返回使用）
 * @author 
 * @email 
 * @date 2024-04-16 20:26:50
 */
@TableName("fanganxiangqing")
public class FanganxiangqingView  extends FanganxiangqingEntity implements Serializable {
	private static final long serialVersionUID = 1L;

	public FanganxiangqingView(){
	}
 
 	public FanganxiangqingView(FanganxiangqingEntity fanganxiangqingEntity){
 	try {
			BeanUtils.copyProperties(this, fanganxiangqingEntity);
		} catch (IllegalAccessException | InvocationTargetException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
 		
	}


}

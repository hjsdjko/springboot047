package com.entity.view;

import com.entity.BiyeshengrenzhengEntity;

import com.baomidou.mybatisplus.annotations.TableName;
import org.apache.commons.beanutils.BeanUtils;
import java.lang.reflect.InvocationTargetException;
import java.math.BigDecimal;

import java.io.Serializable;
import com.utils.EncryptUtil;
 

/**
 * 毕业生认证
 * 后端返回视图实体辅助类   
 * （通常后端关联的表或者自定义的字段需要返回使用）
 * @author 
 * @email 
 * @date 2024-04-16 20:26:49
 */
@TableName("biyeshengrenzheng")
public class BiyeshengrenzhengView  extends BiyeshengrenzhengEntity implements Serializable {
	private static final long serialVersionUID = 1L;

	public BiyeshengrenzhengView(){
	}
 
 	public BiyeshengrenzhengView(BiyeshengrenzhengEntity biyeshengrenzhengEntity){
 	try {
			BeanUtils.copyProperties(this, biyeshengrenzhengEntity);
		} catch (IllegalAccessException | InvocationTargetException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
 		
	}


}

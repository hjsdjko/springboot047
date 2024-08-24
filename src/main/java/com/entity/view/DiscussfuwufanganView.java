package com.entity.view;

import com.entity.DiscussfuwufanganEntity;

import com.baomidou.mybatisplus.annotations.TableName;
import org.apache.commons.beanutils.BeanUtils;
import java.lang.reflect.InvocationTargetException;
import java.math.BigDecimal;

import java.io.Serializable;
import com.utils.EncryptUtil;
 

/**
 * 服务方案评论表
 * 后端返回视图实体辅助类   
 * （通常后端关联的表或者自定义的字段需要返回使用）
 * @author 
 * @email 
 * @date 2024-04-16 20:26:50
 */
@TableName("discussfuwufangan")
public class DiscussfuwufanganView  extends DiscussfuwufanganEntity implements Serializable {
	private static final long serialVersionUID = 1L;

	public DiscussfuwufanganView(){
	}
 
 	public DiscussfuwufanganView(DiscussfuwufanganEntity discussfuwufanganEntity){
 	try {
			BeanUtils.copyProperties(this, discussfuwufanganEntity);
		} catch (IllegalAccessException | InvocationTargetException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
 		
	}


}

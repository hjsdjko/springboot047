package com.service;

import com.baomidou.mybatisplus.mapper.Wrapper;
import com.baomidou.mybatisplus.service.IService;
import com.utils.PageUtils;
import com.entity.FuwuyudingEntity;
import java.util.List;
import java.util.Map;
import com.entity.vo.FuwuyudingVO;
import org.apache.ibatis.annotations.Param;
import com.entity.view.FuwuyudingView;


/**
 * 服务预订
 *
 * @author 
 * @email 
 * @date 2024-04-16 20:26:49
 */
public interface FuwuyudingService extends IService<FuwuyudingEntity> {

    PageUtils queryPage(Map<String, Object> params);
    
   	List<FuwuyudingVO> selectListVO(Wrapper<FuwuyudingEntity> wrapper);
   	
   	FuwuyudingVO selectVO(@Param("ew") Wrapper<FuwuyudingEntity> wrapper);
   	
   	List<FuwuyudingView> selectListView(Wrapper<FuwuyudingEntity> wrapper);
   	
   	FuwuyudingView selectView(@Param("ew") Wrapper<FuwuyudingEntity> wrapper);
   	
   	PageUtils queryPage(Map<String, Object> params,Wrapper<FuwuyudingEntity> wrapper);

   	

}


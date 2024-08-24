package com.service;

import com.baomidou.mybatisplus.mapper.Wrapper;
import com.baomidou.mybatisplus.service.IService;
import com.utils.PageUtils;
import com.entity.FanganleixingEntity;
import java.util.List;
import java.util.Map;
import com.entity.vo.FanganleixingVO;
import org.apache.ibatis.annotations.Param;
import com.entity.view.FanganleixingView;


/**
 * 方案类型
 *
 * @author 
 * @email 
 * @date 2024-04-16 20:26:49
 */
public interface FanganleixingService extends IService<FanganleixingEntity> {

    PageUtils queryPage(Map<String, Object> params);
    
   	List<FanganleixingVO> selectListVO(Wrapper<FanganleixingEntity> wrapper);
   	
   	FanganleixingVO selectVO(@Param("ew") Wrapper<FanganleixingEntity> wrapper);
   	
   	List<FanganleixingView> selectListView(Wrapper<FanganleixingEntity> wrapper);
   	
   	FanganleixingView selectView(@Param("ew") Wrapper<FanganleixingEntity> wrapper);
   	
   	PageUtils queryPage(Map<String, Object> params,Wrapper<FanganleixingEntity> wrapper);

   	

}


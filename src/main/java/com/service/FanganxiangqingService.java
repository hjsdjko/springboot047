package com.service;

import com.baomidou.mybatisplus.mapper.Wrapper;
import com.baomidou.mybatisplus.service.IService;
import com.utils.PageUtils;
import com.entity.FanganxiangqingEntity;
import java.util.List;
import java.util.Map;
import com.entity.vo.FanganxiangqingVO;
import org.apache.ibatis.annotations.Param;
import com.entity.view.FanganxiangqingView;


/**
 * 方案详情
 *
 * @author 
 * @email 
 * @date 2024-04-16 20:26:50
 */
public interface FanganxiangqingService extends IService<FanganxiangqingEntity> {

    PageUtils queryPage(Map<String, Object> params);
    
   	List<FanganxiangqingVO> selectListVO(Wrapper<FanganxiangqingEntity> wrapper);
   	
   	FanganxiangqingVO selectVO(@Param("ew") Wrapper<FanganxiangqingEntity> wrapper);
   	
   	List<FanganxiangqingView> selectListView(Wrapper<FanganxiangqingEntity> wrapper);
   	
   	FanganxiangqingView selectView(@Param("ew") Wrapper<FanganxiangqingEntity> wrapper);
   	
   	PageUtils queryPage(Map<String, Object> params,Wrapper<FanganxiangqingEntity> wrapper);

   	

}


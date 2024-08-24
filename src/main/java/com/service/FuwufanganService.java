package com.service;

import com.baomidou.mybatisplus.mapper.Wrapper;
import com.baomidou.mybatisplus.service.IService;
import com.utils.PageUtils;
import com.entity.FuwufanganEntity;
import java.util.List;
import java.util.Map;
import com.entity.vo.FuwufanganVO;
import org.apache.ibatis.annotations.Param;
import com.entity.view.FuwufanganView;


/**
 * 服务方案
 *
 * @author 
 * @email 
 * @date 2024-04-16 20:26:49
 */
public interface FuwufanganService extends IService<FuwufanganEntity> {

    PageUtils queryPage(Map<String, Object> params);
    
   	List<FuwufanganVO> selectListVO(Wrapper<FuwufanganEntity> wrapper);
   	
   	FuwufanganVO selectVO(@Param("ew") Wrapper<FuwufanganEntity> wrapper);
   	
   	List<FuwufanganView> selectListView(Wrapper<FuwufanganEntity> wrapper);
   	
   	FuwufanganView selectView(@Param("ew") Wrapper<FuwufanganEntity> wrapper);
   	
   	PageUtils queryPage(Map<String, Object> params,Wrapper<FuwufanganEntity> wrapper);

   	

}


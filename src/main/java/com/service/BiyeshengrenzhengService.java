package com.service;

import com.baomidou.mybatisplus.mapper.Wrapper;
import com.baomidou.mybatisplus.service.IService;
import com.utils.PageUtils;
import com.entity.BiyeshengrenzhengEntity;
import java.util.List;
import java.util.Map;
import com.entity.vo.BiyeshengrenzhengVO;
import org.apache.ibatis.annotations.Param;
import com.entity.view.BiyeshengrenzhengView;


/**
 * 毕业生认证
 *
 * @author 
 * @email 
 * @date 2024-04-16 20:26:49
 */
public interface BiyeshengrenzhengService extends IService<BiyeshengrenzhengEntity> {

    PageUtils queryPage(Map<String, Object> params);
    
   	List<BiyeshengrenzhengVO> selectListVO(Wrapper<BiyeshengrenzhengEntity> wrapper);
   	
   	BiyeshengrenzhengVO selectVO(@Param("ew") Wrapper<BiyeshengrenzhengEntity> wrapper);
   	
   	List<BiyeshengrenzhengView> selectListView(Wrapper<BiyeshengrenzhengEntity> wrapper);
   	
   	BiyeshengrenzhengView selectView(@Param("ew") Wrapper<BiyeshengrenzhengEntity> wrapper);
   	
   	PageUtils queryPage(Map<String, Object> params,Wrapper<BiyeshengrenzhengEntity> wrapper);

   	

}


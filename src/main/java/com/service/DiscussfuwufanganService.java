package com.service;

import com.baomidou.mybatisplus.mapper.Wrapper;
import com.baomidou.mybatisplus.service.IService;
import com.utils.PageUtils;
import com.entity.DiscussfuwufanganEntity;
import java.util.List;
import java.util.Map;
import com.entity.vo.DiscussfuwufanganVO;
import org.apache.ibatis.annotations.Param;
import com.entity.view.DiscussfuwufanganView;


/**
 * 服务方案评论表
 *
 * @author 
 * @email 
 * @date 2024-04-16 20:26:50
 */
public interface DiscussfuwufanganService extends IService<DiscussfuwufanganEntity> {

    PageUtils queryPage(Map<String, Object> params);
    
   	List<DiscussfuwufanganVO> selectListVO(Wrapper<DiscussfuwufanganEntity> wrapper);
   	
   	DiscussfuwufanganVO selectVO(@Param("ew") Wrapper<DiscussfuwufanganEntity> wrapper);
   	
   	List<DiscussfuwufanganView> selectListView(Wrapper<DiscussfuwufanganEntity> wrapper);
   	
   	DiscussfuwufanganView selectView(@Param("ew") Wrapper<DiscussfuwufanganEntity> wrapper);
   	
   	PageUtils queryPage(Map<String, Object> params,Wrapper<DiscussfuwufanganEntity> wrapper);

   	

}


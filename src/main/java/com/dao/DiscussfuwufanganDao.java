package com.dao;

import com.entity.DiscussfuwufanganEntity;
import com.baomidou.mybatisplus.mapper.BaseMapper;
import java.util.List;
import java.util.Map;
import com.baomidou.mybatisplus.mapper.Wrapper;
import com.baomidou.mybatisplus.plugins.pagination.Pagination;

import org.apache.ibatis.annotations.Param;
import com.entity.vo.DiscussfuwufanganVO;
import com.entity.view.DiscussfuwufanganView;


/**
 * 服务方案评论表
 * 
 * @author 
 * @email 
 * @date 2024-04-16 20:26:50
 */
public interface DiscussfuwufanganDao extends BaseMapper<DiscussfuwufanganEntity> {
	
	List<DiscussfuwufanganVO> selectListVO(@Param("ew") Wrapper<DiscussfuwufanganEntity> wrapper);
	
	DiscussfuwufanganVO selectVO(@Param("ew") Wrapper<DiscussfuwufanganEntity> wrapper);
	
	List<DiscussfuwufanganView> selectListView(@Param("ew") Wrapper<DiscussfuwufanganEntity> wrapper);

	List<DiscussfuwufanganView> selectListView(Pagination page,@Param("ew") Wrapper<DiscussfuwufanganEntity> wrapper);

	
	DiscussfuwufanganView selectView(@Param("ew") Wrapper<DiscussfuwufanganEntity> wrapper);
	

}

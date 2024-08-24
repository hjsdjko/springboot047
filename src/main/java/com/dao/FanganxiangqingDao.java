package com.dao;

import com.entity.FanganxiangqingEntity;
import com.baomidou.mybatisplus.mapper.BaseMapper;
import java.util.List;
import java.util.Map;
import com.baomidou.mybatisplus.mapper.Wrapper;
import com.baomidou.mybatisplus.plugins.pagination.Pagination;

import org.apache.ibatis.annotations.Param;
import com.entity.vo.FanganxiangqingVO;
import com.entity.view.FanganxiangqingView;


/**
 * 方案详情
 * 
 * @author 
 * @email 
 * @date 2024-04-16 20:26:50
 */
public interface FanganxiangqingDao extends BaseMapper<FanganxiangqingEntity> {
	
	List<FanganxiangqingVO> selectListVO(@Param("ew") Wrapper<FanganxiangqingEntity> wrapper);
	
	FanganxiangqingVO selectVO(@Param("ew") Wrapper<FanganxiangqingEntity> wrapper);
	
	List<FanganxiangqingView> selectListView(@Param("ew") Wrapper<FanganxiangqingEntity> wrapper);

	List<FanganxiangqingView> selectListView(Pagination page,@Param("ew") Wrapper<FanganxiangqingEntity> wrapper);

	
	FanganxiangqingView selectView(@Param("ew") Wrapper<FanganxiangqingEntity> wrapper);
	

}

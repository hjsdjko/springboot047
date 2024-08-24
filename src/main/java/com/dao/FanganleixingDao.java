package com.dao;

import com.entity.FanganleixingEntity;
import com.baomidou.mybatisplus.mapper.BaseMapper;
import java.util.List;
import java.util.Map;
import com.baomidou.mybatisplus.mapper.Wrapper;
import com.baomidou.mybatisplus.plugins.pagination.Pagination;

import org.apache.ibatis.annotations.Param;
import com.entity.vo.FanganleixingVO;
import com.entity.view.FanganleixingView;


/**
 * 方案类型
 * 
 * @author 
 * @email 
 * @date 2024-04-16 20:26:49
 */
public interface FanganleixingDao extends BaseMapper<FanganleixingEntity> {
	
	List<FanganleixingVO> selectListVO(@Param("ew") Wrapper<FanganleixingEntity> wrapper);
	
	FanganleixingVO selectVO(@Param("ew") Wrapper<FanganleixingEntity> wrapper);
	
	List<FanganleixingView> selectListView(@Param("ew") Wrapper<FanganleixingEntity> wrapper);

	List<FanganleixingView> selectListView(Pagination page,@Param("ew") Wrapper<FanganleixingEntity> wrapper);

	
	FanganleixingView selectView(@Param("ew") Wrapper<FanganleixingEntity> wrapper);
	

}

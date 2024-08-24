package com.dao;

import com.entity.FuwuyudingEntity;
import com.baomidou.mybatisplus.mapper.BaseMapper;
import java.util.List;
import java.util.Map;
import com.baomidou.mybatisplus.mapper.Wrapper;
import com.baomidou.mybatisplus.plugins.pagination.Pagination;

import org.apache.ibatis.annotations.Param;
import com.entity.vo.FuwuyudingVO;
import com.entity.view.FuwuyudingView;


/**
 * 服务预订
 * 
 * @author 
 * @email 
 * @date 2024-04-16 20:26:49
 */
public interface FuwuyudingDao extends BaseMapper<FuwuyudingEntity> {
	
	List<FuwuyudingVO> selectListVO(@Param("ew") Wrapper<FuwuyudingEntity> wrapper);
	
	FuwuyudingVO selectVO(@Param("ew") Wrapper<FuwuyudingEntity> wrapper);
	
	List<FuwuyudingView> selectListView(@Param("ew") Wrapper<FuwuyudingEntity> wrapper);

	List<FuwuyudingView> selectListView(Pagination page,@Param("ew") Wrapper<FuwuyudingEntity> wrapper);

	
	FuwuyudingView selectView(@Param("ew") Wrapper<FuwuyudingEntity> wrapper);
	

}

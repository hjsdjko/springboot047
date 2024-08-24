package com.dao;

import com.entity.FuwufanganEntity;
import com.baomidou.mybatisplus.mapper.BaseMapper;
import java.util.List;
import java.util.Map;
import com.baomidou.mybatisplus.mapper.Wrapper;
import com.baomidou.mybatisplus.plugins.pagination.Pagination;

import org.apache.ibatis.annotations.Param;
import com.entity.vo.FuwufanganVO;
import com.entity.view.FuwufanganView;


/**
 * 服务方案
 * 
 * @author 
 * @email 
 * @date 2024-04-16 20:26:49
 */
public interface FuwufanganDao extends BaseMapper<FuwufanganEntity> {
	
	List<FuwufanganVO> selectListVO(@Param("ew") Wrapper<FuwufanganEntity> wrapper);
	
	FuwufanganVO selectVO(@Param("ew") Wrapper<FuwufanganEntity> wrapper);
	
	List<FuwufanganView> selectListView(@Param("ew") Wrapper<FuwufanganEntity> wrapper);

	List<FuwufanganView> selectListView(Pagination page,@Param("ew") Wrapper<FuwufanganEntity> wrapper);

	
	FuwufanganView selectView(@Param("ew") Wrapper<FuwufanganEntity> wrapper);
	

}

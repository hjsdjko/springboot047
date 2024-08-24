package com.dao;

import com.entity.BiyeshengrenzhengEntity;
import com.baomidou.mybatisplus.mapper.BaseMapper;
import java.util.List;
import java.util.Map;
import com.baomidou.mybatisplus.mapper.Wrapper;
import com.baomidou.mybatisplus.plugins.pagination.Pagination;

import org.apache.ibatis.annotations.Param;
import com.entity.vo.BiyeshengrenzhengVO;
import com.entity.view.BiyeshengrenzhengView;


/**
 * 毕业生认证
 * 
 * @author 
 * @email 
 * @date 2024-04-16 20:26:49
 */
public interface BiyeshengrenzhengDao extends BaseMapper<BiyeshengrenzhengEntity> {
	
	List<BiyeshengrenzhengVO> selectListVO(@Param("ew") Wrapper<BiyeshengrenzhengEntity> wrapper);
	
	BiyeshengrenzhengVO selectVO(@Param("ew") Wrapper<BiyeshengrenzhengEntity> wrapper);
	
	List<BiyeshengrenzhengView> selectListView(@Param("ew") Wrapper<BiyeshengrenzhengEntity> wrapper);

	List<BiyeshengrenzhengView> selectListView(Pagination page,@Param("ew") Wrapper<BiyeshengrenzhengEntity> wrapper);

	
	BiyeshengrenzhengView selectView(@Param("ew") Wrapper<BiyeshengrenzhengEntity> wrapper);
	

}

package com.service.impl;

import org.springframework.stereotype.Service;
import java.util.Map;
import java.util.List;

import com.baomidou.mybatisplus.mapper.Wrapper;
import com.baomidou.mybatisplus.mapper.EntityWrapper;
import com.baomidou.mybatisplus.plugins.Page;
import com.baomidou.mybatisplus.service.impl.ServiceImpl;
import com.utils.PageUtils;
import com.utils.Query;


import com.dao.BiyeshengrenzhengDao;
import com.entity.BiyeshengrenzhengEntity;
import com.service.BiyeshengrenzhengService;
import com.entity.vo.BiyeshengrenzhengVO;
import com.entity.view.BiyeshengrenzhengView;

@Service("biyeshengrenzhengService")
public class BiyeshengrenzhengServiceImpl extends ServiceImpl<BiyeshengrenzhengDao, BiyeshengrenzhengEntity> implements BiyeshengrenzhengService {
	
	
    @Override
    public PageUtils queryPage(Map<String, Object> params) {
        Page<BiyeshengrenzhengEntity> page = this.selectPage(
                new Query<BiyeshengrenzhengEntity>(params).getPage(),
                new EntityWrapper<BiyeshengrenzhengEntity>()
        );
        return new PageUtils(page);
    }
    
    @Override
	public PageUtils queryPage(Map<String, Object> params, Wrapper<BiyeshengrenzhengEntity> wrapper) {
		  Page<BiyeshengrenzhengView> page =new Query<BiyeshengrenzhengView>(params).getPage();
	        page.setRecords(baseMapper.selectListView(page,wrapper));
	    	PageUtils pageUtil = new PageUtils(page);
	    	return pageUtil;
 	}

    
    @Override
	public List<BiyeshengrenzhengVO> selectListVO(Wrapper<BiyeshengrenzhengEntity> wrapper) {
 		return baseMapper.selectListVO(wrapper);
	}
	
	@Override
	public BiyeshengrenzhengVO selectVO(Wrapper<BiyeshengrenzhengEntity> wrapper) {
 		return baseMapper.selectVO(wrapper);
	}
	
	@Override
	public List<BiyeshengrenzhengView> selectListView(Wrapper<BiyeshengrenzhengEntity> wrapper) {
		return baseMapper.selectListView(wrapper);
	}

	@Override
	public BiyeshengrenzhengView selectView(Wrapper<BiyeshengrenzhengEntity> wrapper) {
		return baseMapper.selectView(wrapper);
	}


}

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


import com.dao.FanganleixingDao;
import com.entity.FanganleixingEntity;
import com.service.FanganleixingService;
import com.entity.vo.FanganleixingVO;
import com.entity.view.FanganleixingView;

@Service("fanganleixingService")
public class FanganleixingServiceImpl extends ServiceImpl<FanganleixingDao, FanganleixingEntity> implements FanganleixingService {
	
	
    @Override
    public PageUtils queryPage(Map<String, Object> params) {
        Page<FanganleixingEntity> page = this.selectPage(
                new Query<FanganleixingEntity>(params).getPage(),
                new EntityWrapper<FanganleixingEntity>()
        );
        return new PageUtils(page);
    }
    
    @Override
	public PageUtils queryPage(Map<String, Object> params, Wrapper<FanganleixingEntity> wrapper) {
		  Page<FanganleixingView> page =new Query<FanganleixingView>(params).getPage();
	        page.setRecords(baseMapper.selectListView(page,wrapper));
	    	PageUtils pageUtil = new PageUtils(page);
	    	return pageUtil;
 	}

    
    @Override
	public List<FanganleixingVO> selectListVO(Wrapper<FanganleixingEntity> wrapper) {
 		return baseMapper.selectListVO(wrapper);
	}
	
	@Override
	public FanganleixingVO selectVO(Wrapper<FanganleixingEntity> wrapper) {
 		return baseMapper.selectVO(wrapper);
	}
	
	@Override
	public List<FanganleixingView> selectListView(Wrapper<FanganleixingEntity> wrapper) {
		return baseMapper.selectListView(wrapper);
	}

	@Override
	public FanganleixingView selectView(Wrapper<FanganleixingEntity> wrapper) {
		return baseMapper.selectView(wrapper);
	}


}

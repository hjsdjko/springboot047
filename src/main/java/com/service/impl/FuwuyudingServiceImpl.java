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


import com.dao.FuwuyudingDao;
import com.entity.FuwuyudingEntity;
import com.service.FuwuyudingService;
import com.entity.vo.FuwuyudingVO;
import com.entity.view.FuwuyudingView;

@Service("fuwuyudingService")
public class FuwuyudingServiceImpl extends ServiceImpl<FuwuyudingDao, FuwuyudingEntity> implements FuwuyudingService {
	
	
    @Override
    public PageUtils queryPage(Map<String, Object> params) {
        Page<FuwuyudingEntity> page = this.selectPage(
                new Query<FuwuyudingEntity>(params).getPage(),
                new EntityWrapper<FuwuyudingEntity>()
        );
        return new PageUtils(page);
    }
    
    @Override
	public PageUtils queryPage(Map<String, Object> params, Wrapper<FuwuyudingEntity> wrapper) {
		  Page<FuwuyudingView> page =new Query<FuwuyudingView>(params).getPage();
	        page.setRecords(baseMapper.selectListView(page,wrapper));
	    	PageUtils pageUtil = new PageUtils(page);
	    	return pageUtil;
 	}

    
    @Override
	public List<FuwuyudingVO> selectListVO(Wrapper<FuwuyudingEntity> wrapper) {
 		return baseMapper.selectListVO(wrapper);
	}
	
	@Override
	public FuwuyudingVO selectVO(Wrapper<FuwuyudingEntity> wrapper) {
 		return baseMapper.selectVO(wrapper);
	}
	
	@Override
	public List<FuwuyudingView> selectListView(Wrapper<FuwuyudingEntity> wrapper) {
		return baseMapper.selectListView(wrapper);
	}

	@Override
	public FuwuyudingView selectView(Wrapper<FuwuyudingEntity> wrapper) {
		return baseMapper.selectView(wrapper);
	}


}

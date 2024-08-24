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


import com.dao.FanganxiangqingDao;
import com.entity.FanganxiangqingEntity;
import com.service.FanganxiangqingService;
import com.entity.vo.FanganxiangqingVO;
import com.entity.view.FanganxiangqingView;

@Service("fanganxiangqingService")
public class FanganxiangqingServiceImpl extends ServiceImpl<FanganxiangqingDao, FanganxiangqingEntity> implements FanganxiangqingService {
	
	
    @Override
    public PageUtils queryPage(Map<String, Object> params) {
        Page<FanganxiangqingEntity> page = this.selectPage(
                new Query<FanganxiangqingEntity>(params).getPage(),
                new EntityWrapper<FanganxiangqingEntity>()
        );
        return new PageUtils(page);
    }
    
    @Override
	public PageUtils queryPage(Map<String, Object> params, Wrapper<FanganxiangqingEntity> wrapper) {
		  Page<FanganxiangqingView> page =new Query<FanganxiangqingView>(params).getPage();
	        page.setRecords(baseMapper.selectListView(page,wrapper));
	    	PageUtils pageUtil = new PageUtils(page);
	    	return pageUtil;
 	}

    
    @Override
	public List<FanganxiangqingVO> selectListVO(Wrapper<FanganxiangqingEntity> wrapper) {
 		return baseMapper.selectListVO(wrapper);
	}
	
	@Override
	public FanganxiangqingVO selectVO(Wrapper<FanganxiangqingEntity> wrapper) {
 		return baseMapper.selectVO(wrapper);
	}
	
	@Override
	public List<FanganxiangqingView> selectListView(Wrapper<FanganxiangqingEntity> wrapper) {
		return baseMapper.selectListView(wrapper);
	}

	@Override
	public FanganxiangqingView selectView(Wrapper<FanganxiangqingEntity> wrapper) {
		return baseMapper.selectView(wrapper);
	}


}

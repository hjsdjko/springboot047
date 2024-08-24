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


import com.dao.FuwufanganDao;
import com.entity.FuwufanganEntity;
import com.service.FuwufanganService;
import com.entity.vo.FuwufanganVO;
import com.entity.view.FuwufanganView;

@Service("fuwufanganService")
public class FuwufanganServiceImpl extends ServiceImpl<FuwufanganDao, FuwufanganEntity> implements FuwufanganService {
	
	
    @Override
    public PageUtils queryPage(Map<String, Object> params) {
        Page<FuwufanganEntity> page = this.selectPage(
                new Query<FuwufanganEntity>(params).getPage(),
                new EntityWrapper<FuwufanganEntity>()
        );
        return new PageUtils(page);
    }
    
    @Override
	public PageUtils queryPage(Map<String, Object> params, Wrapper<FuwufanganEntity> wrapper) {
		  Page<FuwufanganView> page =new Query<FuwufanganView>(params).getPage();
	        page.setRecords(baseMapper.selectListView(page,wrapper));
	    	PageUtils pageUtil = new PageUtils(page);
	    	return pageUtil;
 	}

    
    @Override
	public List<FuwufanganVO> selectListVO(Wrapper<FuwufanganEntity> wrapper) {
 		return baseMapper.selectListVO(wrapper);
	}
	
	@Override
	public FuwufanganVO selectVO(Wrapper<FuwufanganEntity> wrapper) {
 		return baseMapper.selectVO(wrapper);
	}
	
	@Override
	public List<FuwufanganView> selectListView(Wrapper<FuwufanganEntity> wrapper) {
		return baseMapper.selectListView(wrapper);
	}

	@Override
	public FuwufanganView selectView(Wrapper<FuwufanganEntity> wrapper) {
		return baseMapper.selectView(wrapper);
	}


}

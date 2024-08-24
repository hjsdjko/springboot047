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


import com.dao.DiscussfuwufanganDao;
import com.entity.DiscussfuwufanganEntity;
import com.service.DiscussfuwufanganService;
import com.entity.vo.DiscussfuwufanganVO;
import com.entity.view.DiscussfuwufanganView;

@Service("discussfuwufanganService")
public class DiscussfuwufanganServiceImpl extends ServiceImpl<DiscussfuwufanganDao, DiscussfuwufanganEntity> implements DiscussfuwufanganService {
	
	
    @Override
    public PageUtils queryPage(Map<String, Object> params) {
        Page<DiscussfuwufanganEntity> page = this.selectPage(
                new Query<DiscussfuwufanganEntity>(params).getPage(),
                new EntityWrapper<DiscussfuwufanganEntity>()
        );
        return new PageUtils(page);
    }
    
    @Override
	public PageUtils queryPage(Map<String, Object> params, Wrapper<DiscussfuwufanganEntity> wrapper) {
		  Page<DiscussfuwufanganView> page =new Query<DiscussfuwufanganView>(params).getPage();
	        page.setRecords(baseMapper.selectListView(page,wrapper));
	    	PageUtils pageUtil = new PageUtils(page);
	    	return pageUtil;
 	}

    
    @Override
	public List<DiscussfuwufanganVO> selectListVO(Wrapper<DiscussfuwufanganEntity> wrapper) {
 		return baseMapper.selectListVO(wrapper);
	}
	
	@Override
	public DiscussfuwufanganVO selectVO(Wrapper<DiscussfuwufanganEntity> wrapper) {
 		return baseMapper.selectVO(wrapper);
	}
	
	@Override
	public List<DiscussfuwufanganView> selectListView(Wrapper<DiscussfuwufanganEntity> wrapper) {
		return baseMapper.selectListView(wrapper);
	}

	@Override
	public DiscussfuwufanganView selectView(Wrapper<DiscussfuwufanganEntity> wrapper) {
		return baseMapper.selectView(wrapper);
	}


}

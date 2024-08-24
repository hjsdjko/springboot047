package com.controller;

import java.math.BigDecimal;
import java.text.SimpleDateFormat;
import java.text.ParseException;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Calendar;
import java.util.Map;
import java.util.HashMap;
import java.util.Iterator;
import java.util.Date;
import java.util.List;
import javax.servlet.http.HttpServletRequest;

import com.utils.ValidatorUtils;
import org.apache.commons.lang3.StringUtils;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.transaction.annotation.Transactional;
import org.springframework.format.annotation.DateTimeFormat;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;
import com.baomidou.mybatisplus.mapper.EntityWrapper;
import com.baomidou.mybatisplus.mapper.Wrapper;
import com.annotation.IgnoreAuth;

import com.entity.FanganleixingEntity;
import com.entity.view.FanganleixingView;

import com.service.FanganleixingService;
import com.service.TokenService;
import com.utils.PageUtils;
import com.utils.R;
import com.utils.MPUtil;
import com.utils.MapUtils;
import com.utils.CommonUtil;
import java.io.IOException;

/**
 * 方案类型
 * 后端接口
 * @author 
 * @email 
 * @date 2024-04-16 20:26:49
 */
@RestController
@RequestMapping("/fanganleixing")
public class FanganleixingController {
    @Autowired
    private FanganleixingService fanganleixingService;




    



    /**
     * 后台列表
     */
    @RequestMapping("/page")
    public R page(@RequestParam Map<String, Object> params,FanganleixingEntity fanganleixing,
		HttpServletRequest request){
        EntityWrapper<FanganleixingEntity> ew = new EntityWrapper<FanganleixingEntity>();

		PageUtils page = fanganleixingService.queryPage(params, MPUtil.sort(MPUtil.between(MPUtil.likeOrEq(ew, fanganleixing), params), params));

        return R.ok().put("data", page);
    }
    
    /**
     * 前台列表
     */
	@IgnoreAuth
    @RequestMapping("/list")
    public R list(@RequestParam Map<String, Object> params,FanganleixingEntity fanganleixing, 
		HttpServletRequest request){
        EntityWrapper<FanganleixingEntity> ew = new EntityWrapper<FanganleixingEntity>();

		PageUtils page = fanganleixingService.queryPage(params, MPUtil.sort(MPUtil.between(MPUtil.likeOrEq(ew, fanganleixing), params), params));
        return R.ok().put("data", page);
    }



	/**
     * 列表
     */
    @RequestMapping("/lists")
    public R list( FanganleixingEntity fanganleixing){
       	EntityWrapper<FanganleixingEntity> ew = new EntityWrapper<FanganleixingEntity>();
      	ew.allEq(MPUtil.allEQMapPre( fanganleixing, "fanganleixing")); 
        return R.ok().put("data", fanganleixingService.selectListView(ew));
    }

	 /**
     * 查询
     */
    @RequestMapping("/query")
    public R query(FanganleixingEntity fanganleixing){
        EntityWrapper< FanganleixingEntity> ew = new EntityWrapper< FanganleixingEntity>();
 		ew.allEq(MPUtil.allEQMapPre( fanganleixing, "fanganleixing")); 
		FanganleixingView fanganleixingView =  fanganleixingService.selectView(ew);
		return R.ok("查询方案类型成功").put("data", fanganleixingView);
    }
	
    /**
     * 后台详情
     */
    @RequestMapping("/info/{id}")
    public R info(@PathVariable("id") Long id){
        FanganleixingEntity fanganleixing = fanganleixingService.selectById(id);
        return R.ok().put("data", fanganleixing);
    }

    /**
     * 前台详情
     */
	@IgnoreAuth
    @RequestMapping("/detail/{id}")
    public R detail(@PathVariable("id") Long id){
        FanganleixingEntity fanganleixing = fanganleixingService.selectById(id);
        return R.ok().put("data", fanganleixing);
    }
    



    /**
     * 后台保存
     */
    @RequestMapping("/save")
    public R save(@RequestBody FanganleixingEntity fanganleixing, HttpServletRequest request){
    	//ValidatorUtils.validateEntity(fanganleixing);
        fanganleixingService.insert(fanganleixing);
        return R.ok();
    }
    
    /**
     * 前台保存
     */
    @RequestMapping("/add")
    public R add(@RequestBody FanganleixingEntity fanganleixing, HttpServletRequest request){
    	//ValidatorUtils.validateEntity(fanganleixing);
        fanganleixingService.insert(fanganleixing);
        return R.ok();
    }





    /**
     * 修改
     */
    @RequestMapping("/update")
    @Transactional
    public R update(@RequestBody FanganleixingEntity fanganleixing, HttpServletRequest request){
        //ValidatorUtils.validateEntity(fanganleixing);
        fanganleixingService.updateById(fanganleixing);//全部更新
        return R.ok();
    }



    

    /**
     * 删除
     */
    @RequestMapping("/delete")
    public R delete(@RequestBody Long[] ids){
        fanganleixingService.deleteBatchIds(Arrays.asList(ids));
        return R.ok();
    }
    
	










}

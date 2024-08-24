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

import com.entity.FanganxiangqingEntity;
import com.entity.view.FanganxiangqingView;

import com.service.FanganxiangqingService;
import com.service.TokenService;
import com.utils.PageUtils;
import com.utils.R;
import com.utils.MPUtil;
import com.utils.MapUtils;
import com.utils.CommonUtil;
import java.io.IOException;

/**
 * 方案详情
 * 后端接口
 * @author 
 * @email 
 * @date 2024-04-16 20:26:50
 */
@RestController
@RequestMapping("/fanganxiangqing")
public class FanganxiangqingController {
    @Autowired
    private FanganxiangqingService fanganxiangqingService;




    



    /**
     * 后台列表
     */
    @RequestMapping("/page")
    public R page(@RequestParam Map<String, Object> params,FanganxiangqingEntity fanganxiangqing,
		HttpServletRequest request){
		String tableName = request.getSession().getAttribute("tableName").toString();
		if(tableName.equals("yonghu")) {
			fanganxiangqing.setYonghuzhanghao((String)request.getSession().getAttribute("username"));
		}
        EntityWrapper<FanganxiangqingEntity> ew = new EntityWrapper<FanganxiangqingEntity>();

		PageUtils page = fanganxiangqingService.queryPage(params, MPUtil.sort(MPUtil.between(MPUtil.likeOrEq(ew, fanganxiangqing), params), params));

        return R.ok().put("data", page);
    }
    
    /**
     * 前台列表
     */
	@IgnoreAuth
    @RequestMapping("/list")
    public R list(@RequestParam Map<String, Object> params,FanganxiangqingEntity fanganxiangqing, 
		HttpServletRequest request){
        EntityWrapper<FanganxiangqingEntity> ew = new EntityWrapper<FanganxiangqingEntity>();

		PageUtils page = fanganxiangqingService.queryPage(params, MPUtil.sort(MPUtil.between(MPUtil.likeOrEq(ew, fanganxiangqing), params), params));
        return R.ok().put("data", page);
    }



	/**
     * 列表
     */
    @RequestMapping("/lists")
    public R list( FanganxiangqingEntity fanganxiangqing){
       	EntityWrapper<FanganxiangqingEntity> ew = new EntityWrapper<FanganxiangqingEntity>();
      	ew.allEq(MPUtil.allEQMapPre( fanganxiangqing, "fanganxiangqing")); 
        return R.ok().put("data", fanganxiangqingService.selectListView(ew));
    }

	 /**
     * 查询
     */
    @RequestMapping("/query")
    public R query(FanganxiangqingEntity fanganxiangqing){
        EntityWrapper< FanganxiangqingEntity> ew = new EntityWrapper< FanganxiangqingEntity>();
 		ew.allEq(MPUtil.allEQMapPre( fanganxiangqing, "fanganxiangqing")); 
		FanganxiangqingView fanganxiangqingView =  fanganxiangqingService.selectView(ew);
		return R.ok("查询方案详情成功").put("data", fanganxiangqingView);
    }
	
    /**
     * 后台详情
     */
    @RequestMapping("/info/{id}")
    public R info(@PathVariable("id") Long id){
        FanganxiangqingEntity fanganxiangqing = fanganxiangqingService.selectById(id);
        return R.ok().put("data", fanganxiangqing);
    }

    /**
     * 前台详情
     */
	@IgnoreAuth
    @RequestMapping("/detail/{id}")
    public R detail(@PathVariable("id") Long id){
        FanganxiangqingEntity fanganxiangqing = fanganxiangqingService.selectById(id);
        return R.ok().put("data", fanganxiangqing);
    }
    



    /**
     * 后台保存
     */
    @RequestMapping("/save")
    public R save(@RequestBody FanganxiangqingEntity fanganxiangqing, HttpServletRequest request){
    	//ValidatorUtils.validateEntity(fanganxiangqing);
        fanganxiangqingService.insert(fanganxiangqing);
        return R.ok();
    }
    
    /**
     * 前台保存
     */
    @RequestMapping("/add")
    public R add(@RequestBody FanganxiangqingEntity fanganxiangqing, HttpServletRequest request){
    	//ValidatorUtils.validateEntity(fanganxiangqing);
        fanganxiangqingService.insert(fanganxiangqing);
        return R.ok();
    }





    /**
     * 修改
     */
    @RequestMapping("/update")
    @Transactional
    public R update(@RequestBody FanganxiangqingEntity fanganxiangqing, HttpServletRequest request){
        //ValidatorUtils.validateEntity(fanganxiangqing);
        fanganxiangqingService.updateById(fanganxiangqing);//全部更新
        return R.ok();
    }



    

    /**
     * 删除
     */
    @RequestMapping("/delete")
    public R delete(@RequestBody Long[] ids){
        fanganxiangqingService.deleteBatchIds(Arrays.asList(ids));
        return R.ok();
    }
    
	










}

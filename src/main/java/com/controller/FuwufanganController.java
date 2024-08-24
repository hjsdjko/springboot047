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

import com.entity.FuwufanganEntity;
import com.entity.view.FuwufanganView;

import com.service.FuwufanganService;
import com.service.TokenService;
import com.utils.PageUtils;
import com.utils.R;
import com.utils.MPUtil;
import com.utils.MapUtils;
import com.utils.CommonUtil;
import java.io.IOException;
import com.service.StoreupService;
import com.entity.StoreupEntity;

/**
 * 服务方案
 * 后端接口
 * @author 
 * @email 
 * @date 2024-04-16 20:26:49
 */
@RestController
@RequestMapping("/fuwufangan")
public class FuwufanganController {
    @Autowired
    private FuwufanganService fuwufanganService;

    @Autowired
    private StoreupService storeupService;



    



    /**
     * 后台列表
     */
    @RequestMapping("/page")
    public R page(@RequestParam Map<String, Object> params,FuwufanganEntity fuwufangan,
		HttpServletRequest request){
        EntityWrapper<FuwufanganEntity> ew = new EntityWrapper<FuwufanganEntity>();

		PageUtils page = fuwufanganService.queryPage(params, MPUtil.sort(MPUtil.between(MPUtil.likeOrEq(ew, fuwufangan), params), params));

        return R.ok().put("data", page);
    }
    
    /**
     * 前台列表
     */
	@IgnoreAuth
    @RequestMapping("/list")
    public R list(@RequestParam Map<String, Object> params,FuwufanganEntity fuwufangan, 
		HttpServletRequest request){
        EntityWrapper<FuwufanganEntity> ew = new EntityWrapper<FuwufanganEntity>();

		PageUtils page = fuwufanganService.queryPage(params, MPUtil.sort(MPUtil.between(MPUtil.likeOrEq(ew, fuwufangan), params), params));
        return R.ok().put("data", page);
    }



	/**
     * 列表
     */
    @RequestMapping("/lists")
    public R list( FuwufanganEntity fuwufangan){
       	EntityWrapper<FuwufanganEntity> ew = new EntityWrapper<FuwufanganEntity>();
      	ew.allEq(MPUtil.allEQMapPre( fuwufangan, "fuwufangan")); 
        return R.ok().put("data", fuwufanganService.selectListView(ew));
    }

	 /**
     * 查询
     */
    @RequestMapping("/query")
    public R query(FuwufanganEntity fuwufangan){
        EntityWrapper< FuwufanganEntity> ew = new EntityWrapper< FuwufanganEntity>();
 		ew.allEq(MPUtil.allEQMapPre( fuwufangan, "fuwufangan")); 
		FuwufanganView fuwufanganView =  fuwufanganService.selectView(ew);
		return R.ok("查询服务方案成功").put("data", fuwufanganView);
    }
	
    /**
     * 后台详情
     */
    @RequestMapping("/info/{id}")
    public R info(@PathVariable("id") Long id){
        FuwufanganEntity fuwufangan = fuwufanganService.selectById(id);
        return R.ok().put("data", fuwufangan);
    }

    /**
     * 前台详情
     */
	@IgnoreAuth
    @RequestMapping("/detail/{id}")
    public R detail(@PathVariable("id") Long id){
        FuwufanganEntity fuwufangan = fuwufanganService.selectById(id);
        return R.ok().put("data", fuwufangan);
    }
    



    /**
     * 后台保存
     */
    @RequestMapping("/save")
    public R save(@RequestBody FuwufanganEntity fuwufangan, HttpServletRequest request){
    	//ValidatorUtils.validateEntity(fuwufangan);
        fuwufanganService.insert(fuwufangan);
        return R.ok();
    }
    
    /**
     * 前台保存
     */
    @RequestMapping("/add")
    public R add(@RequestBody FuwufanganEntity fuwufangan, HttpServletRequest request){
    	//ValidatorUtils.validateEntity(fuwufangan);
        fuwufanganService.insert(fuwufangan);
        return R.ok();
    }





    /**
     * 修改
     */
    @RequestMapping("/update")
    @Transactional
    public R update(@RequestBody FuwufanganEntity fuwufangan, HttpServletRequest request){
        //ValidatorUtils.validateEntity(fuwufangan);
        fuwufanganService.updateById(fuwufangan);//全部更新
        return R.ok();
    }



    

    /**
     * 删除
     */
    @RequestMapping("/delete")
    public R delete(@RequestBody Long[] ids){
        fuwufanganService.deleteBatchIds(Arrays.asList(ids));
        return R.ok();
    }
    
	










}

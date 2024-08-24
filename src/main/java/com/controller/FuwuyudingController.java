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

import com.entity.FuwuyudingEntity;
import com.entity.view.FuwuyudingView;

import com.service.FuwuyudingService;
import com.service.TokenService;
import com.utils.PageUtils;
import com.utils.R;
import com.utils.MPUtil;
import com.utils.MapUtils;
import com.utils.CommonUtil;
import java.io.IOException;

/**
 * 服务预订
 * 后端接口
 * @author 
 * @email 
 * @date 2024-04-16 20:26:49
 */
@RestController
@RequestMapping("/fuwuyuding")
public class FuwuyudingController {
    @Autowired
    private FuwuyudingService fuwuyudingService;




    



    /**
     * 后台列表
     */
    @RequestMapping("/page")
    public R page(@RequestParam Map<String, Object> params,FuwuyudingEntity fuwuyuding,
		HttpServletRequest request){
		String tableName = request.getSession().getAttribute("tableName").toString();
		if(tableName.equals("yonghu")) {
			fuwuyuding.setYonghuzhanghao((String)request.getSession().getAttribute("username"));
		}
        EntityWrapper<FuwuyudingEntity> ew = new EntityWrapper<FuwuyudingEntity>();

		PageUtils page = fuwuyudingService.queryPage(params, MPUtil.sort(MPUtil.between(MPUtil.likeOrEq(ew, fuwuyuding), params), params));

        return R.ok().put("data", page);
    }
    
    /**
     * 前台列表
     */
	@IgnoreAuth
    @RequestMapping("/list")
    public R list(@RequestParam Map<String, Object> params,FuwuyudingEntity fuwuyuding, 
		HttpServletRequest request){
        EntityWrapper<FuwuyudingEntity> ew = new EntityWrapper<FuwuyudingEntity>();

		PageUtils page = fuwuyudingService.queryPage(params, MPUtil.sort(MPUtil.between(MPUtil.likeOrEq(ew, fuwuyuding), params), params));
        return R.ok().put("data", page);
    }



	/**
     * 列表
     */
    @RequestMapping("/lists")
    public R list( FuwuyudingEntity fuwuyuding){
       	EntityWrapper<FuwuyudingEntity> ew = new EntityWrapper<FuwuyudingEntity>();
      	ew.allEq(MPUtil.allEQMapPre( fuwuyuding, "fuwuyuding")); 
        return R.ok().put("data", fuwuyudingService.selectListView(ew));
    }

	 /**
     * 查询
     */
    @RequestMapping("/query")
    public R query(FuwuyudingEntity fuwuyuding){
        EntityWrapper< FuwuyudingEntity> ew = new EntityWrapper< FuwuyudingEntity>();
 		ew.allEq(MPUtil.allEQMapPre( fuwuyuding, "fuwuyuding")); 
		FuwuyudingView fuwuyudingView =  fuwuyudingService.selectView(ew);
		return R.ok("查询服务预订成功").put("data", fuwuyudingView);
    }
	
    /**
     * 后台详情
     */
    @RequestMapping("/info/{id}")
    public R info(@PathVariable("id") Long id){
        FuwuyudingEntity fuwuyuding = fuwuyudingService.selectById(id);
        return R.ok().put("data", fuwuyuding);
    }

    /**
     * 前台详情
     */
	@IgnoreAuth
    @RequestMapping("/detail/{id}")
    public R detail(@PathVariable("id") Long id){
        FuwuyudingEntity fuwuyuding = fuwuyudingService.selectById(id);
        return R.ok().put("data", fuwuyuding);
    }
    



    /**
     * 后台保存
     */
    @RequestMapping("/save")
    public R save(@RequestBody FuwuyudingEntity fuwuyuding, HttpServletRequest request){
    	//ValidatorUtils.validateEntity(fuwuyuding);
        fuwuyudingService.insert(fuwuyuding);
        return R.ok();
    }
    
    /**
     * 前台保存
     */
    @RequestMapping("/add")
    public R add(@RequestBody FuwuyudingEntity fuwuyuding, HttpServletRequest request){
    	//ValidatorUtils.validateEntity(fuwuyuding);
        fuwuyudingService.insert(fuwuyuding);
        return R.ok();
    }





    /**
     * 修改
     */
    @RequestMapping("/update")
    @Transactional
    public R update(@RequestBody FuwuyudingEntity fuwuyuding, HttpServletRequest request){
        //ValidatorUtils.validateEntity(fuwuyuding);
        fuwuyudingService.updateById(fuwuyuding);//全部更新
        return R.ok();
    }

    /**
     * 审核
     */
    @RequestMapping("/shBatch")
    @Transactional
    public R update(@RequestBody Long[] ids, @RequestParam String sfsh, @RequestParam String shhf){
        List<FuwuyudingEntity> list = new ArrayList<FuwuyudingEntity>();
        for(Long id : ids) {
            FuwuyudingEntity fuwuyuding = fuwuyudingService.selectById(id);
            fuwuyuding.setSfsh(sfsh);
            fuwuyuding.setShhf(shhf);
            list.add(fuwuyuding);
        }
        fuwuyudingService.updateBatchById(list);
        return R.ok();
    }


    

    /**
     * 删除
     */
    @RequestMapping("/delete")
    public R delete(@RequestBody Long[] ids){
        fuwuyudingService.deleteBatchIds(Arrays.asList(ids));
        return R.ok();
    }
    
	










}

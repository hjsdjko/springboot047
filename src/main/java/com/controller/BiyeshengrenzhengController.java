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

import com.entity.BiyeshengrenzhengEntity;
import com.entity.view.BiyeshengrenzhengView;

import com.service.BiyeshengrenzhengService;
import com.service.TokenService;
import com.utils.PageUtils;
import com.utils.R;
import com.utils.MPUtil;
import com.utils.MapUtils;
import com.utils.CommonUtil;
import java.io.IOException;

/**
 * 毕业生认证
 * 后端接口
 * @author 
 * @email 
 * @date 2024-04-16 20:26:49
 */
@RestController
@RequestMapping("/biyeshengrenzheng")
public class BiyeshengrenzhengController {
    @Autowired
    private BiyeshengrenzhengService biyeshengrenzhengService;




    



    /**
     * 后台列表
     */
    @RequestMapping("/page")
    public R page(@RequestParam Map<String, Object> params,BiyeshengrenzhengEntity biyeshengrenzheng,
		HttpServletRequest request){
		String tableName = request.getSession().getAttribute("tableName").toString();
		if(tableName.equals("yonghu")) {
			biyeshengrenzheng.setYonghuzhanghao((String)request.getSession().getAttribute("username"));
		}
        EntityWrapper<BiyeshengrenzhengEntity> ew = new EntityWrapper<BiyeshengrenzhengEntity>();

		PageUtils page = biyeshengrenzhengService.queryPage(params, MPUtil.sort(MPUtil.between(MPUtil.likeOrEq(ew, biyeshengrenzheng), params), params));

        return R.ok().put("data", page);
    }
    
    /**
     * 前台列表
     */
	@IgnoreAuth
    @RequestMapping("/list")
    public R list(@RequestParam Map<String, Object> params,BiyeshengrenzhengEntity biyeshengrenzheng, 
		HttpServletRequest request){
        EntityWrapper<BiyeshengrenzhengEntity> ew = new EntityWrapper<BiyeshengrenzhengEntity>();

		PageUtils page = biyeshengrenzhengService.queryPage(params, MPUtil.sort(MPUtil.between(MPUtil.likeOrEq(ew, biyeshengrenzheng), params), params));
        return R.ok().put("data", page);
    }



	/**
     * 列表
     */
    @RequestMapping("/lists")
    public R list( BiyeshengrenzhengEntity biyeshengrenzheng){
       	EntityWrapper<BiyeshengrenzhengEntity> ew = new EntityWrapper<BiyeshengrenzhengEntity>();
      	ew.allEq(MPUtil.allEQMapPre( biyeshengrenzheng, "biyeshengrenzheng")); 
        return R.ok().put("data", biyeshengrenzhengService.selectListView(ew));
    }

	 /**
     * 查询
     */
    @RequestMapping("/query")
    public R query(BiyeshengrenzhengEntity biyeshengrenzheng){
        EntityWrapper< BiyeshengrenzhengEntity> ew = new EntityWrapper< BiyeshengrenzhengEntity>();
 		ew.allEq(MPUtil.allEQMapPre( biyeshengrenzheng, "biyeshengrenzheng")); 
		BiyeshengrenzhengView biyeshengrenzhengView =  biyeshengrenzhengService.selectView(ew);
		return R.ok("查询毕业生认证成功").put("data", biyeshengrenzhengView);
    }
	
    /**
     * 后台详情
     */
    @RequestMapping("/info/{id}")
    public R info(@PathVariable("id") Long id){
        BiyeshengrenzhengEntity biyeshengrenzheng = biyeshengrenzhengService.selectById(id);
        return R.ok().put("data", biyeshengrenzheng);
    }

    /**
     * 前台详情
     */
	@IgnoreAuth
    @RequestMapping("/detail/{id}")
    public R detail(@PathVariable("id") Long id){
        BiyeshengrenzhengEntity biyeshengrenzheng = biyeshengrenzhengService.selectById(id);
        return R.ok().put("data", biyeshengrenzheng);
    }
    



    /**
     * 后台保存
     */
    @RequestMapping("/save")
    public R save(@RequestBody BiyeshengrenzhengEntity biyeshengrenzheng, HttpServletRequest request){
    	//ValidatorUtils.validateEntity(biyeshengrenzheng);
        biyeshengrenzhengService.insert(biyeshengrenzheng);
        return R.ok();
    }
    
    /**
     * 前台保存
     */
    @RequestMapping("/add")
    public R add(@RequestBody BiyeshengrenzhengEntity biyeshengrenzheng, HttpServletRequest request){
    	//ValidatorUtils.validateEntity(biyeshengrenzheng);
        biyeshengrenzhengService.insert(biyeshengrenzheng);
        return R.ok();
    }





    /**
     * 修改
     */
    @RequestMapping("/update")
    @Transactional
    public R update(@RequestBody BiyeshengrenzhengEntity biyeshengrenzheng, HttpServletRequest request){
        //ValidatorUtils.validateEntity(biyeshengrenzheng);
        biyeshengrenzhengService.updateById(biyeshengrenzheng);//全部更新
        return R.ok();
    }

    /**
     * 审核
     */
    @RequestMapping("/shBatch")
    @Transactional
    public R update(@RequestBody Long[] ids, @RequestParam String sfsh, @RequestParam String shhf){
        List<BiyeshengrenzhengEntity> list = new ArrayList<BiyeshengrenzhengEntity>();
        for(Long id : ids) {
            BiyeshengrenzhengEntity biyeshengrenzheng = biyeshengrenzhengService.selectById(id);
            biyeshengrenzheng.setSfsh(sfsh);
            biyeshengrenzheng.setShhf(shhf);
            list.add(biyeshengrenzheng);
        }
        biyeshengrenzhengService.updateBatchById(list);
        return R.ok();
    }


    

    /**
     * 删除
     */
    @RequestMapping("/delete")
    public R delete(@RequestBody Long[] ids){
        biyeshengrenzhengService.deleteBatchIds(Arrays.asList(ids));
        return R.ok();
    }
    
	










}

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

import com.entity.EmailregistercodeEntity;
import com.entity.view.EmailregistercodeView;

import com.service.EmailregistercodeService;
import com.service.TokenService;
import com.utils.PageUtils;
import com.utils.R;
import com.utils.MPUtil;
import com.utils.MapUtils;
import com.utils.CommonUtil;
import java.io.IOException;

/**
 * 邮箱验证码
 * 后端接口
 * @author 
 * @email 
 * @date 2024-05-05 21:41:03
 */
@RestController
@RequestMapping("/emailregistercode")
public class EmailregistercodeController {
    @Autowired
    private EmailregistercodeService emailregistercodeService;




    



    /**
     * 后台列表
     */
    @RequestMapping("/page")
    public R page(@RequestParam Map<String, Object> params,EmailregistercodeEntity emailregistercode,
		HttpServletRequest request){
        EntityWrapper<EmailregistercodeEntity> ew = new EntityWrapper<EmailregistercodeEntity>();

		PageUtils page = emailregistercodeService.queryPage(params, MPUtil.sort(MPUtil.between(MPUtil.likeOrEq(ew, emailregistercode), params), params));

        return R.ok().put("data", page);
    }
    
    /**
     * 前台列表
     */
	@IgnoreAuth
    @RequestMapping("/list")
    public R list(@RequestParam Map<String, Object> params,EmailregistercodeEntity emailregistercode, 
		HttpServletRequest request){
        EntityWrapper<EmailregistercodeEntity> ew = new EntityWrapper<EmailregistercodeEntity>();

		PageUtils page = emailregistercodeService.queryPage(params, MPUtil.sort(MPUtil.between(MPUtil.likeOrEq(ew, emailregistercode), params), params));
        return R.ok().put("data", page);
    }



	/**
     * 列表
     */
    @RequestMapping("/lists")
    public R list( EmailregistercodeEntity emailregistercode){
       	EntityWrapper<EmailregistercodeEntity> ew = new EntityWrapper<EmailregistercodeEntity>();
      	ew.allEq(MPUtil.allEQMapPre( emailregistercode, "emailregistercode")); 
        return R.ok().put("data", emailregistercodeService.selectListView(ew));
    }

	 /**
     * 查询
     */
    @RequestMapping("/query")
    public R query(EmailregistercodeEntity emailregistercode){
        EntityWrapper< EmailregistercodeEntity> ew = new EntityWrapper< EmailregistercodeEntity>();
 		ew.allEq(MPUtil.allEQMapPre( emailregistercode, "emailregistercode")); 
		EmailregistercodeView emailregistercodeView =  emailregistercodeService.selectView(ew);
		return R.ok("查询邮箱验证码成功").put("data", emailregistercodeView);
    }
	
    /**
     * 后台详情
     */
    @RequestMapping("/info/{id}")
    public R info(@PathVariable("id") Long id){
        EmailregistercodeEntity emailregistercode = emailregistercodeService.selectById(id);
        return R.ok().put("data", emailregistercode);
    }

    /**
     * 前台详情
     */
	@IgnoreAuth
    @RequestMapping("/detail/{id}")
    public R detail(@PathVariable("id") Long id){
        EmailregistercodeEntity emailregistercode = emailregistercodeService.selectById(id);
        return R.ok().put("data", emailregistercode);
    }
    



    /**
     * 后台保存
     */
    @RequestMapping("/save")
    public R save(@RequestBody EmailregistercodeEntity emailregistercode, HttpServletRequest request){
    	//ValidatorUtils.validateEntity(emailregistercode);
        emailregistercodeService.insert(emailregistercode);
        return R.ok();
    }
    
    /**
     * 前台保存
     */
    @RequestMapping("/add")
    public R add(@RequestBody EmailregistercodeEntity emailregistercode, HttpServletRequest request){
    	//ValidatorUtils.validateEntity(emailregistercode);
        emailregistercodeService.insert(emailregistercode);
        return R.ok();
    }



     /**
     * 获取用户密保
     */
    @RequestMapping("/security")
    @IgnoreAuth
    public R security(@RequestParam String username){
        EmailregistercodeEntity emailregistercode = emailregistercodeService.selectOne(new EntityWrapper<EmailregistercodeEntity>().eq("", username));
        return R.ok().put("data", emailregistercode);
    }


    /**
     * 修改
     */
    @RequestMapping("/update")
    @Transactional
    @IgnoreAuth
    public R update(@RequestBody EmailregistercodeEntity emailregistercode, HttpServletRequest request){
        //ValidatorUtils.validateEntity(emailregistercode);
        emailregistercodeService.updateById(emailregistercode);//全部更新
        return R.ok();
    }



    

    /**
     * 删除
     */
    @RequestMapping("/delete")
    public R delete(@RequestBody Long[] ids){
        emailregistercodeService.deleteBatchIds(Arrays.asList(ids));
        return R.ok();
    }
    
	
	/**
     * 前台智能排序
     */
	@IgnoreAuth
    @RequestMapping("/autoSort")
    public R autoSort(@RequestParam Map<String, Object> params,EmailregistercodeEntity emailregistercode, HttpServletRequest request,String pre){
        EntityWrapper<EmailregistercodeEntity> ew = new EntityWrapper<EmailregistercodeEntity>();
        Map<String, Object> newMap = new HashMap<String, Object>();
        Map<String, Object> param = new HashMap<String, Object>();
		Iterator<Map.Entry<String, Object>> it = param.entrySet().iterator();
		while (it.hasNext()) {
			Map.Entry<String, Object> entry = it.next();
			String key = entry.getKey();
			String newKey = entry.getKey();
			if (pre.endsWith(".")) {
				newMap.put(pre + newKey, entry.getValue());
			} else if (StringUtils.isEmpty(pre)) {
				newMap.put(newKey, entry.getValue());
			} else {
				newMap.put(pre + "." + newKey, entry.getValue());
			}
		}
		params.put("sort", "clicktime");
        params.put("order", "desc");
		PageUtils page = emailregistercodeService.queryPage(params, MPUtil.sort(MPUtil.between(MPUtil.likeOrEq(ew, emailregistercode), params), params));
        return R.ok().put("data", page);
    }










}

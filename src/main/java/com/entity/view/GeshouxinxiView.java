package com.entity.view;

import com.entity.GeshouxinxiEntity;

import com.baomidou.mybatisplus.annotations.TableName;
import org.apache.commons.beanutils.BeanUtils;
import java.lang.reflect.InvocationTargetException;
import java.math.BigDecimal;

import java.io.Serializable;
import com.utils.EncryptUtil;
 

/**
 * 歌手信息
 * 后端返回视图实体辅助类   
 * （通常后端关联的表或者自定义的字段需要返回使用）
 * @author 
 * @email 
 * @date 2024-05-05 21:41:03
 */
@TableName("geshouxinxi")
public class GeshouxinxiView  extends GeshouxinxiEntity implements Serializable {
	private static final long serialVersionUID = 1L;

	public GeshouxinxiView(){
	}
 
 	public GeshouxinxiView(GeshouxinxiEntity geshouxinxiEntity){
 	try {
			BeanUtils.copyProperties(this, geshouxinxiEntity);
		} catch (IllegalAccessException | InvocationTargetException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
 		
	}


}

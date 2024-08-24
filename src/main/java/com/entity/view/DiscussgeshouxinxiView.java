package com.entity.view;

import com.entity.DiscussgeshouxinxiEntity;

import com.baomidou.mybatisplus.annotations.TableName;
import org.apache.commons.beanutils.BeanUtils;
import java.lang.reflect.InvocationTargetException;
import java.math.BigDecimal;

import java.io.Serializable;
import com.utils.EncryptUtil;
 

/**
 * 歌手信息评论表
 * 后端返回视图实体辅助类   
 * （通常后端关联的表或者自定义的字段需要返回使用）
 * @author 
 * @email 
 * @date 2024-05-05 21:41:04
 */
@TableName("discussgeshouxinxi")
public class DiscussgeshouxinxiView  extends DiscussgeshouxinxiEntity implements Serializable {
	private static final long serialVersionUID = 1L;

	public DiscussgeshouxinxiView(){
	}
 
 	public DiscussgeshouxinxiView(DiscussgeshouxinxiEntity discussgeshouxinxiEntity){
 	try {
			BeanUtils.copyProperties(this, discussgeshouxinxiEntity);
		} catch (IllegalAccessException | InvocationTargetException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
 		
	}


}

package com.entity.model;

import com.entity.GeshouxinxiEntity;

import com.baomidou.mybatisplus.annotations.TableName;
import java.util.Date;
import org.springframework.format.annotation.DateTimeFormat;

import com.fasterxml.jackson.annotation.JsonFormat;
import java.io.Serializable;
 

/**
 * 歌手信息
 * 接收传参的实体类  
 *（实际开发中配合移动端接口开发手动去掉些没用的字段， 后端一般用entity就够用了） 
 * 取自ModelAndView 的model名称
 * @author 
 * @email 
 * @date 2024-05-05 21:41:03
 */
public class GeshouxinxiModel  implements Serializable {
	private static final long serialVersionUID = 1L;

	 			
	/**
	 * 照片
	 */
	
	private String zhaopian;
		
	/**
	 * 歌手性别
	 */
	
	private String geshouxingbie;
		
	/**
	 * 国家地区
	 */
	
	private String guojiadiqu;
		
	/**
	 * 代表作
	 */
	
	private String daibiaozuo;
		
	/**
	 * 专辑介绍
	 */
	
	private String zhuanjijieshao;
		
	/**
	 * 歌手介绍
	 */
	
	private String geshoujieshao;
		
	/**
	 * 评论数
	 */
	
	private Integer discussnum;
		
	/**
	 * 收藏数
	 */
	
	private Integer storeupnum;
				
	
	/**
	 * 设置：照片
	 */
	 
	public void setZhaopian(String zhaopian) {
		this.zhaopian = zhaopian;
	}
	
	/**
	 * 获取：照片
	 */
	public String getZhaopian() {
		return zhaopian;
	}
				
	
	/**
	 * 设置：歌手性别
	 */
	 
	public void setGeshouxingbie(String geshouxingbie) {
		this.geshouxingbie = geshouxingbie;
	}
	
	/**
	 * 获取：歌手性别
	 */
	public String getGeshouxingbie() {
		return geshouxingbie;
	}
				
	
	/**
	 * 设置：国家地区
	 */
	 
	public void setGuojiadiqu(String guojiadiqu) {
		this.guojiadiqu = guojiadiqu;
	}
	
	/**
	 * 获取：国家地区
	 */
	public String getGuojiadiqu() {
		return guojiadiqu;
	}
				
	
	/**
	 * 设置：代表作
	 */
	 
	public void setDaibiaozuo(String daibiaozuo) {
		this.daibiaozuo = daibiaozuo;
	}
	
	/**
	 * 获取：代表作
	 */
	public String getDaibiaozuo() {
		return daibiaozuo;
	}
				
	
	/**
	 * 设置：专辑介绍
	 */
	 
	public void setZhuanjijieshao(String zhuanjijieshao) {
		this.zhuanjijieshao = zhuanjijieshao;
	}
	
	/**
	 * 获取：专辑介绍
	 */
	public String getZhuanjijieshao() {
		return zhuanjijieshao;
	}
				
	
	/**
	 * 设置：歌手介绍
	 */
	 
	public void setGeshoujieshao(String geshoujieshao) {
		this.geshoujieshao = geshoujieshao;
	}
	
	/**
	 * 获取：歌手介绍
	 */
	public String getGeshoujieshao() {
		return geshoujieshao;
	}
				
	
	/**
	 * 设置：评论数
	 */
	 
	public void setDiscussnum(Integer discussnum) {
		this.discussnum = discussnum;
	}
	
	/**
	 * 获取：评论数
	 */
	public Integer getDiscussnum() {
		return discussnum;
	}
				
	
	/**
	 * 设置：收藏数
	 */
	 
	public void setStoreupnum(Integer storeupnum) {
		this.storeupnum = storeupnum;
	}
	
	/**
	 * 获取：收藏数
	 */
	public Integer getStoreupnum() {
		return storeupnum;
	}
			
}

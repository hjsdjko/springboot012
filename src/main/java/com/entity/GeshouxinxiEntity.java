package com.entity;

import com.baomidou.mybatisplus.annotations.TableId;
import com.baomidou.mybatisplus.annotations.TableName;
import javax.validation.constraints.NotBlank;
import javax.validation.constraints.NotEmpty;
import javax.validation.constraints.NotNull;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import java.lang.reflect.InvocationTargetException;

import java.io.Serializable;
import java.util.Date;
import java.util.List;

import org.springframework.format.annotation.DateTimeFormat;
import com.fasterxml.jackson.annotation.JsonFormat;
import org.apache.commons.beanutils.BeanUtils;
import com.baomidou.mybatisplus.annotations.TableField;
import com.baomidou.mybatisplus.enums.FieldFill;
import com.baomidou.mybatisplus.enums.IdType;


/**
 * 歌手信息
 * 数据库通用操作实体类（普通增删改查）
 * @author 
 * @email 
 * @date 2024-05-05 21:41:03
 */
@TableName("geshouxinxi")
public class GeshouxinxiEntity<T> implements Serializable {
	private static final long serialVersionUID = 1L;


	public GeshouxinxiEntity() {
		
	}
	
	public GeshouxinxiEntity(T t) {
		try {
			BeanUtils.copyProperties(this, t);
		} catch (IllegalAccessException | InvocationTargetException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}
	
	/**
	 * 主键id
	 */
    @TableId(type = IdType.AUTO)
    private Long id;
	/**
	 * 歌手姓名
	 */
					
	private String geshouxingming;
	
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
	
	
	@JsonFormat(locale="zh", timezone="GMT+8", pattern="yyyy-MM-dd HH:mm:ss")
	@DateTimeFormat
	private Date addtime;

	public Date getAddtime() {
		return addtime;
	}
	public void setAddtime(Date addtime) {
		this.addtime = addtime;
	}

	public Long getId() {
		return id;
	}

	public void setId(Long id) {
		this.id = id;
	}
	/**
	 * 设置：歌手姓名
	 */
	public void setGeshouxingming(String geshouxingming) {
		this.geshouxingming = geshouxingming;
	}
	/**
	 * 获取：歌手姓名
	 */
	public String getGeshouxingming() {
		return geshouxingming;
	}
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

package com.dao;

import com.entity.GeshouxinxiEntity;
import com.baomidou.mybatisplus.mapper.BaseMapper;
import java.util.List;
import java.util.Map;
import com.baomidou.mybatisplus.mapper.Wrapper;
import com.baomidou.mybatisplus.plugins.pagination.Pagination;

import org.apache.ibatis.annotations.Param;
import com.entity.vo.GeshouxinxiVO;
import com.entity.view.GeshouxinxiView;


/**
 * 歌手信息
 * 
 * @author 
 * @email 
 * @date 2024-05-05 21:41:03
 */
public interface GeshouxinxiDao extends BaseMapper<GeshouxinxiEntity> {
	
	List<GeshouxinxiVO> selectListVO(@Param("ew") Wrapper<GeshouxinxiEntity> wrapper);
	
	GeshouxinxiVO selectVO(@Param("ew") Wrapper<GeshouxinxiEntity> wrapper);
	
	List<GeshouxinxiView> selectListView(@Param("ew") Wrapper<GeshouxinxiEntity> wrapper);

	List<GeshouxinxiView> selectListView(Pagination page,@Param("ew") Wrapper<GeshouxinxiEntity> wrapper);

	
	GeshouxinxiView selectView(@Param("ew") Wrapper<GeshouxinxiEntity> wrapper);
	

}

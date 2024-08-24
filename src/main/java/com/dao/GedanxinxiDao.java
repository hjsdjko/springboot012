package com.dao;

import com.entity.GedanxinxiEntity;
import com.baomidou.mybatisplus.mapper.BaseMapper;
import java.util.List;
import java.util.Map;
import com.baomidou.mybatisplus.mapper.Wrapper;
import com.baomidou.mybatisplus.plugins.pagination.Pagination;

import org.apache.ibatis.annotations.Param;
import com.entity.vo.GedanxinxiVO;
import com.entity.view.GedanxinxiView;


/**
 * 歌单信息
 * 
 * @author 
 * @email 
 * @date 2024-05-05 21:41:03
 */
public interface GedanxinxiDao extends BaseMapper<GedanxinxiEntity> {
	
	List<GedanxinxiVO> selectListVO(@Param("ew") Wrapper<GedanxinxiEntity> wrapper);
	
	GedanxinxiVO selectVO(@Param("ew") Wrapper<GedanxinxiEntity> wrapper);
	
	List<GedanxinxiView> selectListView(@Param("ew") Wrapper<GedanxinxiEntity> wrapper);

	List<GedanxinxiView> selectListView(Pagination page,@Param("ew") Wrapper<GedanxinxiEntity> wrapper);

	
	GedanxinxiView selectView(@Param("ew") Wrapper<GedanxinxiEntity> wrapper);
	

    List<Map<String, Object>> selectValue(@Param("params") Map<String, Object> params,@Param("ew") Wrapper<GedanxinxiEntity> wrapper);

    List<Map<String, Object>> selectTimeStatValue(@Param("params") Map<String, Object> params,@Param("ew") Wrapper<GedanxinxiEntity> wrapper);

    List<Map<String, Object>> selectGroup(@Param("params") Map<String, Object> params,@Param("ew") Wrapper<GedanxinxiEntity> wrapper);



}

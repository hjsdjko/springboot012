package com.service;

import com.baomidou.mybatisplus.mapper.Wrapper;
import com.baomidou.mybatisplus.service.IService;
import com.utils.PageUtils;
import com.entity.GeshouxinxiEntity;
import java.util.List;
import java.util.Map;
import com.entity.vo.GeshouxinxiVO;
import org.apache.ibatis.annotations.Param;
import com.entity.view.GeshouxinxiView;


/**
 * 歌手信息
 *
 * @author 
 * @email 
 * @date 2024-05-05 21:41:03
 */
public interface GeshouxinxiService extends IService<GeshouxinxiEntity> {

    PageUtils queryPage(Map<String, Object> params);
    
   	List<GeshouxinxiVO> selectListVO(Wrapper<GeshouxinxiEntity> wrapper);
   	
   	GeshouxinxiVO selectVO(@Param("ew") Wrapper<GeshouxinxiEntity> wrapper);
   	
   	List<GeshouxinxiView> selectListView(Wrapper<GeshouxinxiEntity> wrapper);
   	
   	GeshouxinxiView selectView(@Param("ew") Wrapper<GeshouxinxiEntity> wrapper);
   	
   	PageUtils queryPage(Map<String, Object> params,Wrapper<GeshouxinxiEntity> wrapper);

   	

}


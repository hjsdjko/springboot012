package com.service;

import com.baomidou.mybatisplus.mapper.Wrapper;
import com.baomidou.mybatisplus.service.IService;
import com.utils.PageUtils;
import com.entity.DiscussgeshouxinxiEntity;
import java.util.List;
import java.util.Map;
import com.entity.vo.DiscussgeshouxinxiVO;
import org.apache.ibatis.annotations.Param;
import com.entity.view.DiscussgeshouxinxiView;


/**
 * 歌手信息评论表
 *
 * @author 
 * @email 
 * @date 2024-05-05 21:41:04
 */
public interface DiscussgeshouxinxiService extends IService<DiscussgeshouxinxiEntity> {

    PageUtils queryPage(Map<String, Object> params);
    
   	List<DiscussgeshouxinxiVO> selectListVO(Wrapper<DiscussgeshouxinxiEntity> wrapper);
   	
   	DiscussgeshouxinxiVO selectVO(@Param("ew") Wrapper<DiscussgeshouxinxiEntity> wrapper);
   	
   	List<DiscussgeshouxinxiView> selectListView(Wrapper<DiscussgeshouxinxiEntity> wrapper);
   	
   	DiscussgeshouxinxiView selectView(@Param("ew") Wrapper<DiscussgeshouxinxiEntity> wrapper);
   	
   	PageUtils queryPage(Map<String, Object> params,Wrapper<DiscussgeshouxinxiEntity> wrapper);

   	

}


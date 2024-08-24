package com.service.impl;

import org.springframework.stereotype.Service;
import java.util.Map;
import java.util.List;

import com.baomidou.mybatisplus.mapper.Wrapper;
import com.baomidou.mybatisplus.mapper.EntityWrapper;
import com.baomidou.mybatisplus.plugins.Page;
import com.baomidou.mybatisplus.service.impl.ServiceImpl;
import com.utils.PageUtils;
import com.utils.Query;


import com.dao.DiscussgeshouxinxiDao;
import com.entity.DiscussgeshouxinxiEntity;
import com.service.DiscussgeshouxinxiService;
import com.entity.vo.DiscussgeshouxinxiVO;
import com.entity.view.DiscussgeshouxinxiView;

@Service("discussgeshouxinxiService")
public class DiscussgeshouxinxiServiceImpl extends ServiceImpl<DiscussgeshouxinxiDao, DiscussgeshouxinxiEntity> implements DiscussgeshouxinxiService {
	
	
    @Override
    public PageUtils queryPage(Map<String, Object> params) {
        Page<DiscussgeshouxinxiEntity> page = this.selectPage(
                new Query<DiscussgeshouxinxiEntity>(params).getPage(),
                new EntityWrapper<DiscussgeshouxinxiEntity>()
        );
        return new PageUtils(page);
    }
    
    @Override
	public PageUtils queryPage(Map<String, Object> params, Wrapper<DiscussgeshouxinxiEntity> wrapper) {
		  Page<DiscussgeshouxinxiView> page =new Query<DiscussgeshouxinxiView>(params).getPage();
	        page.setRecords(baseMapper.selectListView(page,wrapper));
	    	PageUtils pageUtil = new PageUtils(page);
	    	return pageUtil;
 	}

    
    @Override
	public List<DiscussgeshouxinxiVO> selectListVO(Wrapper<DiscussgeshouxinxiEntity> wrapper) {
 		return baseMapper.selectListVO(wrapper);
	}
	
	@Override
	public DiscussgeshouxinxiVO selectVO(Wrapper<DiscussgeshouxinxiEntity> wrapper) {
 		return baseMapper.selectVO(wrapper);
	}
	
	@Override
	public List<DiscussgeshouxinxiView> selectListView(Wrapper<DiscussgeshouxinxiEntity> wrapper) {
		return baseMapper.selectListView(wrapper);
	}

	@Override
	public DiscussgeshouxinxiView selectView(Wrapper<DiscussgeshouxinxiEntity> wrapper) {
		return baseMapper.selectView(wrapper);
	}


}

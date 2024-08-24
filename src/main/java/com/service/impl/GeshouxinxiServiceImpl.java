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


import com.dao.GeshouxinxiDao;
import com.entity.GeshouxinxiEntity;
import com.service.GeshouxinxiService;
import com.entity.vo.GeshouxinxiVO;
import com.entity.view.GeshouxinxiView;

@Service("geshouxinxiService")
public class GeshouxinxiServiceImpl extends ServiceImpl<GeshouxinxiDao, GeshouxinxiEntity> implements GeshouxinxiService {
	
	
    @Override
    public PageUtils queryPage(Map<String, Object> params) {
        Page<GeshouxinxiEntity> page = this.selectPage(
                new Query<GeshouxinxiEntity>(params).getPage(),
                new EntityWrapper<GeshouxinxiEntity>()
        );
        return new PageUtils(page);
    }
    
    @Override
	public PageUtils queryPage(Map<String, Object> params, Wrapper<GeshouxinxiEntity> wrapper) {
		  Page<GeshouxinxiView> page =new Query<GeshouxinxiView>(params).getPage();
	        page.setRecords(baseMapper.selectListView(page,wrapper));
	    	PageUtils pageUtil = new PageUtils(page);
	    	return pageUtil;
 	}

    
    @Override
	public List<GeshouxinxiVO> selectListVO(Wrapper<GeshouxinxiEntity> wrapper) {
 		return baseMapper.selectListVO(wrapper);
	}
	
	@Override
	public GeshouxinxiVO selectVO(Wrapper<GeshouxinxiEntity> wrapper) {
 		return baseMapper.selectVO(wrapper);
	}
	
	@Override
	public List<GeshouxinxiView> selectListView(Wrapper<GeshouxinxiEntity> wrapper) {
		return baseMapper.selectListView(wrapper);
	}

	@Override
	public GeshouxinxiView selectView(Wrapper<GeshouxinxiEntity> wrapper) {
		return baseMapper.selectView(wrapper);
	}


}

package com.xulala.SSMTemplate.service;

import com.github.pagehelper.PageHelper;
import com.github.pagehelper.PageInfo;
import com.xulala.SSMTemplate.dao.AgencyKeyMapper;
import com.xulala.SSMTemplate.entity.AgencyKey;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

/**
 * Created by Administrator on 2018/1/12 0012.
 */
@Service
public class TestService {

    @Autowired
    private AgencyKeyMapper agencyKeyMapper;
    public PageInfo<AgencyKey> find(){
        PageHelper.startPage(1, 10);
        List<AgencyKey> list = agencyKeyMapper.selectAll();
        PageInfo<AgencyKey> pageInfo = new PageInfo<AgencyKey>(list);
        return pageInfo;
    }
}

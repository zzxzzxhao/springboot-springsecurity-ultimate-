package com.deceen.demo.service.impl;

import com.deceen.demo.dao.DemoMapper;
import com.deceen.demo.entity.DemoEntity;
import com.deceen.demo.service.DemoService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

/**
 * @author: zzx
 * @date: 2018/10/25 17:03
 * @description:
 */
@Service
public class DemoServiceImpl implements DemoService {

    @Autowired
    private DemoMapper demoMapper;

    @Override
    public List<DemoEntity> getUser() {
        return demoMapper.getUser();
    }
}

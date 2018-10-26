package com.deceen.demo.dao;

import com.deceen.demo.entity.DemoEntity;
import org.springframework.stereotype.Component;

import java.util.List;

/**
 * @author: zzx
 * @date: 2018/10/25 17:05
 * @description:
 */
@Component
public interface DemoMapper {

    List<DemoEntity> getUser();

}

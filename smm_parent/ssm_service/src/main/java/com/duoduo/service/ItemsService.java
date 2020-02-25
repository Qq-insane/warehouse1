package com.duoduo.service;

import com.duoduo.pojo.Items;

import java.util.List;

/**
 * @author 刘奕鹏
 * @date 2020/2/23 16:54
 */
public interface ItemsService {
    List<Items> findAll();
    int save(Items items);
}

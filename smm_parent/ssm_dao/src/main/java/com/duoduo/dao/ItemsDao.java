package com.duoduo.dao;

import com.duoduo.pojo.Items;

import java.util.List;

/**
 * @author 刘奕鹏
 * @date 2020/2/23 16:26
 */
public interface ItemsDao {
    List<Items> findAll();
    int save(Items items);
}

package com.duoduo.service.impl;

import com.duoduo.dao.ItemsDao;
import com.duoduo.pojo.Items;
import com.duoduo.service.ItemsService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

/**
 * @author 刘奕鹏
 * @date 2020/2/23 16:59
 */
@Service
public class ItemsServiceImpl implements ItemsService {
    @Autowired
    private ItemsDao itemsDao;
    @Override
    public List<Items> findAll(){
        List<Items> all = itemsDao.findAll();
        return all;
    }

    @Override
    public int save(Items items) {
        int save = itemsDao.save(items);
        return save;
    }
}

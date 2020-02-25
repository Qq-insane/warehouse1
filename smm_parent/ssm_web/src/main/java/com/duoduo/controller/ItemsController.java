package com.duoduo.controller;

import com.duoduo.pojo.Items;
import com.duoduo.service.ItemsService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;

import java.util.List;

/**
 * @author 刘奕鹏
 * @date 2020/2/23 17:23
 */
@Controller
@RequestMapping("items")
public class ItemsController {
    @Autowired
    private ItemsService itemsService;
    @RequestMapping("findAll")
    public String findAll(Model model){
        List<Items> all = itemsService.findAll();
        model.addAttribute("items",all);
        return "items";
    }
    @RequestMapping("save")
    public String save(Items items){
        itemsService.save(items);
        return "redirect:/items/findAll";
    }
}

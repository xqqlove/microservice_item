package com.yiwa.item.controller;

import com.yiwa.item.config.JdbcConfigBean;
import com.yiwa.item.entity.Item;
import com.yiwa.item.service.ItemService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class ItemController {
    @Value("${server.port}")
    private String port;
    @Autowired
    private  ItemService itemService;
    @Autowired
    private JdbcConfigBean jdbcConfigBean;

    @GetMapping(value = "item/{id}")
    public Item queryItemById(@PathVariable("id") Long id){
        return this.itemService.queryItemById(id);
    }

    @GetMapping(value = "testconfig")
    public String testconfig(){
        return this.jdbcConfigBean.toString();
    }
}

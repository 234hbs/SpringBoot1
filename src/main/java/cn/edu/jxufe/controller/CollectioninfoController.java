package cn.edu.jxufe.controller;

import cn.edu.jxufe.entity.Collectioninfo;
import cn.edu.jxufe.service.CollectioninfoService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

import java.util.List;

/**
 * Created by WZY on 2018/8/7.
 */@Controller
public class CollectioninfoController {
    @Autowired
    CollectioninfoService collectioninfoService;
    @RequestMapping("findAllCollertioninfo")
    @ResponseBody
    public List<Collectioninfo> findAllCollertionInfo() {
        return collectioninfoService.findAllCollertioninfo();
    }


    //dadsadad
}

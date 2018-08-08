package cn.edu.jxufe.controller;

import cn.edu.jxufe.service.GoodsinfoService;
import cn.edu.jxufe.entity.Goodsinfo;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

import java.util.List;

/**
 * Created by WZY on 2018/8/7.
 */@Controller
public class GoodsInfoController {
    @Autowired
    GoodsinfoService goodsInfoService;
    @RequestMapping("findAllGoodsinfo")
    @ResponseBody
    public List<Goodsinfo> findAllGoodsinfo() {
        return goodsInfoService.findAllGoodsinfo();
    }
}

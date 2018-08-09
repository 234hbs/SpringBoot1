package cn.edu.jxufe.controller;

import cn.edu.jxufe.entity.Orderinfo;
import cn.edu.jxufe.entity.OrderinfoGoods;
import cn.edu.jxufe.service.OrderinfogoodsService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

import java.util.List;

/**
 * Created by THINK on 2018/8/8.
 */
@Controller
public class OrderinfogoodsController {
    @Autowired
    private OrderinfogoodsService orderinfogoodsService;

    @ResponseBody
    @RequestMapping("findAllOrdergoods")
    public List<OrderinfoGoods> findAllOrder(){

        return orderinfogoodsService.findAllOrderGoods();
    }
}

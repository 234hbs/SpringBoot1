package cn.edu.jxufe.controller;

import cn.edu.jxufe.entity.Memberinfo;
import cn.edu.jxufe.entity.Orderinfo;
import cn.edu.jxufe.service.MemberinfoService;
import cn.edu.jxufe.service.OrderinfoService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

import java.util.List;

/**
 * Created by THINK on 2018/8/8.
 */
@Controller
public class OrderinfoController {

    @Autowired
    private OrderinfoService orderinfoService;

    @ResponseBody
    @RequestMapping("findAllOrder")
    public List<Orderinfo> findAllOrder(){
        return orderinfoService.findAllOrder();
    }
}

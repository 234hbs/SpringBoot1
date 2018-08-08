package cn.edu.jxufe.controller;

import cn.edu.jxufe.entity.OrderinfoGoods;
import cn.edu.jxufe.entity.Searchinfo;
import cn.edu.jxufe.service.OrderinfogoodsService;
import cn.edu.jxufe.service.SearchinfoService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

import java.util.List;

/**
 * Created by THINK on 2018/8/8.
 */
@Controller
public class SearchinfoController {
    @Autowired
    private SearchinfoService searchinfoService;

    @ResponseBody
    @RequestMapping("findAllSearchinfo")
    public List<Searchinfo> findAllSearchinfo(){
        return searchinfoService.findAllSearchinfo();
    }
}

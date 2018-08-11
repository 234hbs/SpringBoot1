package cn.edu.jxufe.controller;

import cn.edu.jxufe.service.GoodsCategoryService;
import cn.edu.jxufe.entity.GoodsCategory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

import java.util.List;

/**
 * Created by WZY on 2018/8/7.
 */
@Controller
public class GoodsCategoryController {
    @Autowired//自动注入
    GoodsCategoryService goodsCategoryService;
    @RequestMapping("category")
    public String toCategory(ModelMap map){
        List<GoodsCategory> catelist=goodsCategoryService.findGoodsCategory();
        map.put("catelist",catelist);
        return "category";
    }
}

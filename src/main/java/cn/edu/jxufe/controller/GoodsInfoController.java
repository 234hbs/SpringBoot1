package cn.edu.jxufe.controller;
import cn.edu.jxufe.service.AdvertisementService;
import cn.edu.jxufe.service.GoodsinfoService;
import cn.edu.jxufe.entity.Goodsinfo;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

import java.util.List;

/**
 * Created by WZY on 2018/8/7.
 *
 */

@Controller
public class GoodsInfoController {
    @Autowired
    GoodsinfoService goodsInfoService;
    @Autowired
    private AdvertisementService advertisementService;

    @RequestMapping("findGoods")
    @ResponseBody
    public List<Goodsinfo> findAllGoodsinfo() {

        return goodsInfoService.findAllGoodsinfo();
    }

    @RequestMapping("index")
    public String findAllGoods(ModelMap map){
        map.put("goods",goodsInfoService.findAllGoodsinfo());
        map.put("advs",advertisementService.findOnLineAdv());
        return "index";
    }

    @RequestMapping("goodsinfo{gid}")
    public String gotoGoods(@PathVariable("gid") int goodis,ModelMap map){
        Goodsinfo goodsinfo=goodsInfoService.findGoodsByGid(goodis);
        map.put("g",goodsinfo);
        return "product";
    }

    @RequestMapping("goodsinfocategory{cid}")
    @ResponseBody
    public Object getGoodsInfoByCategory(@PathVariable("cid") int cid){
        return goodsInfoService.findGoodsByCategory(cid);
    }

}

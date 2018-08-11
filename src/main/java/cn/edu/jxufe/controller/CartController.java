package cn.edu.jxufe.controller;

import cn.edu.jxufe.entity.Goodsinfo;
import cn.edu.jxufe.entity.GouWuPing;
import cn.edu.jxufe.service.GoodsinfoService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.ResponseBody;

import javax.servlet.http.HttpSession;
import java.util.HashMap;
import java.util.Map;

/**
 * Created by 29079 on 2018/8/10.
 */
@Controller
public class CartController {
    @Autowired
    GoodsinfoService goodsinfoService;

    @RequestMapping("putCart")
    @ResponseBody

    public Object putcart(int goodsid, HttpSession session) {
        try {
            //通过商品ID获取商品详情信息
            Goodsinfo goodsinfo = goodsinfoService.findGoodsByGid(goodsid);
            //将商品信息封装成购物品信息
            if(goodsinfo!=null) {
                GouWuPing g = new GouWuPing(goodsinfo, 1);
                //从session 中查找购物车对象；
                Map<Integer, GouWuPing> cart = (Map<Integer, GouWuPing>) session.getAttribute("cart");
                //如果没购物车，创建购物车
                if (cart == null) {
                    cart = new HashMap();
                }
                //商品放入购物车中,放之前先查看购物车中是否存在该商品
                GouWuPing goods = cart.get(goodsid);
                //如果不存在此商品
                if (goods == null) {
                    cart.put(goodsid, g);
                } else {
                    goods.setCount(goods.getCount() + 1);//如果存在此商品，则购买数量加一
                }
                session.setAttribute("cart", cart);

                return "success";
            }else{
                return "empty";
            }

        } catch (Exception ex) {
            ex.printStackTrace();
            return "error";
        }


    }

    @RequestMapping("getCart")
    @ResponseBody
    public Object getCart(HttpSession session){
        Map<Integer,GouWuPing> map=(Map<Integer,GouWuPing>)session.getAttribute("cart");
        return map;
    }

}


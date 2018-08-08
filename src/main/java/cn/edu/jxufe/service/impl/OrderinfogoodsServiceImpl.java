package cn.edu.jxufe.service.impl;

import cn.edu.jxufe.dao.OrderinfoGoodsDAO;
import cn.edu.jxufe.entity.OrderinfoGoods;
import cn.edu.jxufe.service.OrderinfogoodsService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

import java.util.List;

/**
 * Created by THINK on 2018/8/8.
 */
@Service
public class OrderinfogoodsServiceImpl implements OrderinfogoodsService{
    @Autowired
    OrderinfoGoodsDAO orderinfoGoodsDAO;

    @Override
    public List<OrderinfoGoods> findAllOrderGoods() {
        return orderinfoGoodsDAO.findAllOrderGoods();
    }
}

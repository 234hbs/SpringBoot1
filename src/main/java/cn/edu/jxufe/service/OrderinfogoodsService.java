package cn.edu.jxufe.service;

import cn.edu.jxufe.entity.OrderinfoGoods;
import org.springframework.stereotype.Service;

import java.util.List;

/**
 * Created by THINK on 2018/8/8.
 */

public interface OrderinfogoodsService {
    public List<OrderinfoGoods> findAllOrderGoods();
}

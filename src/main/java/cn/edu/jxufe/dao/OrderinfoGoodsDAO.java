package cn.edu.jxufe.dao;

import cn.edu.jxufe.entity.OrderinfoGoods;
import org.springframework.stereotype.Repository;

import java.util.List;

/**
 * OrderinfoGoodsDAO继承基类
 */
@Repository
public interface OrderinfoGoodsDAO extends MyBatisBaseDao<OrderinfoGoods, Integer> {
    public List<OrderinfoGoods> findAllOrderGoods();
}
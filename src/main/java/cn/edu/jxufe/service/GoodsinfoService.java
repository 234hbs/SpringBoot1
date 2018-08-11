package cn.edu.jxufe.service;

import cn.edu.jxufe.entity.Goodsinfo;
import org.springframework.stereotype.Service;

import java.util.List;

/**
 * Created by WZY on 2018/8/7.
 */@Service
public interface GoodsinfoService {
    //查询所有商品
    public List<Goodsinfo> findAllGoodsinfo();

    /**
     * 根据商品id查询商品详情的方法
     * @param goodis
     * return
     */
    Goodsinfo findGoodsByGid(int goodis);

    List<Goodsinfo> findGoodsByCategory(int categoryid);
}

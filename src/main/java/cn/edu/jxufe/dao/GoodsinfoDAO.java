package cn.edu.jxufe.dao;

import cn.edu.jxufe.entity.Goodsinfo;
import org.springframework.stereotype.Repository;

import java.util.List;

/**
 * GoodsinfoDAO继承基类
 */
@Repository
public interface GoodsinfoDAO extends MyBatisBaseDao<Goodsinfo, Integer> {
    //查询所有商品
    public List<Goodsinfo> findAllGoodsinfo();


}
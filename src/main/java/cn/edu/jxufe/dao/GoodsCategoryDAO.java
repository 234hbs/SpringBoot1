package cn.edu.jxufe.dao;

import cn.edu.jxufe.entity.GoodsCategory;
import cn.edu.jxufe.entity.Goodsinfo;
import org.apache.ibatis.annotations.Param;
import org.springframework.stereotype.Repository;

import java.util.List;
import java.util.Map;

/**
 * GoodsCategoryDAO继承基类
 */
@Repository
public interface GoodsCategoryDAO extends MyBatisBaseDao<GoodsCategory, Integer> {
    //查找商品类别
    public List<GoodsCategory> findGoodsCategory();
}
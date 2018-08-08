package cn.edu.jxufe.service.impl;

import cn.edu.jxufe.controller.service.GoodsCategoryService;
import cn.edu.jxufe.dao.GoodsCategoryDAO;
import cn.edu.jxufe.entity.GoodsCategory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

/**
 * Created by WZY on 2018/8/7.
 */@Service
public class GoodsCategoryServiceImpl implements GoodsCategoryService {
    @Autowired
    GoodsCategoryDAO goodsCategoryDAO;
    @Override
    public List<GoodsCategory> findAllGoodsCategory() {
        return goodsCategoryDAO.findAllGoodsCategory();
    }
}

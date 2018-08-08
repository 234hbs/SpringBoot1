package cn.edu.jxufe.service.impl;

import cn.edu.jxufe.service.GoodsinfoService;
import cn.edu.jxufe.dao.GoodsinfoDAO;
import cn.edu.jxufe.entity.Goodsinfo;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

/**
 * Created by WZY on 2018/8/7.
 */@Service
public class GoodsinfoServiceImpl implements GoodsinfoService {
    @Autowired
    GoodsinfoDAO goodsinfoDAO;
    @Override
    public List<Goodsinfo> findAllGoodsinfo() {
        return goodsinfoDAO.findAllGoodsinfo();
    }
}

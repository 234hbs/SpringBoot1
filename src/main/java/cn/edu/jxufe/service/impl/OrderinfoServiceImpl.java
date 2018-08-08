package cn.edu.jxufe.service.impl;

import cn.edu.jxufe.dao.OrderinfoDAO;
import cn.edu.jxufe.entity.Memberinfo;
import cn.edu.jxufe.entity.Orderinfo;
import cn.edu.jxufe.service.OrderinfoService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

/**
 * Created by THINK on 2018/8/8.
 */
@Service
public class OrderinfoServiceImpl implements OrderinfoService{
    @Autowired
    OrderinfoDAO orderinfoDAO;

    @Override
    public List<Orderinfo> findAllOrder() {
        return orderinfoDAO.findAllOrder();
    }
}

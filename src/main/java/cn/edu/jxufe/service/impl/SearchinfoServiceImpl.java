package cn.edu.jxufe.service.impl;

import cn.edu.jxufe.dao.OrderinfoDAO;
import cn.edu.jxufe.dao.SearchinfoDAO;
import cn.edu.jxufe.entity.Orderinfo;
import cn.edu.jxufe.entity.Searchinfo;
import cn.edu.jxufe.service.SearchinfoService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

/**
 * Created by THINK on 2018/8/8.
 */
@Service
public class SearchinfoServiceImpl implements SearchinfoService{
    @Autowired
    SearchinfoDAO searchinfoDAO;

    @Override
    public List<Searchinfo> findAllSearchinfo() {
        return searchinfoDAO.findAllSearchinfo();
    }
}

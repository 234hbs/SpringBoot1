package cn.edu.jxufe.service.impl;

import cn.edu.jxufe.dao.CollectioninfoDAO;
import cn.edu.jxufe.entity.Collectioninfo;
import cn.edu.jxufe.service.CollectioninfoService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

/**
 * Created by WZY on 2018/8/7.
 */@Service
public class CollectioninfoServiceImpl implements CollectioninfoService {
    @Autowired
    CollectioninfoDAO collectioninfo;
    @Override
    public List<Collectioninfo> findAllCollertioninfo() {
        return collectioninfo.findAllCollertioninfo();
    }
}

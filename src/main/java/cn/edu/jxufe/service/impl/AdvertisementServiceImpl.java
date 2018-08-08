package cn.edu.jxufe.service.impl;

import cn.edu.jxufe.dao.AdvertisementDAO;
import cn.edu.jxufe.entity.Advertisement;
import cn.edu.jxufe.service.AdvertisementService;
import com.github.pagehelper.PageHelper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

/**
 * Created by 29079 on 2018/8/7.
 */
@Service
public class AdvertisementServiceImpl implements AdvertisementService {
    @Autowired
    AdvertisementDAO advertisementDAO;
    @Override
    public List<Advertisement> findAllAdvertisement(){

        return advertisementDAO.findAllAdvertisement();
    }

    @Override
    public List<Advertisement> findOnLineAdv() {
        PageHelper.startPage(1,6);
        return advertisementDAO.findOnLineAdv();
    }
}

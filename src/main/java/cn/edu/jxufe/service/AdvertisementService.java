package cn.edu.jxufe.service;

import cn.edu.jxufe.entity.Advertisement;

import java.util.List;

/**
 * Created by 29079 on 2018/8/7.
 */
public interface AdvertisementService {
    //查询所有广告
    public List<Advertisement> findAllAdvertisement();
    //查找在线广告
    public List<Advertisement> findOnLineAdv();
}

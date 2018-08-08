package cn.edu.jxufe.dao;

import cn.edu.jxufe.entity.Advertisement;
import org.springframework.stereotype.Repository;

import java.util.List;

/**
 * AdvertisementDAO继承基类
 */
@Repository
public interface AdvertisementDAO extends MyBatisBaseDao<Advertisement, Integer> {
    //查询所有广告
    public List<Advertisement> findAllAdvertisement();
    //查询在线广告
    public List<Advertisement> findOnLineAdv();
}
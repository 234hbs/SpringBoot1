package cn.edu.jxufe.dao;

import cn.edu.jxufe.entity.Admin;
import org.springframework.stereotype.Repository;

import java.util.List;

/**
 * AdminDAO继承基类
 */
@Repository
public interface AdminDAO extends MyBatisBaseDao<Admin, Integer> {
    //查询所有管理员
    public List<Admin> findAllAdmin();
}
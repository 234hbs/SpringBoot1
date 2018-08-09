package cn.edu.jxufe.service.impl;

import cn.edu.jxufe.dao.AdminDAO;
import cn.edu.jxufe.entity.Admin;
import cn.edu.jxufe.service.AdminService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

/**
 * Created by 29079 on 2018/8/8.
 */
@Service
public class AdminServiceImpl implements AdminService {
    @Autowired
    AdminDAO adminDAO;
    @Override
    public List<Admin> findAllAdmin() {
        return adminDAO.findAllAdmin();
    }
}

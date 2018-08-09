package cn.edu.jxufe.controller;

import cn.edu.jxufe.entity.Admin;
import cn.edu.jxufe.service.AdminService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

import java.util.List;

/**
 * Created by 29079 on 2018/8/7.
 */
@Controller
public class AdminController {
    @Autowired
    private AdminService adminService;

    @ResponseBody
    @RequestMapping("findAll")
    public List<Admin> findAllAdmin(){
        return adminService.findAllAdmin();
    }
}

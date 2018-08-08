package cn.edu.jxufe.controller;

import cn.edu.jxufe.entity.Memberinfo;
import cn.edu.jxufe.service.MemberinfoService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

import java.util.List;

/**
 * Created by THINK on 2018/8/8.
 */
@Controller
public class MemberinfoController {
    @Autowired
    private MemberinfoService memberinfoService;

    @ResponseBody
    @RequestMapping("findAllMember")
    public List<Memberinfo> findAllMember(){
        return memberinfoService.findAllMember();
    }
}

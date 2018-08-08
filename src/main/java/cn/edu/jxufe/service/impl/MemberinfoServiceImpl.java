package cn.edu.jxufe.service.impl;

import cn.edu.jxufe.dao.MemberinfoDAO;
import cn.edu.jxufe.entity.Memberinfo;
import cn.edu.jxufe.service.MemberinfoService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

/**
 * Created by THINK on 2018/8/8.
 */
@Service
public class MemberinfoServiceImpl implements MemberinfoService{
    @Autowired
    MemberinfoDAO memberinfoDAO;

    @Override
    public List<Memberinfo> findAllMember() {
        return memberinfoDAO.findAllMember();
    }
}

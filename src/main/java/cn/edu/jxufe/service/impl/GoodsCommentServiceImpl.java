package cn.edu.jxufe.service.impl;

import cn.edu.jxufe.service.GoodsCommentService;
import cn.edu.jxufe.dao.GoodsCommentDAO;
import cn.edu.jxufe.entity.GoodsComment;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

/**
 * Created by WZY on 2018/8/7.
 */@Service
public class GoodsCommentServiceImpl implements GoodsCommentService {
     @Autowired
     GoodsCommentDAO goodsComment;
    @Override
    public List<GoodsComment> findAllGoodsComment() {
        return goodsComment.findAllGoodsComment();
    }
}

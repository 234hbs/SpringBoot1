package cn.edu.jxufe.controller;

import cn.edu.jxufe.service.GoodsCommentService;
import cn.edu.jxufe.entity.GoodsComment;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

import java.util.List;

/**
 * Created by WZY on 2018/8/7.
 */@Controller
public class GoodsCommentController {
    @Autowired
    GoodsCommentService goodsComment;
    @RequestMapping("findAllGoodsComment")
    @ResponseBody
    public List<GoodsComment> findAllGoodService(){
        return goodsComment.findAllGoodsComment();
    }
}

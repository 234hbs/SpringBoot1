package cn.edu.jxufe.service;

import cn.edu.jxufe.entity.GoodsComment;
import org.springframework.stereotype.Service;

import java.util.List;

/**
 * Created by WZY on 2018/8/7.
 */@Service
public interface GoodsCommentService {
    public List<GoodsComment> findAllGoodsComment();
}

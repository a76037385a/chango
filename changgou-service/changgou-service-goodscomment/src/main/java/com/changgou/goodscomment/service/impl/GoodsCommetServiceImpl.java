package com.changgou.goodscomment.service.impl;

import com.changgou.goodscomment.dao.GoodsCommentDao;
import com.changgou.goodscomment.pojo.Comment;
import com.changgou.goodscomment.service.GoodsCommentService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class GoodsCommetServiceImpl implements GoodsCommentService {
    @Autowired
    private GoodsCommentDao goodsCommentDao;
    @Override
    public List<Comment> findCommentBySkuid(Integer id) {
        Comment comment = new Comment();
        comment.setSkuid(id);
        return goodsCommentDao.select(comment);
    }

    @Override
    public void add(Comment comment) {
        goodsCommentDao.insertSelective(comment);
    }
}

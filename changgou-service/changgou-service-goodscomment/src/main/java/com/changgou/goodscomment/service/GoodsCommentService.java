package com.changgou.goodscomment.service;

import com.changgou.goodscomment.pojo.Comment;

import java.util.List;

public interface GoodsCommentService {
    List<Comment> findCommentBySkuid(Integer id);

    void add(Comment comment);
}

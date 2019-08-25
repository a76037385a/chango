package com.changgou.goodscomment.controller;

import com.changgou.goodscomment.pojo.Comment;
import com.changgou.goodscomment.service.GoodsCommentService;
import entity.Result;
import entity.StatusCode;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/comment")
@CrossOrigin
public class GoodsCommentController {
    @Autowired
    private GoodsCommentService goodsCommentService;
    @RequestMapping("/goods/{id}")
    public Result<List<Comment>> findCommentBySkuid(@PathVariable Integer id){
        List<Comment> commentList = goodsCommentService.findCommentBySkuid(id);
        return new Result<List<Comment>>(true, StatusCode.OK,"查询成功!",commentList);

    }
    @PostMapping
    public Result add(@RequestBody Comment comment){
        goodsCommentService.add(comment);
        return new Result(true,StatusCode.OK,"添加成功");
    }
}

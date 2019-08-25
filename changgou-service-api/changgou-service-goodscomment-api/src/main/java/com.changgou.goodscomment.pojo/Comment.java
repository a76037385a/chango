package com.changgou.goodscomment.pojo;

import javax.persistence.Column;
import javax.persistence.Id;
import javax.persistence.Table;
import java.io.Serializable;
import java.util.Date;

@Table(name="comment")
public class Comment implements Serializable {

    @Id
    @Column(name = "id")
    private Integer id;//ID

    @Column(name = "skuid")
    private Integer skuid;//

    @Column(name = "content")
    private String content;//评论内容

    @Column(name = "username")
    private String username;//用户姓名

    @Column(name = "pic")
    private String pic;//评论图片地址

    @Column(name = "score")
    private Integer score;//评价星级

    @Column(name = "addcomment")
   private String addcomment;//追加评论

    @Column(name = "favorite")
    private int favorite;//点赞数

    @Column(name = "reply")
    private String reply;//回复评论

    @Column(name = "commentdate")
    private Date commentdate;//评论时间

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public Integer getSkuid() {
        return skuid;
    }

    public void setSkuid(Integer skuid) {
        this.skuid = skuid;
    }

    public String getContent() {
        return content;
    }

    public void setContent(String content) {
        this.content = content;
    }

    public String getUsername() {
        return username;
    }

    public void setUsername(String username) {
        this.username = username;
    }

    public String getPic() {
        return pic;
    }

    public void setPic(String pic) {
        this.pic = pic;
    }

    public Integer getScore() {
        return score;
    }

    public void setScore(Integer score) {
        this.score = score;
    }

    public String getAddcomment() {
        return addcomment;
    }

    public void setAddcomment(String addcomment) {
        this.addcomment = addcomment;
    }

    public int getFavorite() {
        return favorite;
    }

    public void setFavorite(int favorite) {
        this.favorite = favorite;
    }

    public String getReply() {
        return reply;
    }

    public void setReply(String reply) {
        this.reply = reply;
    }

    public Date getCommentdate() {
        return commentdate;
    }

    public void setCommentdate(Date commentdate) {
        this.commentdate = commentdate;
    }
}




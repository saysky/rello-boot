package com.example.ssm.rental.entity;

import com.baomidou.mybatisplus.annotation.TableField;
import com.baomidou.mybatisplus.annotation.TableName;
import com.example.ssm.rental.common.base.BaseEntity;

/**
 * 评论
 *
 * @author example
 * @date 2022/4/23 12:16 下午
 */
@TableName("t_comment")
public class Comment extends BaseEntity {

    /**
     * 内容
     */
    private String content;

    /**
     * 留言用户ID
     */
    private Long userId;

    /**
     * 文章用户ID
     */
    private Long postUserId;

    /**
     * 文章ID
     */
    private Long postId;

    @TableField(exist = false)
    private Post post;

    @TableField(exist = false)
    private User user;

    public String getContent() {
        return content;
    }

    public void setContent(String content) {
        this.content = content;
    }

    public Long getUserId() {
        return userId;
    }

    public void setUserId(Long userId) {
        this.userId = userId;
    }

    public Long getPostUserId() {
        return postUserId;
    }

    public void setPostUserId(Long postUserId) {
        this.postUserId = postUserId;
    }

    public Long getPostId() {
        return postId;
    }

    public void setPostId(Long postId) {
        this.postId = postId;
    }

    public Post getPost() {
        return post;
    }

    public void setPost(Post post) {
        this.post = post;
    }

    public User getUser() {
        return user;
    }

    public void setUser(User user) {
        this.user = user;
    }
}

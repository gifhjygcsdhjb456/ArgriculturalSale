package com.qst.crop.service;

import com.qst.crop.entity.Comment;
import com.qst.crop.entity.Discuss;

import java.util.List;

public interface CommentService {
    void add(Comment comment);

    List<Comment> selectComment(Integer orderId);
}

package com.qst.crop.service.impl;

import com.qst.crop.dao.CommentDao;
import com.qst.crop.dao.DiscussDao;
import com.qst.crop.entity.Comment;
import com.qst.crop.entity.Discuss;
import com.qst.crop.service.CommentService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.security.core.context.SecurityContextHolder;
import org.springframework.security.core.userdetails.UserDetails;
import org.springframework.stereotype.Component;

import java.util.Date;
import java.util.List;
@Component
public class CommentServiceImpl implements CommentService {
    @Autowired(required=false)
    private CommentDao commentDao;

    @Override
    public void add(Comment comment) {
        commentDao.insertComment(comment);
    }
    @Override
    public List<Comment> selectComment(Integer orderId) {
        List<Comment> Comments = commentDao.selectComment(orderId);
        return Comments;
    }
}

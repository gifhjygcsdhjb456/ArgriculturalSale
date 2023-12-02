package com.qst.crop.dao;

import com.qst.crop.entity.Comment;
import com.qst.crop.entity.Discuss;
import org.apache.ibatis.annotations.Param;
import org.springframework.stereotype.Component;
import org.springframework.stereotype.Repository;

import java.util.List;

public interface CommentDao {
    int insertComment(Comment comment);

    List<Comment> selectComment(@Param("orderId") Integer orderId);
}

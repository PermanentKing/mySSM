package com.mySSM.dao;


import com.mySSM.entity.Comment;
import org.apache.ibatis.annotations.Param;

import java.util.List;

public interface CommentDao {

    List<Comment> getCommentByUsername(@Param("username")String username);

    List<Comment> getCommentByGroupId(@Param("groupid")String groupid);

    void insertComment(Comment comment);

    void deleteComment(Long id);
}

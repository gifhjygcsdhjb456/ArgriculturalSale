package com.qst.crop.entity;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import org.hibernate.validator.constraints.NotBlank;

import java.util.Date;
@Data
@NoArgsConstructor
@AllArgsConstructor
public class Comment {
    private Integer commentId;

    private Integer orderId;

    private String userName;

    @NotBlank(message = "内容不能为空")
    private String content;

    private Date createTime;
    public void setUserName(String userName) {
        this.userName = userName == null ? null : userName.trim();
    }
    public void setContent(String content) {
        this.content = content == null ? null : content.trim();
    }
}

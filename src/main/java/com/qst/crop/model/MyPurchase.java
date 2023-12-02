package com.qst.crop.model;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.math.BigDecimal;
import java.util.Date;

/**
 * @author lzh
 * @creat 2022-08-19 16:49
 */
@Data
@NoArgsConstructor
@AllArgsConstructor
public class MyPurchase {
    private Integer purchaseId;

    private String ownName;

    private Integer purchaseType;

    private BigDecimal totalPrice;

    private String address;

    private Integer purchaseStatus;

    private Date createTime;

    private Date updateTime;
    private String picture;
}

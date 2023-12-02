package com.qst.crop.model;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.math.BigDecimal;
import java.util.Date;

@Data
@NoArgsConstructor
@AllArgsConstructor
public class MyPurchase2 {
    private Integer purchaseId;

    private String realName;

    private Integer purchaseType;

    private BigDecimal sumPrice;

    private String address;

    private Integer purchaseStatus;

    private Date createTime;

    private Date updateTime;
    private String picture;
}

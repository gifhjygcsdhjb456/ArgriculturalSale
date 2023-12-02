package com.qst.crop.entity;

import lombok.Data;

import java.math.BigDecimal;
@Data
public class PurchaseDetail2 {
        private Integer detailId;

        private Integer purchaseId;

        private String orderId;

        private BigDecimal uninPrice;

        private BigDecimal sumPrice;

        private Integer count;

        private String picture;
}

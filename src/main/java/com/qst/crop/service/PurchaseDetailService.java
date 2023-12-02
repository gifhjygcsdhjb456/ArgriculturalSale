package com.qst.crop.service;

import com.qst.crop.entity.PurchaseDetail;
import com.qst.crop.entity.PurchaseDetail2;

import java.util.List;

public interface PurchaseDetailService {

    void add(PurchaseDetail purchaseDetail);

    List<PurchaseDetail2> selectByPurchaseId();

}

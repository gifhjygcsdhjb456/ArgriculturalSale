package com.qst.crop.service.impl;

import com.qst.crop.dao.PurchaseDetailDao;
import com.qst.crop.entity.PurchaseDetail;
import com.qst.crop.entity.PurchaseDetail2;
import com.qst.crop.service.PurchaseDetailService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.security.core.context.SecurityContextHolder;
import org.springframework.security.core.userdetails.UserDetails;
import org.springframework.stereotype.Service;

import java.math.BigDecimal;
import java.util.List;

@Service
public class PurchaseDetailServiceImpl implements PurchaseDetailService {
    @Autowired(required=false)
    private PurchaseDetailDao purchaseDetailDao;

    @Override
    public void add(PurchaseDetail purchaseDetail) {
        purchaseDetailDao.insertSelective(purchaseDetail);
    }

    @Override
    public List<PurchaseDetail2> selectByPurchaseId() {
        System.out.println("查询销售报表");
        List<PurchaseDetail2> purchaseDetails = purchaseDetailDao.selectByPurchaseId();
        System.out.println(purchaseDetails);
        return purchaseDetails;
    }

}

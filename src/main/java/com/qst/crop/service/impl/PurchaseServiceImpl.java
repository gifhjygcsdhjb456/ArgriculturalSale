package com.qst.crop.service.impl;

import com.qst.crop.dao.PurchaseDao;
import com.qst.crop.entity.Purchase;
import com.qst.crop.entity.Shoppingcart;
import com.qst.crop.model.MyPurchase;
import com.qst.crop.model.MyPurchase2;
import com.qst.crop.service.PurchaseService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.security.core.context.SecurityContextHolder;
import org.springframework.security.core.userdetails.UserDetails;
import org.springframework.stereotype.Service;

import java.math.BigDecimal;
import java.util.ArrayList;
import java.util.Date;
import java.util.List;

@Service
public class PurchaseServiceImpl implements PurchaseService {
    @Autowired(required=false)
    private PurchaseDao purchaseDao;

    @Override
    public void add(Purchase purchase) {
        purchaseDao.insertSelective(purchase);
    }

    @Override
    public List<MyPurchase> selectByPurchaseType() {

        //获取用户名
        UserDetails principal = (UserDetails) SecurityContextHolder.getContext().getAuthentication().getPrincipal();
        String name = principal.getUsername();
        //创建Purchase实例，设置用户名，订单类型
//      dasaDsaDda  Purchase purchase= new Purchase();
//        MyPurchase purchase = new MyPurchase();
//        purchase.setOwnName(name);
        System.out.println("查询订单：");
        //查询
        List<MyPurchase> purchases = purchaseDao.selectByPurchase(name);
        List<MyPurchase> purchases2=new ArrayList<MyPurchase>();


        for (MyPurchase purchase : purchases) {

            List<MyPurchase2> p=purchaseDao.selectByPurchase2(purchase.getPurchaseId());
            for (MyPurchase2 p1 : p){
                MyPurchase p2=new MyPurchase(p1.getPurchaseId(), p1.getRealName(), p1.getPurchaseType(), p1.getSumPrice(), p1.getAddress(), p1.getPurchaseStatus(), p1.getCreateTime(),p1.getUpdateTime(), p1.getPicture());
                purchases2.add(p2);
            }
        }
        System.out.println(purchases2);
        return purchases2;
    }

    @Override
    public Purchase selectNewPurchaseId(String ownName) {
        Purchase purchase = purchaseDao.selectNewPurchaseId(ownName);
        return purchase;
    }
}

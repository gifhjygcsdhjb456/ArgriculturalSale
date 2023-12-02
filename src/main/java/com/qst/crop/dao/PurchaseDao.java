package com.qst.crop.dao;

import com.qst.crop.entity.Purchase;
import com.qst.crop.model.MyPurchase;
import com.qst.crop.model.MyPurchase2;
import org.apache.ibatis.annotations.Param;
import org.springframework.test.context.jdbc.Sql;

import java.util.List;

public interface PurchaseDao {

    int insertSelective(Purchase record);




    Purchase selectNewPurchaseId(@Param("ownName")String ownName);


    //List<MyPurchase> selectByPurchase(String name);

    List<MyPurchase> selectByPurchase(@Param("name")String name);

    List<MyPurchase2> selectByPurchase2(@Param("id")Integer purchase_id);
}
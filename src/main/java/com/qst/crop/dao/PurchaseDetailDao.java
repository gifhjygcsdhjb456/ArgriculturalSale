package com.qst.crop.dao;

import com.qst.crop.entity.PurchaseDetail;
import com.qst.crop.entity.PurchaseDetail2;
import org.apache.ibatis.annotations.Param;

import java.util.List;

public interface PurchaseDetailDao {

    int insertSelective(PurchaseDetail record);

    List<PurchaseDetail2> selectByPurchaseId();

}
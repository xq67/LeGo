package com.jinglun.dao;

import java.util.List;

import org.apache.ibatis.annotations.Select;

import com.jinglun.entity.Dealer;
import com.jinglun.entity.DrankA;
import com.jinglun.entity.DrankB;

public interface PageMapper {
	@Select("SELECT * FROM DEALER")
	List<Dealer> findAllDea();  //获取所有的供应商信息
	
	@Select("SELECT * FROM DRANKA")
	List<DrankA> findAllDra();  //获取所有的a级目录
	
	@Select("SELECT db.daId,db.dbName,db.dbPrice,db.dbImgUrl FROM drankb db ORDER BY stock DESC LIMIT 10 ")
	List<DrankB> findAllDrb();  //获取前10条商品
}

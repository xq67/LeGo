package com.jinglun.dao;

import java.util.List;

import org.apache.ibatis.annotations.Param;
import org.apache.ibatis.annotations.Select;

import com.jinglun.entity.Dealer;
import com.jinglun.entity.DrankA;
import com.jinglun.entity.DrankB;
import com.jinglun.entity.Imgurl;
import com.jinglun.entity.Notice;

public interface PageMapper {
	List<Dealer> findAllDea();  //获取所有的供应商信息
	
	List<DrankA> findAllDra();  //获取所有的a级目录
	
	List<DrankB> findAllDrb();  //获取前10条商品
	List<Notice> findNotice();  //获取前3条公告
	public DrankB findDrankBById(@Param("id")Integer id); //通过id获取DrankB信息
	public List<Imgurl> findDbImgById(@Param("id")Integer id); //通过id获取DrankB下图片信息
	//获取热销产品1,//获取推荐产品2
	public List<DrankB> findHotDB(@Param("id")Integer dbpro);


}

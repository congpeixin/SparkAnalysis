package com.zkys.spark.dao;


import com.zkys.spark.domain.SessionRandomExtract;

/**
 * session随机抽取模块DAO接口
 * @author Administrator
 *
 */
public interface ISessionRandomExtractDAO {

	/**
	 * 插入session随机抽取
	 * @param sessionRandomExtract
	 */
	void insert(SessionRandomExtract sessionRandomExtract);
	
}

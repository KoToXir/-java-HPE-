package TelMD.service;

import java.util.List;

import TelMD.po.TelephoneItem;

/**
 * 业务接口
 *
 */
public interface TelephoneManager {
	
	int a = 10;// public final static 常量。
	
	/**
	 * 添加一个tel对象到容器中。输入：TelephoneItem对象    输出：boolean。
	 */
	boolean addTel(TelephoneItem telItem);
	
	/**
	 * 修改 tel对象. 输入：两个（1、oldtel的关键信息 2、新的修改后的对象）   输出boolean
	 * 
	 */
	boolean updateTel(String name,TelephoneItem newTelItem);
	
	boolean updateTel(TelephoneItem oldItem,TelephoneItem newTelItem);
	
	/**
	 * 删除
	 */
	boolean delTel(String name);
	boolean delTel(TelephoneItem item);
	
	/**
	 * 根据姓名name查询对象，返回这个item（TelephoneItem）
	 */
	TelephoneItem getTelephoneByName(String name);
	
	/**
	 * 查询所有的item，返回一个容器集合。List
	 */
	List<TelephoneItem> findAll();

	List<TelephoneItem> findAll(String name);
	
	List<TelephoneItem> findAll(String name,int age);
}

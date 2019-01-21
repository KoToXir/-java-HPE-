package TelMan_New.tel.service;

import java.util.List;

import TelMan_New.tel.po.TelephoneItem;

/**
 * 业务接口
 * @author mygbo
 *
 */
public interface TelephoneManager {
	
	int a = 10;//public final static 常量
	/**
	 * 添加一个tel到容器中。
	 * 输入：TelephoneItem对象
	 * 输出：boolean
	 */
	boolean addTel(TelephoneItem telItem);
	
	
	/**
	 * 修改tel对象
	 * 输入：两个（1、oldtel的关键信息 	2、新的修改后的对象）
	 * 输出：boolean
	 */
	boolean updateTel(String name,TelephoneItem newItem);
	
	boolean updateTel(TelephoneItem oldItem,TelephoneItem newItem);
	
	/**
	 * 删除
	 * 
	 */
	boolean delTel(String name);
	
	boolean delTel(TelephoneItem item);
	
	/**
	 * 查找
	 * 1、根据name查找对象，返回这个item（TelephoneItem）
	 * 2、查询所有的item，返回容器集合。List
	 * 3、模糊查询
	 */
	TelephoneItem getTelephoneByName(String name);
	List<TelephoneItem> findAll();
	
	List<TelephoneItem> findAll(String name);
	
	List<TelephoneItem> findAll(String name,int age);
	
}

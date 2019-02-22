package TelMD.service.impl;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.Map;


import TelMD.po.TelephoneItem;
import TelMD.service.TelephoneManager;
import TelMD.util.DBUtil;

/**
 * 操作数据库的 业务 实现类
 * @author yaohuicheng
 *
 */
public class TelephoneDbImpl implements TelephoneManager {

	/**
	 * 添加一条记录到telephoneItem表。
	 */
	@Override
	public boolean addTel(TelephoneItem item) {
		// 获取操作数据库的类及方法
		int flag = DBUtil.update(" INSERT INTO `hpe`.`TelephoneItem` "
				+ " (`name`, `sex`, `tel`, `addr`, `age`) "
				+ "  VALUES (?,?,?,?,?)  ", 
				new Object[] {item.getName(),item.getSex(),item.getTel(),
						item.getAddr(),item.getAge()});
		// 解析传递的参数。
		
		// 完成数据库操作，得到返回值。
		if(flag == 1) {
			return true;
		}
		return false;
	}

	@Override
	public boolean updateTel(String name, TelephoneItem newTelItem) {
		// 
		int i = DBUtil.update(" UPDATE `hpe`.`TelephoneItem`"
				+ " SET `name`=?, `sex`=?, `tel`=?, `addr`=?, `age`=? "
				+ " WHERE (`name`=?) " , new Object[] {newTelItem.getName(),newTelItem.getSex(),newTelItem.getTel()
						,newTelItem.getAddr(),newTelItem.getAge(),name});
		
		return i == 1 ? true : false;
	}

	@Override
	public boolean updateTel(TelephoneItem oldItem, TelephoneItem newTelItem) {
		return this.updateTel(oldItem.getName(), newTelItem);
	}

	@Override
	public boolean delTel(String name) {
		// TODO Auto-generated method stub
		return false;
	}

	@Override
	public boolean delTel(TelephoneItem item) {
		// TODO Auto-generated method stub
		return false;
	}

	@Override
	public TelephoneItem getTelephoneByName(String name) {
		// 查询出数据
		Map<String, Object> map = 
				DBUtil.getOne("  select * from telephoneitem where name = ? ", new Object[] {name});
		
		// 把map 转化为实体类 telephoneItem
		TelephoneItem item = new TelephoneItem();
		
		item.setAddr((String)map.get("addr"));
		item.setAge((int)map.get("age"));
		item.setName((String)map.get("name"));
		item.setId((int)map.get("id"));
		item.setSex((int)map.get("sex"));
		item.setTel((String)map.get("tel"));
		
		return item;
	}

	@Override
	public List<TelephoneItem> findAll() {
		List<Map<String, Object>> list = DBUtil.getList(" select * from telephoneItem ", null);
		List<TelephoneItem> itemList = new ArrayList<TelephoneItem>();
		
		for (Iterator iterator = list.iterator(); iterator.hasNext();) {
			Map map = (Map) iterator.next();
			
			// 把map 转化为实体类 telephoneItem
			TelephoneItem item = new TelephoneItem();
			
			item.setAddr((String)map.get("addr"));
			item.setAge((int)map.get("age"));
			item.setName((String)map.get("name"));
			item.setId((int)map.get("id"));
			item.setSex((int)map.get("sex"));
			item.setTel((String)map.get("tel"));
			
			itemList.add(item);
		}
		
		return itemList;
	}

	@Override
	public List<TelephoneItem> findAll(String name) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public List<TelephoneItem> findAll(String name, int age) {
		// TODO Auto-generated method stub
		return null;
	}

}

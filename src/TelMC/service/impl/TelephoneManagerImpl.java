package TelMC.service.impl;

import java.awt.event.ItemEvent;
import java.util.ArrayList;
import java.util.List;

import TelMC.po.TelephoneItem;
import TelMC.service.TelephoneManager;

public class TelephoneManagerImpl implements TelephoneManager {

	private static ArrayList<TelephoneItem> telList = new ArrayList<TelephoneItem>();
	
	@Override
	public boolean addTel(TelephoneItem telItem) {
		return telList.add(telItem);
	}

	@Override
	public boolean updateTel(String name, TelephoneItem newTelItem) {
		//1、先查找到这个对象，直接修改对象即可
		for (TelephoneItem dbTel : telList) {
			if(dbTel.getName().equals(name)) {
				//找到了这个对象。它的每一个对象，重新赋值
				dbTel.setName(newTelItem.getName());
				dbTel.setAge(newTelItem.getAge());
				dbTel.setSex(newTelItem.getSex());
				dbTel.setAddr(newTelItem.getAddr());
				dbTel.setTel(newTelItem.getTel());
				return true;
			}
		}
		return false;
	}

	@Override
	public boolean updateTel(TelephoneItem oldItem, TelephoneItem newItem) {
		return this.updateTel(oldItem.getName(), newItem);
	}

	@Override
	public boolean delTel(String name) {
		//1、获取这个删除的对象的地址，通过list种的remove方法删除
		//2、遍历容器找到name对象，通过下标删除。
		TelephoneItem item = this.getTelephoneByName(name);
		return telList.remove(item);
	}

	@Override
	public boolean delTel(TelephoneItem item) {
		TelephoneItem tmpitem = this.getTelephoneByName(item.getName());
		return telList.remove(tmpitem);
	}

	@Override
	public TelephoneItem getTelephoneByName(String name) {
		for (TelephoneItem telephoneItem : telList) {
			if(telephoneItem.getName().equals(name)) {
				return telephoneItem;
			}
		}
		return null;
	}

	@Override
	public List<TelephoneItem> findAll() {
		return telList;
	}

	@Override
	public List<TelephoneItem> findAll(String name) {
		
		List<TelephoneItem> tmpList = new ArrayList<TelephoneItem>();
		
		for (TelephoneItem item : telList) {
			if(item.getName().contains(name)) {
				//找到匹配的item对象
				tmpList.add(item);
			}
		}
		return tmpList;
	}

	@Override
	public List<TelephoneItem> findAll(String name, int age) {
		
		List<TelephoneItem> tmpList = new ArrayList<TelephoneItem>();
		
		for (TelephoneItem item : telList) {
			if(item.getName().contains(name) && item.getAge() == age) {
				//找到匹配的item对象
				tmpList.add(item);
			}
		}
		return tmpList;
	}

}

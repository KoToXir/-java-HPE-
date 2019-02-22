package TelMD.test;

import TelMD.po.TelephoneItem;
import TelMD.service.impl.TelephoneDbImpl;

public class TestDbImpl {
	public static void main(String[] args) {
		
		TelephoneDbImpl db = new TelephoneDbImpl();
		TelephoneItem item = new TelephoneItem();
		item.setAddr("jining");
		item.setAge(20);
		item.setName("张三");
		item.setTel("0537888888");
		item.setSex(1);
		
		boolean rs = db.addTel(item);
		System.out.println(rs == true ? "新增成功" : "失败");
		
		
		
	}
}

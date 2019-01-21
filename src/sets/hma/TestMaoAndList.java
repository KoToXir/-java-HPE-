package sets.hma;

import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Date;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.Set;

/**
 * 封装Hashmap，把map放到arrayList容器
 * @author mygbo
 *
 */
public class TestMaoAndList {
	public static void main(String[] args) {
		
		//定义多个person对象 的实例，把实例放到容器中
		SimpleDateFormat fo = new SimpleDateFormat("yyyy.MM.dd-hh:mm:ss");
		Date now1 = new Date();
		Person p1 = new Person("张三", "男", 1, 10, fo.format(now1));
		try {
			Thread.sleep(1000);
		} catch (InterruptedException e) {
			// TODO 自动生成的 catch 块
			e.printStackTrace();
		}
		
		Date now2 = new Date();
		Person p2 = new Person("李四", "男", 2, 20, fo.format(now2));
		
		//定义一个容器 list容器person{name,id,sex,age,credate}
		List<Person> personList = new ArrayList<Person>();
		personList.add(p1);
		personList.add(p2);
		
		//定义多个person属性值为key的map，把map的实例放到实例中
		//用map替换person
		Map<String , Object> personMap1 = new HashMap<String ,Object>();
		Map<String , Object> personMap2 = new HashMap<String ,Object>();
		
		personMap1.put("id", 1);	//从语法上，只要是string都可以，key{id,name,sex,age,credate}
		personMap1.put("name", "小明");
		personMap1.put("sex", "男");
		personMap1.put("age", 21);
		personMap1.put("credate", "2019-01-11");
		
		personMap2.put("id", 1);	
		personMap2.put("name", "小李");
		personMap2.put("sex", "男");
		personMap2.put("age", 22);
		personMap2.put("credate", "2019-02-12");
		
		//定义一个容器 list容器map
		ArrayList<Map<String , Object>> pmapList =new ArrayList<Map<String , Object>>();
		pmapList.add(personMap1);
		pmapList.add(personMap2);
		//////////////////////////////
		//分别遍历：打印人的信息(5个属性)
		//peosonList
		for (Person person : personList) {
			System.out.println("name:"+person.getName()+" id:"+person.getId());
		}
		
		//pmaplist
		for (Map<String, Object> map : pmapList) {
			System.out.println((String)map.get("name")+(Integer)map.get("id"));
		}
		
		//key值不清楚的时候pmapList
		for (Map<String, Object> map : pmapList) {
			//解析map  不知道key的值
			Set<String> keySet = map.keySet();
			for (String key : keySet) {
				Object o  = map.get(key);
			}
			map.values();	//把map中的value 5个值封装成一个容器
		}
		//
	}
}

package object.useful;

import java.util.HashMap;
import java.util.Map;

import org.junit.Test;

public class MapTest {
	@Test
	public void testMapObject() {
		//测试返回一个dog类型的数据
		Dog dog = (Dog)getDog(1, "金毛");
		dog.getId();
		dog.getName();
		
		Map mapDog = getMapDog(1, "金毛");
		mapDog.get("id");
		mapDog.get("name");
		
		//1、keys的set集合
		//2、values的集合
	}
	
	public Object getDog(int id,String name) {
		Dog dog = new Dog();
		dog.setId(id);
		dog.setName(name);
		return dog;
	}
	
	public Map getMapDog(int id,String name) {
		Map map = new HashMap();
		map.put("id", id);	//"id"和“name‘
		map.put("name", name);
		return map;
	}
}

package object.useful;

import java.util.ArrayList;
import java.util.Collections;
import java.util.HashSet;
import java.util.List;
import java.util.Set;

import org.junit.Test;

/**
 * 狗类是否重复及人类集合排序
 * @author mygbo
 *
 */
public class DogSetTest {
	
	/**
	 * 先引junit包
	 * 测试 没有重写
	 * @param args
	 */
	@Test
	public void test1() {
		Dog dog1 = new Dog();
		dog1.setName("金毛");
		dog1.setId(1);
		
		Dog dog2 = new Dog();
		dog2.setName("黄毛");
		dog2.setId(2);
		
		Dog dog3 = new Dog();
		dog3.setName("黄毛");
		dog3.setId(2);
		
		Dog dog4 = new Dog();
		dog4.setName("黄毛");
		dog4.setId(2);
		
		Dog dog5 = new Dog();
		dog5.setName("黄毛");
		dog5.setId(2);
		
		List list =  new ArrayList();
		list.add(dog1);
		list.add(dog2);
		list.add(dog3);
		list.add(dog4);
		list.add(dog5);
		
		
		Set set = new HashSet();
		set.add(dog1);
		set.add(dog2);
		set.add(dog3);
		set.add(dog4);
		set.add(dog5);
		
		System.out.println("");
		
	}
	
	/**
	 * 把dog类按照我们业务需求，做是否重复的设置。重写equels和hashcode方法
	 */
	
	/*
	 * 集合内部的排序，comparable接口的实现
	 */
	@Test
	public void test2() {
		Dog dog1 = new Dog();
		dog1.setName("金毛");
		dog1.setId(100);
		
		Dog dog2 = new Dog();
		dog2.setName("黄毛");
		dog2.setId(25);
		
		Dog dog3 = new Dog();
		dog3.setName("黄毛");
		dog3.setId(87);
		
		Dog dog4 = new Dog();
		dog4.setName("黄毛");
		dog4.setId(49);
		
		Dog dog5 = new Dog();
		dog5.setName("黄毛");
		dog5.setId(34);
		
		List list =  new ArrayList();
		list.add(dog1);
		list.add(dog2);
		
		//Collections工具类   Collection接口
		Collections.sort(list);
		
		System.out.println("");
		
	}
	
	
	
	
	
	
	public static void main(String[] args) {
		// TODO 自动生成的方法存根

	}

}

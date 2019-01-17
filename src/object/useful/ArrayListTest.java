package object.useful;

import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Date;
import java.util.Iterator;
import java.util.List;


/**
 * 集合框架：arraylist学习
 * @author mygbo
 *
 */

public class ArrayListTest {

	public static void main(String[] args) {
		// TODO 自动生成的方法存根
		
		//可变长度的数组
		ArrayList list = new ArrayList();
		
		list.add(1);	//包装类 把int类型的1自动封箱为integer类型1
		
		//包装类自动封装
		Integer i = new Integer(1);
		int ii = new Integer(1);//自动拆箱
		
		//SString "145.454" "123"
		double d1 = Double.parseDouble("145.454");
		//double d2 = Double.parseDouble("145.454dsfsdfsd");
		float f = Float.parseFloat("123.4f");
		int num  = Integer.parseInt("123");
		
		System.out.println("" );
		
		list.add("abccd");
		list.add(new Person());
		list.add(new Date());
		
		//遍历list 通过下标获取
		for(int j = 0;j<list.size();j++) {
			Object object = list.get(j);
			if(object instanceof Integer) {
				System.out.println("Integer:"+object);
			}else if (object instanceof String) {
				System.out.println("String:"+object);
			}else if (object instanceof Person) {
				System.out.println("person name:"+((Person)object).getName());
			}else if (object instanceof Date) {
				SimpleDateFormat sFormat = new SimpleDateFormat("yyyy-mm-dd~hh-mm-ss");
				System.out.println("Date:"+sFormat.format((Date)object));
			}
		}
		
		//数字容器 泛型 
		List<Number> numList = new ArrayList<Number>();	//先声明在定义，，最好在声明的时候指定类型
		numList.add(123.1213);
		numList.add(new Integer(2));
		numList.add(new Double(123.123));
		for(int k= 0;k<numList.size();k++) {
			Number number = numList.get(k);
			System.out.println(number);
		}
		
		//字符串容器
		List<String> strList = null;
		strList = new ArrayList<String>();
		strList.add("daefa");
		strList.add("");
		strList.add("你好");
		for(int s = 0;s<strList.size();s++) {
			String string = strList.get(s);
			System.out.println(string);
		}
		
		//person容器
		List<Person> personList = new ArrayList<Person>();
		Person p1= new Person();
		p1.setName("张三");
		personList.add(p1);
		for(int p=0;p<personList.size();p++) {
			System.out.println(personList.get(p).getName());
		}
		
		//date日期容器
		List<Date> dateList = new ArrayList<Date>();
		
		for(int d=0;d<50;d++) {
			Date now = new Date();
			dateList.add(now);
			try {
				Thread.sleep(300);
			} catch (InterruptedException e) {
				// TODO 自动生成的 catch 块
				e.printStackTrace();
			}
		}
		for(int ds=0;ds<dateList.size();ds++) {
			SimpleDateFormat fo = new SimpleDateFormat("yyyy.MM.dd-hh:mm:ss");
			System.out.println(fo.format(dateList.get(ds)));
		}
		
		//迭代器numList
		Iterator<Number> its = numList.iterator();	//获取迭代器
		//判断有没有元素
		boolean d = its.hasNext();
		//获取里面的元素
		Number n1 = its.next();//获取第一个元素
		Number n2 = its.next();//获取第二个元素
		//设计循环
		while (its.hasNext()) {
			System.out.println(its.next());			
		}
		
		//for自动生成的迭代器
		/*
		for (Iterator iterator = dateList.iterator(); iterator.hasNext();) {
			Date date = (Date) iterator.next();
			
		}
		*/
	}
	
	//输入为空，输出为数字容器
	public ArrayList getNm() {
		return null;
		
	}

}

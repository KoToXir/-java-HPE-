package object.useful;

import java.io.UnsupportedEncodingException;

/**
 * 字符串常量不可更改，
 * 堆、栈内存指针
 * @author mygbo
 *
 */
public class TestString {

	public static void main(String[] args) {
		// TODO 自动生成的方法存根
		String str1 = "我爱";
		String str2 = "学习";
		
		String s = str1 + str2;
		
		String s1 = "我爱学习";
		String s2 = "我爱学习";
		String s3 = new String("我爱学习");
		
		System.out.println(s==s1);	//false
		System.out.println(s2==s1);	//true
		System.out.println(s3==s1);	//false
		
		String name = "";	//name栈--》""堆
		name = new String("我爱学习");		//name栈--》new String堆--》“。。。。”静态区

		String name1 = null;	//name栈不指向
		name1 = name;	//name1栈--》new String堆
		
		//常见一个person对象
		Person p3 = null;	//p3栈不指向	
		p3 = new Person();	//p3--》new Person堆
		
		Person p4 = null;	//p4栈不指向
		p4 = p3;	//p4栈---》new person栈
		p3 = null;	//p3栈--》不指向
		
		//p3.getName();//运行时异常，可以不处理。。。。相对的，try-catch为检查时异常必须处理

		String abc = "你好";
		try {
			String newstr = new String(abc.getBytes(),"utf-8");
			System.out.println(newstr);
		} catch (UnsupportedEncodingException e) {
			// TODO 自动生成的 catch 块
			e.printStackTrace();
		}
		
		
	}

}

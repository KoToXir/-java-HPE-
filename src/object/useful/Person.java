package object.useful;
/**
 * object类学习
 * @author mygbo
 *
 */
public class Person extends Object{
	private String name;

	
	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}
	
	@Override	//必须是父类中已有的方法
	public String toString() {
		return this.name;
	}

	@Override
	public boolean equals(Object obj) {
		//吧传入的参数，强制转换成person
		Person p1 = (Person)obj;
		//是否是person对象
		if(!(p1 instanceof Person)) {
			return false;
		}
		//如果是person对象，比较对象中的name是否相等
		if(this.name.equals(p1.name)) {
			return true;
		}
		return false;
	}
	
	public static void main(String[] args) {
		Person p1 = new Person();
		p1.setName("张三");
		System.out.println(p1);
		
		//创建对象的过程
		//从下往上，从右往左
		Person p2 = null;
		p2 = new Person();
		p2.setName("李四");
		
		Person p3 = new Person();
		p3.name = "张三";
		
		System.out.println(p1 == p3);
		System.out.println("abcd".equals("abcd"));
		
		//对象的比较
		boolean flag = false;
		flag = p1.equals(p2);
		
//		boolean result = p1.equals(p3);
//		System.out.println(result);
		
		
	}
	
}

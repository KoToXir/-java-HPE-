/**
 * 引用传参举例
 */
package function;

class Car{
	String color;
}

public class Canshu_Yinyong {

	public static void main(String[] args) {
		// TODO 自动生成的方法存根
		Car a = new Car();
		a.color = "blue";
		System.out.println(a.color);
		fun(a);
		System.out.println(a.color);
		
	}
	
	//定义一个方法修改汽车颜色
	public static void fun(Car a) {
		a.color = "蓝";
	}

}

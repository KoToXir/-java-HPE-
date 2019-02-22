/**
 * 值传参，不改变实参内容
 */
package function;

public class Canshu_Zhi {

	public static void main(String[] args) {
		// TODO 自动生成的方法存根
		int a=3,b=4;
		sway(a, b);
		System.out.println(a+" "+b);
	}
	
	public static void sway(int a,int b) {
		//两个变量交换的高级方法
		a=a^b;
		b=a^b;
		a=a^b;
		
	}

}

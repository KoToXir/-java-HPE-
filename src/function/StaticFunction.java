/**
 * 测试static方法调用
 */
package function;

public class StaticFunction {

	public static void main(String[] args) {
		// TODO 自动生成的方法存根
		//方法调用
		int num1 = 2;
		int num2 = 3;
		int sum = myAdd(num1, num2);
		System.out.println(sum);
	}
	
	public static int myAdd(int n1,int n2) {
		int sum = n1 +n2;
		return sum;
	}
}

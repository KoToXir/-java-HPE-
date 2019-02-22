package basic;

public class Test_For {

	public static void main(String[] args) {
		// TODO 自动生成的方法存根
		//100以内偶数和
		int sum = 0;
		for(int i=0;i<100;i+=2) {
			sum +=i;
		}
		System.out.println("100以内偶数和"+sum);
		
		//循环遍历一个数组
		int[] myArays = {1,2,3,7,4,5,6};
		//foreach
		for(int i:myArays) {
			System.out.println(i);
		}
	}

}

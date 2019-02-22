package basic;

import java.util.Scanner;

public class Test_DoWhile {

	public static void main(String[] args) {
		// TODO 自动生成的方法存根
		//100以内奇数和
		int sum = 0;
		int i=1;
		do {
			//循环体
			if(i%2==1) {
				sum +=i ;
			}
			i++;
		}while(i<=100);
		System.out.println("100以内奇数和"+sum);
		
		//张三写代码，直到老师满意“y”
		Scanner scanner = new Scanner(System.in);
		do {
			System.out.println("张三写代码");
		}while(!"y".equals(scanner.next()));
		System.out.println("老师终于满意");
	}

}

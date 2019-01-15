/**
 * 一个整数，它加上100后是一个完全平方数，
 * 再加上168又是一个完全平方数，请问该数是多少？
 */
package practice;
import java.lang.Math;

public class WanquanPingfang {

	public static void main(String[] args) {
		// TODO 自动生成的方法存根
		
		for(int i=0;true;i++) {
			if(wqpd(i+100)==1&&wqpd(i+268)==1) {
				System.out.println(i);
				//break;
			}			
		}		
	}
	
	//判断是否为完全平方数
	public static int wqpd(int num) {
		double d = num;
		if(Math.sqrt(d)-(int)Math.sqrt(d)==0) {
			return 1;	//是则返回1
		}else {
			return 0;	//不是则返回0
		}
		
	}

}

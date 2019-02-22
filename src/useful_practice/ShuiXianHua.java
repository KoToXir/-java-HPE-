package useful_practice;

public class ShuiXianHua {

	public static void main(String[] args) {
		// TODO 自动生成的方法存根
		for(int i=100;i<=999;i++) {
			int a=0,b=0,c=0;
			a = i/100;
			b = i/10%10;
			c = i%10;
			if(a*a*a+b*b*b+c*c*c==i) {
				System.out.println(i);
			}
		}
	}
	
}

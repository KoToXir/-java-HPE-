/**
 * 一球从100米高度自由落下，每次落地后反跳回原高度的一半；
 * 再落下，求它在第10次落地时，共经过多少米？第10次反弹多高？
 */
package practice;

public class XiaoqiuLuodi {

	public static void main(String[] args) {
		// TODO 自动生成的方法存根
		double m=100,sum=0;
		//1<10为第十次
		for(int i=0;i<10;i++) {
			sum += m+m/2;
			m /=2;
		}
		System.out.println("第十次落地共经过"+(sum-m)+"米");
		System.out.println("第十次反弹 "+m+"米");
		
	}

}

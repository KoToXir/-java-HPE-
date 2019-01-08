/**
 * 有1、2、3、4四个数字，能组成多少个互不相同且无重复数字的三位数？都是多少？ 
 */
package practice;

public class PailieZuhe4_3 {

	public static void main(String[] args) {
		// TODO 自动生成的方法存根
		int sum = 0;
		for(int i=1;i<=4;i++) {
			for(int j=1;j<=4;j++) {
				for(int k=1;k<=4;k++){
					//判断条件，各位各不相同
					if (i!=j&&j!=k&&k!=i) {
						System.out.println(""+i+j+k);
						sum++;
					}
				}
			}
		}
		System.out.println("共有"+sum+"个");
	}

}

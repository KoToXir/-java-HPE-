/**
 * 猴子吃桃问题：
 * 猴子第一天摘下若干个桃子，当即吃了一半，还不瘾，又多吃了一个 ，
 * 第二天早上又将剩下的桃子吃掉一半，又多吃了一个。
 * 以后每天早上都吃了前一天剩下的一半零一个。
 * 到第10天早上想再吃时，见只剩下一个桃子了。
 * 求第一天共摘了多少？
 */
package practice;

public class Monkey {

	public static void main(String[] args) {
		// TODO 自动生成的方法存根
		int n=1;
		//i>9,第9天吃之前为4个
		for(int i=10;i>1;i--) {
			n=(n+1)*2;
		}
		System.out.println("第一天摘了"+n+"个");
	}

}

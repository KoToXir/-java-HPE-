/**
 * 打印圣诞树
 *       *
        ***
       *****
      *******
     *********
 */
package useful_practice;

public class ShengDanShu {

	public static void main(String[] args) {
		// TODO 自动生成的方法存根
		int hight = 10;//层数
		for(int i=1;i<=hight;i++) {
			//打印空格
			for(int k=hight;k>i;k--) {
				System.out.print(" ");
			}
			//打印星号
			for(int j=1;j<=i*2-1;j++) {
				System.out.print("*");
			}
			System.out.println();
		}
	}

}

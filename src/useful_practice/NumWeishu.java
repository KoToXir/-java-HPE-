/**
 * 判断位数并逆序输出
 * */
package useful_practice;

public class NumWeishu {

	public static void main(String[] args) {
		// TODO 自动生成的方法存根
		int a = 12345;
		String ab = a+" ";
		int ws =0;
		//判断位数
		for(int i=0;i<=5;i++) {
			char b = ab.charAt(i);
			if(b<'0'||b>'5') {
				break;
			}
			ws=i;
		}
		System.out.println(ws+1+"位");
		//逆序输出
		for(int j=ws;j>=0;j--) {
			System.out.print (ab.charAt(j));
		}
	}

}

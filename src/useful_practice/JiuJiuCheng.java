package useful_practice;
//打印九九乘法表
public class JiuJiuCheng {

	public static void main(String[] args) {
		// TODO 自动生成的方法存根
		for(int i=1;i<=9;i++) {
			for(int j=1;j<=i;j++) {
				System.out.print(j+"x"+i+"="+(i*j)+"\t");
			}
			System.out.println("");
		}
	}

}

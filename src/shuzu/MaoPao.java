package shuzu;

public class MaoPao {

	public static void main(String[] args) {
		// TODO 自动生成的方法存根
		int[] array = {13,2,321,4,234,23,41,3};
		int flag;
		int ks = array.length-1,pos = 0;//pos变量用来标记循环里最后一次交换的位置  
		for(int i=0;i<array.length-1;i++) {
			flag=0;
			for(int j=0;j<ks;j++) {//j<array.length-1-i
				if(array[j]>array[j+1]) {
					array[j]=array[j]^array[j+1];
					array[j+1]=array[j]^array[j+1];
					array[j]=array[j]^array[j+1];
					flag=1;//只要有发生了交换，flag就置为1
					pos = j;//循环里最后一次交换的位置 j赋给pos
				}
			}

			ks = pos;
			//判断标志位是否为0，如果为0，说明后面的元素已经有序，就直接return
			if(flag==0) {
				break;
			}
		}
		for(int k:array) {
			System.out.println(k);
		}
	}

}

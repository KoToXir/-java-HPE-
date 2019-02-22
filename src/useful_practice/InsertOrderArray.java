/**
 * 有一个已排好序的数组，现输入一个数，要求按原来的规律插入数组中
 */
package useful_practice;

public class InsertOrderArray {

	public static void main(String[] args) {
		// TODO 自动生成的方法存根
		//已排好序的数组
		int[] array1 = {1,3,5,7,9};
		for(int k1:array1) {
			System.out.print(k1+" ");
		}
		System.out.println();
		//新数组
		int[] array2;
		array2 = new int[array1.length+1];
		//新建的树
		int newnum = 4;
		//判断从小到大还是从大到小
		if(array1[0]<array1[1]) {	//从小到大
			int i=0;
			while(newnum>array1[i]) {
				array2[i]=array1[i];
				i++;
			}
			array2[i] = newnum;
			i++;
			while(i<array2.length) {
				array2[i]=array1[i-1];
				i++;
			}
		}else {
			//从大到小
		}
		for(int k2:array2) {
			System.out.print(k2+" ");
		}
		
	}

}

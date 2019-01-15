/**
 * 简单选择排序，依次将最小的元素插入到前面
 */

package shuzu;

public class ChoosePaixu {

	public static void main(String[] args) {
		// TODO 自动生成的方法存根
		int[] array = {321,321,3,213,214,32,4,213,12,9};
		for(int i=0;i<array.length;i++) {
			//找到最小的元素，给第i个
			int min = array[i];
			int mini = i;
			for(int j=i;j<array.length;j++) {
				if(array[j]<min) {
					min = array[j];
					mini = j;
				}
			}
			//将索引i后的最小值给i
			if(mini!=i) {
				array[i]=array[i]^array[mini];
				array[mini]=array[i]^array[mini];
				array[i]=array[i]^array[mini];
			}
		}
		for(int k:array) {
			System.out.print(k+" ");
		}
	}

}

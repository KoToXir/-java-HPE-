//使用arrays类中的sort方法直接进行快排
package shuzu;

import java.util.Arrays;

public class QuickPaixu {

	public static void main(String[] args) {
		// TODO 自动生成的方法存根
		int[] array = {12,3,32,31,341,4};
		Arrays.sort(array);
		for(int i:array) {
			System.out.println(i);
		}
	}

}

/**
 * 定一个类MyArray，在类中使用静态成员函数对外提供，求数组中最大值，数组中最小值，数组长度，数组排序，数组显示的功能函数。
 */
package object.statict;

import java.util.Arrays;

public class MyArray {
	//private static int[] arr={1,2,3};
	//获取最大
	public static int getMax(int[] arr) {
		int max = 0;
		for(int i:arr) {
			if (i>max){
				max = i;
			}
		}
		System.out.println("最大值"+max);
		return max;
	}
	//获取最小
	public static int getMin(int[] arr) {
		int min = 0;
		for(int i:arr) {
			if (i<min){
				min = i;
			}
		}
		System.out.println("最小值："+min);
		return min;
	}
	//获取长度
	public static int getLength(int[] arr) {
		System.out.println("长度："+arr.length);
		return arr.length;
	}
	//数组排序
	public static void sort(int[] arr) {
		
		System.out.println("原数组：");;
		showArray(arr);
		Arrays.sort(arr);
		System.out.println("排序后：");
		showArray(arr);
	}
	//数组显示
	public static void showArray(int[] arr) {
		for(int i:arr) {
			System.out.print(i+" ");
		}
		System.out.println();
	}
}

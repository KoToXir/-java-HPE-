/**
 * 输入数组，最大的放到最前，最小的放到最后
 */
package useful_practice;

public class Max1Minn {

	public static void main(String[] args) {
		// TODO 自动生成的方法存根
		int[] arr = new int[] {1,2,3,4,5};
		int max = arr[0];
		int min = arr[1];
		int maxi=0,mini=1;
		//找最大，换最前
		for(int i=0;i<5;i++) {
			if(arr[i]>max) {
				max=arr[i];
				maxi = i;
			}
		}
		int temp=arr[maxi];
		arr[maxi]= arr[0];
		arr[0] = temp;
		//最小
		for(int i=1;i<5;i++) {
			if(arr[i]<min) {
				min = arr[i];
				mini = i;
			}
		}
		temp=arr[mini];
		arr[mini]= arr[4];
		arr[4] = temp;
		for(int k:arr) {
			System.out.print(k);
		}
		
	}

}

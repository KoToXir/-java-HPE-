/**
 * 根据利润计算奖金
 */
package class_practice;

import java.util.Scanner;

public class If_Profit {

	public static void main(String[] args) {
		// TODO 自动生成的方法存根
		Scanner scanner = new Scanner(System.in);
		int profit = scanner.nextInt();
		scanner.close();
		double bonus;
		if(profit<=10) {
			bonus = 0.1*profit;
		}else if (profit<=20) {
			bonus = 0.075*(profit-10)+1;	//0-10——1
		}else if (profit<=40) {
			bonus = 0.05*(profit-20)+1+0.75;	//10-20——0.75
		}else if (profit <= 60) {
			bonus = 0.03*(profit-40)+1+0.75+0.6;	//20-40——0.6
		}else if(profit <=100) {
			bonus = 0.015*(profit-60)+1+0.75+0.6+0.6;	//40-60——0.6
		}else {
			bonus = 0.01*(profit-100)+1+0.75+0.6+0.6+0.6;	//60-100——0.6
		}
		System.out.println("奖金为"+bonus+"万");
	}

}

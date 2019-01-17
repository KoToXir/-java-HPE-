package object.useful;

import java.text.SimpleDateFormat;
import java.util.Date;

import com.sun.xml.internal.bind.v2.runtime.Name;

/**
 * substring()
 * trim()
 * @author mygbo
 *
 */

public class TestString2 {
	
	/**
	 * 	//循环100次，每次循环，把当前时间 年-月-日 时：分：秒（String类型）放置到stringbuffer中，
	//尾部加“，”。循环结束后，把最后的“，”去掉
	 * //java.util.Date年月日时分秒	java.sql.Date年月日
		//日期格式化的方法 SimpleDateFormat	可以格式化日期为字符串类型“yyyy-MM-dd HH:mm:ss”
	 * @param name
	 * @return
	 */
	public static String getDateStr() {
		StringBuffer dateStringBuffer = new StringBuffer();
		
		for(int i=0;i<100;i++) {
			Date now = new Date();
			SimpleDateFormat fo = new SimpleDateFormat("yyyy.MM.dd-hh:mm:ss");
			dateStringBuffer.append(fo.format(now)+" ");
			try {
				Thread.sleep(100);
			} catch (InterruptedException e) {
				// TODO 自动生成的 catch 块
				e.printStackTrace();
			}
		}
		return dateStringBuffer.toString();
	}
	

	
	public static boolean checkName(String name) {
		return "admin".equals(name.trim());	//"abc" "abc" "abc" "abc" "ab c"
	}
	
	/**
	 * "小明、小兰、小米"人名的数组
	 * @param str
	 * @return
	 */
	public static String[] getName(String str) {
		String [] nameStrings = str.split(",");
		return nameStrings;
	}
	
	/**
	 * 获取某个字符串如“nba”在一个长的字符串中 出现的次数
	 * @author mygbo
	 *
	 */
	public static int subStringTest(String str) {
		int count = 0;
		//1\判断str字符串中是否存在nba这三个字符
		while(str.contains("nba")) {
			//2\indexOf过去首次出现的下标
			int length = str.indexOf("nba") + 3;
			str = str.substring(length);
			count++;
		}
		//计算器
		return count;
	}
	
	public static void main(String[] args) {
		// TODO 自动生成的方法存根
		String string = "nbadasfasnbadaangervcbanba";
		int strleng = subStringTest(string);
		System.out.println(strleng);
		
		String[] name2 = getName("a,b,s,d,1,2,4,5");
		for(String n:name2) {
			System.out.print(n+" ");
		}
		System.out.println();
		
		System.out.println(getDateStr());
	}

}

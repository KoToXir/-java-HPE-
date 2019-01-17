package object.useful;
/**
 * set集合框架是无序的，不可重复的
 */
import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;
import java.util.Set;

public class HashSetTest {
	
	/**
	 * 返回不重复的容器
	 * @param a
	 * @return
	 */
	public Set getSet1(Set<String> reset,String a) {
		//HashSet<String> reSet = new HashSet<String>();
		reset.add(a);
		
		return reset;
	}
	
	public static void main(String[] args) {
		// TODO 自动生成的方法存根
		HashSetTest hashSetTest = new HashSetTest();
		Set<String> set = new HashSet<String>();
		List<String> list = new ArrayList<String>();
		
		
		Set set1 = hashSetTest.getSet1(set,"a");
		Set set12 = hashSetTest.getSet1(set1,"a");
		Set set13 = hashSetTest.getSet1(set12,"a");
		
		List list1 = hashSetTest.getList1(list,"a");//引用传值，传地址
		List list2 = hashSetTest.getList1(list,"a");
		List list3 = hashSetTest.getList1(list,"a");
		List list4 = hashSetTest.getList1(list,"a");
		

	}
	
	public List getList1(List<String> list,String a) {
		//List<String> list = new ArrayList<String>();
		list.add(a);
		return list;
	}

}

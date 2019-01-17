package object.useful;
/**
 * 基于链表的实现的集合框架（有序、可重复，方便增删改查）
 */

import java.util.LinkedList;

public class LinkedListTest {

	public static void main(String[] args) {
		// TODO 自动生成的方法存根
		LinkedList<String> linkedList = new LinkedList<String>();
		linkedList.add("a");
		linkedList.add("b");
		linkedList.add("c");
		linkedList.add("d");
		
		//框架独有的
		linkedList.addFirst("e");
		linkedList.addLast("t");
	}

}

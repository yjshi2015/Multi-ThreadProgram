package com.linked;
import java.util.ArrayList;
import java.util.HashSet;
import java.util.Iterator;
import java.util.List;

/*
 * 对链表进行去重
 * */
public class NodeTest {

	public static void main(String[] args) {
		Node nodeA = new Node("NodeA");
		Node nodeB = new Node("NodeA");
		Node nodeC = new Node("NodeA");
		Node nodeD = new Node("NodeD");
		Node nodeE = new Node("NodeE");
		Node nodeF = new Node("NodeF");
		nodeA.setNext(nodeB);
		nodeB.setNext(nodeC);
		nodeC.setNext(nodeD);
		nodeD.setNext(nodeE);
		nodeE.setNext(nodeF);

		System.out.println("----------去重前---------------");
		Node temp = nodeA;
		while(temp != null) {
			System.out.println(temp.value);
			temp = temp.next;
		}
		
		temp = nodeA;
		Node last = null;
		List<String> list = new ArrayList<String>();
		while(temp != null) {
			if(!list.contains(temp.value)) {//非重复对象
				list.add(temp.value);
				last = temp;//保留上个对象节点
			}else {//重复对象
				last.next = temp.next;//把重复对象节点之前的节点指向重复对象之后的节点，即跳过重复节点
			}
			temp = temp.next;
		}

		
		System.out.println("-----------去重后-------------");
		
		temp = nodeA;
		while(temp != null) {
			System.out.println(temp.value);
			temp = temp.next;
		}

		System.out.println("===================");
		temp = nodeA;
		HashSet<String> hashSet = new HashSet<String>();
		while(temp != null) {
			hashSet.add(temp.value);
			temp = temp.next;
		}
		
		Iterator<String> iterator = hashSet.iterator();
		while(iterator.hasNext()) {
			System.out.println(iterator.next());
		}
	}
}

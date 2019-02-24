package com.linked;
import java.util.ArrayList;
import java.util.HashSet;
import java.util.Iterator;
import java.util.List;

/*
 * ���������ȥ��
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

		System.out.println("----------ȥ��ǰ---------------");
		Node temp = nodeA;
		while(temp != null) {
			System.out.println(temp.value);
			temp = temp.next;
		}
		
		temp = nodeA;
		Node last = null;
		List<String> list = new ArrayList<String>();
		while(temp != null) {
			if(!list.contains(temp.value)) {//���ظ�����
				list.add(temp.value);
				last = temp;//�����ϸ�����ڵ�
			}else {//�ظ�����
				last.next = temp.next;//���ظ�����ڵ�֮ǰ�Ľڵ�ָ���ظ�����֮��Ľڵ㣬�������ظ��ڵ�
			}
			temp = temp.next;
		}

		
		System.out.println("-----------ȥ�غ�-------------");
		
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

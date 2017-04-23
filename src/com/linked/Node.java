package com.linked;

public class Node {
	
	Node(String value) {
		this.value = value;
	}
	
	Node(String value,Node next) {
		this.value = value;
		this.next = next;
	}
	
	String value;
	Node next;
	
	public String getValue() {
		return value;
	}
	public void setValue(String value) {
		this.value = value;
	}
	public Node getNext() {
		return next;
	}
	public void setNext(Node next) {
		this.next = next;
	}
}

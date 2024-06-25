package com.Autowiring;

public class B {
	private int id;
	private String name;
	A a;
	
	public B(int id, String name, A a) {
		
		this.id = id;
		this.name = name;
		this.a = a;
		System.out.println("B is created");
		
	}
	public A getA() {
		return a;
	}
	public void setA(A a) {
		this.a = a;
	}
	public void print() {
		System.out.println("Hello B");
	}
	public void display() {
		print();
		a.point();
	}
}

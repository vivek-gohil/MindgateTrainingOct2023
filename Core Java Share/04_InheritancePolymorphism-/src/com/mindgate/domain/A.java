package com.mindgate.domain;

public class A {
	public A() {
		System.out.println("Default constrcutor of A");
	}

	public A(int x) {
		System.out.println("Parameterized constrcutor of A");
		System.out.println("X = "+ x);
	}

	public void show() {
		System.out.println("hi");
	}
}

package com.mindgate.domain;

public class B extends A {

	public B() {
		System.out.println("Default constrcutor of B");
	}

	public B(int x) {
		super(x);
		System.out.println("Parameterized constrcutor of B");
		System.out.println("X = " + x);
	}

	public void show() {
		System.out.println("hello");
	}
}

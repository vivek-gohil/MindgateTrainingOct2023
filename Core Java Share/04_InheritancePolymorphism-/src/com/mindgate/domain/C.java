package com.mindgate.domain;

public class C extends A {
	public C() {
		System.out.println("Default constrcutor of C");
	}

	public C(int x) {
		System.out.println("Parameterized constrcutor of C");
		System.out.println("X = " + x);
	}

	public void show() {
		System.out.println("How are you?");
	}
}

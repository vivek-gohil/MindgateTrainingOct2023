package com.mindgate.factory;

import com.mindgate.domain.A;
import com.mindgate.domain.B;
import com.mindgate.domain.C;

public class MyFactory {
	public A getObject(int choice) {

		if (choice == 1)
			return new B();

		if (choice == 2)
			return new C();

		else
			return null;
	}
}

package com.zyl.java.day27;

public final class Dog extends Pet {
	public Dog() {
		super();
	}

	public Dog(String name) {
		super(name);
	}

	public Dog(String name, int age, int love) {
		super(name, age, love);
	}

	public void eat() {
		System.out.println("wode xiaopingping");
	}
}

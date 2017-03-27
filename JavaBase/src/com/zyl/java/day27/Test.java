package com.zyl.java.day27;

public class Test {

	public static void main(String[] args) {
  Dog dog = new Dog();
  Penguin penguin =  new Penguin();
  Master master = new Master();
		/*master.feed(dog);
		master.feed(penguin);*/
		Pet pet = new Dog();
		master.feed(pet);
		
	}

}

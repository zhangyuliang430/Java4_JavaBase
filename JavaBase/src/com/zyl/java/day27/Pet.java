package com.zyl.java.day27;

import com.sun.org.apache.bcel.internal.classfile.LocalVariable;

public class Pet {
	String name ;
	int age = 50;
	private int love = 100; 
	public Pet() {
		super();	
	}
	public Pet(String name, int age ,int love ){
	super();
	this.name = name;
	this.age = age;
	this.love = love;
	
	}
	public Pet(String name){
		super();
		this.name = name;
	}
	
	public final void print() {
		System.out.println("平平最帅：" + name+"平平最霸气"+age+"平平最稳"+love);
	

	}
	public void eat(){
		System.out.println( "人狠话不多，社会我东哥");
	}

}

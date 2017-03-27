package com.zyl.java.day27;

import java.util.Scanner;

public class Calputer {

	public static void main(String[] args) {
		Scanner a =new Scanner(System.in);
		//创建Scanner 接受控制台的输入a
		System .out .println("请输出一个运算符号：\t");
	//接受String型字符
		String b = a.next();
		System .out .println( "请输入数字：\t");
		//输入double型
		double c = a.nextDouble();
		double d = a.nextDouble();
		//接受double型c d
		double sum ;
		//sum为c d的运算结果
		//考虑到运算符很多以下为一一列举
		if("+".equals(b)){
			sum = c+d;
			System.out.println("得出的结果：\t"+sum);
		}else if("-".equals(b)){
			sum = c-d;
			System.out.println("得出的结果：\t"+sum);
		}else if ("/".equals(b)){
			sum = c/d;
			System.out.println("得出的结果：\t"+sum);
		}else if ("*".equals(b)){
			sum =c *d;
			System.out.println("得出的结果：\t"+sum);
		}else if ("%".equals(b)){
			sum =c %d;
			System.out.println("得出的结果：\t"+sum);
		}
		
	}

}

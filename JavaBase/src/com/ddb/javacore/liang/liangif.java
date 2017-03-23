package com.ddb.javacore.liang;

//import java.util.Scanner;
import java.util.Scanner;

//import org.omg.CORBA.PUBLIC_MEMBER;
//import java.util.Scanner;

//import javax.sound.midi.MidiUnavailableException;

//import com.sun.xml.internal.fastinfoset.algorithm.IEEE754FloatingPointEncodingAlgorithm;


public class liangif {

	public static void main(String[] args) {
		/*
		 * Scanner input = new Scanner(System.in);
		 * Scanner inout = new Scanner(system.in); 
		 * System.out.println("请输入一个分数：");
		 */
		// Scanner input = new Scanner(System.in);
		// System.out.println("请输入一个分数");
		// int ping = input.nextInt();
		// for(int i = 0; i > ping; i++){
		// for(int i = 0;i<=4;i++){

		//for (int i = 0; i < 5; i++) // 这一句控制5行的打印。
		/*{
			for (int j = 0; j < 5 - i - 1; j++) {
				System.out.print(" ");
			} // 这一句共执行 5-i-1次，即输出 5-i-1个空格。
			for (int k = 0; k < 2 * i + 1; k++) {
				System.out.print("*");
			} // 这一句共执行 i+1次。即输出2i+1个*。
				// 该输出的都输出了，换一行继续打印。
			System.out.println(); // 打印一个回车符，即换行了。
		} // 你可以迭代一下每个i值，看看打印的个数对不对。
	}*/
   /*for(int i= 0; i < 7 ;i++){
	   for(int j = 0; j  < 7- i - 1; j++){
		   System.out.print(" ");
	   }
	   for(int k = 0; k < 2 * i + 1 ; k++){
		   System.out.print("*");
	   }
   
	   System.out.println();
	  
   }
   for(int a = 0; a < 6 ;a++){
	  for(int b = 0;b < 13 - 2*a -1;b++){
		  System.out.print("*");  
	  }
	   for(int c =0; c < a + 1 ;c++){
		   System.out.print(" ");
	   }
	   System.out.println();
   }
	}*/
	/*	int year = 2016;
		int a = 25;
		double mun = a;
		while(mun <=100){
			mun = mun+ mun*0.25;
			year++;	
		}
		System.out.println("直到"+ year+"达到了100万");
}*/
		
		
		
		/*
		int a = 0;
		int mun =a ;
		for(a=0;a<=100;a++){
			mun=mun+a;
		}
		System.out.println(mun);*/
		
		
		
		/*
		int a ;
           for(a = 1 ; a <= 100;a+=6){
        	   System.out.print(" "+a+" ");
           }*/
		
		
		
		
		Scanner sum =new Scanner(System.in);
		//出来一个对象
		System.out.println("输出一个数值");
		int liang= sum.nextInt();
		for(int a = 0; a < liang ; a++){
			//先定义行数
			for(int b = 0; b < liang - a ;b++ ){
				//确定第一行有几个空格，一般就是7-a-1；
			System.out.print(" ");
			//打印空格
				}
			for(int c = 0; c < 2*a + 1 ; c++){
				//确定*号  因为是金字塔 所以成等差数列 1 3 5 7 根据规律可以知道 2*a+1  
				System.out.print("*");
				//打印 *号
			}
			System.out.println();
			//打印回车
		}


		
		
		
	
}
}


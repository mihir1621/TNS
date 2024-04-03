package com.TNS.DemoForTraining;

public class OperatorsDemo1 {
	public static void main(String[] args) {
		int a =10;
		int b= 20;
		int x =30;
		System.out.println("a and b value before the operation: "+a+""+b);
		++a;

		int c =(++a)+(--a)- (a)+(--a)+(a++);
		System.out.println("c value after operation :"+c);

		int d =c++ + a + b--;
		System.out.println("d value after operation :"+d);
	}
}

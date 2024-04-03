package com.TNS.DemoForTraining;

public class ForEachDemo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int a []= {10,20,30,40,50};
		System.out.println(a);
		for(int i:a) {
			System.out.println(i);
		}
		char ch[]= {'j','a','v','a'};
		System.out.println(ch);

		for(char c: ch) {
			System.out.println(c);
		}
		System.out.println();
		String s1[]= {"Java","Programming","Learning"};
		System.out.println(s1);

		for(String s:s1) {
			System.out.println(s);
		}
	}

}

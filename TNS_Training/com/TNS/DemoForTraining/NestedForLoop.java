package com.TNS.DemoForTraining;

public class NestedForLoop {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int beg=10;
		int end=20;

		for(int i=beg;i<=end;i++) {
			for(int j=1;j<=20;j++) {
				System.out.println(i+"*"+j+"="+i*j);
			}
		}
	}

}

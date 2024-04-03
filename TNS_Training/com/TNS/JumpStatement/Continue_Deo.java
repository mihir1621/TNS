package com.TNS.JumpStatement;

public class Continue_Deo {

	public static void main(String[] args) {
		for(int k=5;k<=15;k++) {
			if(k%2 !=0)
				continue;
			System.out.println(k+"Odd Numbers are skipped and the Even Numbers Sre print");
		}
		System.out.println("________________________________________________________________________________________________________");
		for(int k=5;k<=15;k++) {
			if(k%2 ==0)
				continue;
			System.out.println(k+"Odd Numbers are skipped and the Even Numbers Sre print");
		}

	}
}

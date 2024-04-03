package com.TNS.JumpStatement;

public class SwitchCase {

	public static void main(String[] args) {
		char x='L';

		switch(x) {

		case 'l': 
		case 'L':System.out.println(x +" for School");
		break;

		case 'd':
		case 'D':System.out.println(x +" for College");
		break;

		case 'q': 
		case 'Q':System.out.println(x +" for University");
		break;

		case 's': 
		case 'S':System.out.println(x +" for Post Graduation");
		break;

		default: 
			System.out.println(x+" entered wrong letter which is not included in code");
			
		}

	}

}

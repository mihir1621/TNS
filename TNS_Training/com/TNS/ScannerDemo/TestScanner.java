package com.TNS.ScannerDemo;
import java.util.Scanner;
public class TestScanner {

	public static void main(String[] args) {
		// scanner object to be created
		Scanner sc= new Scanner(System.in);

		String name;
		System.out.println("Enter Person Name: ");
		name=sc.next();

		System.out.println("Enter age: ");
		int age=sc.nextInt();

		System.out.println("Enter TaxableIncome : ");
		int income=sc.nextInt();

		System.out.println("Enter Gender : ");
		String gender=sc.next();

		//person object and initialize values using setter
		Person person = new Person();

		person.setName(name);
		person.setAge(age);
		person.setGender(gender);
		person.setIncome(income);
		System.out.println(person );
		System.out.println();

		TaxCalculation tc= new TaxCalculation();
		tc.calculateTax(person);
		System.out.println("After Calculating Tax: ");
		System.out.println(person);


		sc.close();
	}

}

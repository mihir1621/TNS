package com.TNS.ScannerDemo;


public class Person {
	private	String name;
	private int income;
	private String gender;
	private int age;
	private int tax;
	
	// Getter and Setter Method in Scanner
	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public int getIncome() {
		return income;
	}

	public void setIncome(int income) {
		this.income = income;
	}

	public String getGender() {
		return gender;
	}

	public void setGender(String gender) {
		this.gender = gender;
	}

	public int getAge() {
		return age;
	}

	public void setAge(int age) {
		this.age = age;
	}

	public int getTax() {
		return tax;
	}

	public void setTax(int tax) {
		this.tax = tax;
	}

	//toString
	@Override
	public String toString() {
		return "TaxPayableExUsingSc [name=" + name + ", income=" + income + ", gender=" + gender + ", age=" + age
				+ ", tax=" + tax + "]";
	}



}

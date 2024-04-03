package com.TNS.ScannerDemo;

public class TaxCalculation {
	public void calculateTax(Person taxpayperson) {
		if(taxpayperson.getAge()>65 || taxpayperson.getGender().equalsIgnoreCase("feamle")){
			taxpayperson.setTax(0);
			System.out.println("Tax is Not Applicable");
		}
		else {
			if(taxpayperson.getIncome()<= 150000) {
				taxpayperson.setTax(0);
			}
			else  if(taxpayperson.getIncome()>150000 && taxpayperson.getIncome()<=500000) {
				taxpayperson.setTax((taxpayperson.getTax()- 150000)* 5/100);
			}
			else  if(taxpayperson.getIncome()>500000 && taxpayperson.getIncome()<=800000) {
				taxpayperson.setTax((taxpayperson.getTax()- 150000)* 10/100);
			}
			else {
				taxpayperson.setTax((taxpayperson.getTax()-150000)*20/100);
			}
		}
	}
}

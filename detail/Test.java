package detail;

import java.util.Scanner;

public class Test extends Employee {
	 	
	    
	public void details() {
		Scanner sc = new Scanner(System.in);
	        System.out.println("Welcome to Employee Paypro Management System");
	        System.out.println();
	        System.out.println("~~~~~~~~~~Enter Employee Details~~~~~~~~~~");
	        System.out.print("Enter Employee ID: ");
	        Eid = sc.nextInt();
	        sc.nextLine();
	        System.out.print("Enter Employee Name: ");
	        Ename = sc.nextLine();
	        System.out.print("Enter Employee Department: ");
	        Edept = sc.nextLine();
	        System.out.print("Enter your leave for the month: ");
	        leave = sc.nextInt();
	        sc.close();
	       	}
	
	@Override
	public void salaCal() {
		salary= 35000f;
		TotalworkingDays= 28;
		Present = TotalworkingDays - leave;
		perDaySal = (int) salary/28;
		tax = salary * 5/100;
		Netsalary = Present * perDaySal;
		deduction =	salary - Netsalary;
	
	}
	
	@Override
	public void getslip() {
		System.out.println("------------------------------------------------------------------------------------------------------------------------------------------");
		System.out.println("----Payslips for Employee-----");
		System.out.println("ID: " + Eid);
		System.out.println("Name: " + Ename);
		System.out.println("Employee Department: " + Edept );
		System.out.println("Total working days: "+TotalworkingDays+"\t\t\t " + "Present Days: "+ Present +"\t\t\t " + "Absent Days: "+leave);
		System.out.println("Employee Salary: "+salary+"\t\t " + "Travel Allowance: "+ Paypro.TA + "\t\t " + "Home Allowance: "+ Paypro.HA +"\t\t " + "Tax :"+tax);
		System.out.println("NetSalary Credited: "+Netsalary+ "\t\t " + "Salary Deducted: "+deduction);
		System.out.println("------------------------------------------------------------------------------------------------------------------------------------------");
	}

	
	
}

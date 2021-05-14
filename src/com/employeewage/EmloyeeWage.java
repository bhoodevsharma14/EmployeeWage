package com.employeewage;
import java.util.Random;
import java.util.Scanner;
public class EmloyeeWage {

	static int WAGEPERHR;
	static int MAXWORKINGHRS;
	static int MAXWORKINGDAYS;
	static int HALFDAYWORKINGHRS;
	static int FULLDAYWORKINGHRS;
	static String COMPANY_NAME;
	
	static int totalWorkingHrs=0;
	
	public EmloyeeWage()
	{	
		Scanner scan = new Scanner(System.in);
		System.out.println("Enter the Company Name : ");
		COMPANY_NAME=scan.next();
		System.out.println("Enter the Companie's Maximun Working Days in a Month: ");
		MAXWORKINGDAYS=scan.nextInt();
		if(MAXWORKINGDAYS>31 || MAXWORKINGDAYS <1) 
			System.out.println("Invalid Input Default Maximum Working Day in Month Set to 20 Day");
		System.out.println("Enter Maximun Working Hours In a Month : ");
		MAXWORKINGHRS=scan.nextInt();
		System.out.println("Enter Half Day Working Hours : ");
		HALFDAYWORKINGHRS=scan.nextInt();
		System.out.println("Enter Full Day Working Hours : ");
		FULLDAYWORKINGHRS=scan.nextInt();
		System.out.println("Enter the Companie's Wage Per Hour : ");
		WAGEPERHR=scan.nextInt();		
	}
	
	
	static void attendanceSheet()
	{
		
		
		for(int day=1;day<=MAXWORKINGDAYS;day++)
		{			
			
			attendance();
			if (totalWorkingHrs>=MAXWORKINGHRS)
			{
				totalWorkingHrs=MAXWORKINGHRS;
				break;
			}
		}
	
	}
	
	static void attendance()
	{
		Random rand = new Random();
		int attendance=rand.nextInt(3);				
		final int halfDay=1,fullDay=2;
		switch(attendance)
		{
			case halfDay:
				totalWorkingHrs+=HALFDAYWORKINGHRS;
				break;
			case fullDay:
				totalWorkingHrs+=FULLDAYWORKINGHRS;
		}
	}
	
	static void calculateSalary()
	{
		System.out.println("\nWelcome to Employee Wage Builder of "+COMPANY_NAME);
		attendanceSheet();
		System.out.println("Employee Earn : $" + totalWorkingHrs*WAGEPERHR + " This Month." );		
	}
	
	public static void main(String[] args)
	{
		EmloyeeWage Dmart=new EmloyeeWage();
		Dmart.calculateSalary();
	}
}

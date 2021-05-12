package com.employeewage;
import java.util.Random;
public class EmloyeeWage {

	public static void main(String[] args)
	{
		System.out.println("Welcome to Employee Wage Builder");
		Random rand = new Random();
		int attendance=rand.nextInt(3);
			
		int workinghr=0,WAGEPERHR=20;
		
		switch(attendance)
		{
			case 0:
					System.out.println("Employee is Absent");
					workinghr=0;
					break;
			case 1:
				 	System.out.println("Employee is Present");
					System.out.println("Employee Is Working For Half Day");
					workinghr=4;
					break;
			case 2:
					System.out.println("Employee is Present");
					System.out.println("Employee Is Working For Full  Day");
					workinghr=8;
		}
		
		System.out.println("Employee Earn : " + workinghr*WAGEPERHR );
		
	}
}

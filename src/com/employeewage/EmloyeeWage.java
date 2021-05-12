package com.employeewage;
import java.util.Random;
public class EmloyeeWage {

	public static void main(String[] args)
	{
		System.out.println("Welcome to Employee Wage Builder");
		Random rand = new Random();
		int WAGEPERHR=20;
		int totalWorkinghr=0;
		for(int day=1;day<=20;day++)
		{			
			int attendance=rand.nextInt(3);	
			
			
			switch(attendance)
			{
			case 0:
				System.out.println("Employee is Absent");
				totalWorkinghr+=0;
				break;
			case 1:
				System.out.println("Employee is Present");
				System.out.println("Employee Is Working For Half Day");
				totalWorkinghr+=4;
				break;
			case 2:
				System.out.println("Employee is Present");
				System.out.println("Employee Is Working For Full  Day");
				totalWorkinghr+=8;
			}
		}
		
		System.out.println("Employee Earn : " + totalWorkinghr*WAGEPERHR );
		
	}
}

package com.employeewage;
import java.util.Random;
public class EmloyeeWage {

	public static void main(String[] args)
	{
		System.out.println("Welcome to Employee Wage Builder");
		Random rand = new Random();
		int attendance=rand.nextInt(2);
		int workinghr,WAGEPERHR=20;
		
		if (attendance==0)
		{
			System.out.println("Employee is Absent");
			workinghr=0;
		}
		
		else
		{
			System.out.println("Employee is Present");
			int checkworkTm=rand.nextInt(2);
			if (checkworkTm==0)
			{	System.out.println("Employee Is Working For Half Day");
				workinghr=4;
			}
			else
			{	System.out.println("Employee Is Working For Full  Day");
				workinghr=8;
			}
		}
		
		System.out.println("Employee Earn :" + workinghr*WAGEPERHR );
	}
}

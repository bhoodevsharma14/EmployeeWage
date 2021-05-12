package com.employeewage;
import java.util.Random;
public class EmloyeeWage {

	public static void main(String[] args)
	{
		System.out.println("Welcome to Employee Wage Builder");
		Random rand = new Random();
		int attendance=rand.nextInt(2);
		if (attendance==0)
			System.out.println("Employee is Absent");
		else
			System.out.println("Employee is Present");
	}
}

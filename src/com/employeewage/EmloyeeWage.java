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
						totalWorkinghr+=0;
						break;
				case 1:
						totalWorkinghr+=4;
						break;
				case 2:
						totalWorkinghr+=8;
			}
			
			if (totalWorkinghr>=100)
			{
				totalWorkinghr=100;
				break;
			}
		}
		
		System.out.println("Employee Earn : $" + totalWorkinghr*WAGEPERHR + " This Month." );
		
	}
}

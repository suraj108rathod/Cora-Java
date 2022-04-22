package Testpackage1;

public class leapyr {
	public static void main(String[] args) 
	{
		int year_2019 = 2019;//%400
		int year_2020 = 2020;//%4
		int year_2021 = 2021;//!100
	
	if(year_2019 % 400 ==0 || year_2019 % 4 ==0 && year_2019 % 100 !=0)
	{	
System.out.println("2019 is a leap year");}
else
{
	System.out.println("2019 is a not leap year ");
	if(year_2020 % 400 ==0 || year_2020 % 4 ==0 && year_2020 % 100 ==0)
	{
		System.out.println("2020 is a leap year");}
		else 
		{
		System.out.println("2020 is a not leap year");
		}
	if(year_2021 % 400 ==0 || year_2021 % 4 ==0 && year_2021 % 100 !=0)
	{
		System.out.println("2021 is a leap year");
	}
	else
	{
		System.out.println("2021 is a not leap year");
	}
	}
		}
	}

package Conditions;

public class CheckNumber {
	public static void main(String[] args)
	{
		int num1=25;
		int num2=12;
		int num3=42;
		if(num1>num2&&num1>num3)
		{
			System.out.println("Number 1 is greater");
		}
		else if(num2>num1&&num2>num3)
		{
			System.out.println("Number 2 is greater");
		}
		else
		{
			System.out.println("Number 3 is greater");
		}
	}

}

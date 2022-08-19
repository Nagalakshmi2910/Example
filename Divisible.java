package Conditions;

public class Divisible {
	public static void main(String[] args) {
		int num=10;
		if(num%2==0&&num%5==0)
		{
			System.out.println("It is divisible by 2 and 5 ");
		}
		else if(num%2==0||
				num%5==0)
		{
			System.out.println("It is divisible by 2 or 5");
		}
		else
		{
			System.out.println("It is not divisble by 2 and 5");
		}
		
	}

}

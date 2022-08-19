package Conditions;

public class StudentMarks {
	public static void main(String[] args)
	{
		int marks=45;
		if(marks>90)
		{
			System.out.println("First class");
			
		}
		else if(marks>=80&&marks<=90)
		{
			System.out.println("Second class");
			
		}
		else if(marks>=60&&marks<80)
		{
			System.out.println("Third class");
		}
		else
		{
			System.out.println("Defaul value");
		}
			
	}

}

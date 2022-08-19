package Conditions;

public class StudentAge {
	public static void main(String[] args) {
		int raviAge=35;
		int ramAge=15;
		int arunAge=22;
		if(raviAge<ramAge&&raviAge<arunAge)
		{
			System.out.println("Ravi is Youngest");
		}
		else if(ramAge<raviAge&&ramAge<arunAge)
		{
			System.out.println("Ram is Youngest");
			
		}
		else
		{
			System.out.println("Arun is Youngest");
		}
	}

}

package Conditions;

public class CheckPassword {
	public static void main(String[] args)
	{
		String name="Naga";
		String password="naga@123";
		if(name.equals("Naga")&&password.equals("naga@123"))
		{
			System.out.println("valid user");
		}
		else
		{
			System.out.println("Invalid user");
		}
	}

}

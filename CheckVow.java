package Conditions;

public class CheckVow {
	public static void main(String[] args)
	{
		String word="Hello";
		if(word.contains("a")||word.contains("e")||word.contains("i")||word.contains("o")||word.contains("u"))
		{
			System.out.println("word contains vowels");
		}
		else
		{
			System.out.println("Word does not contains vowels");
		}
	}

}

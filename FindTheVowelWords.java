package Conditions;

public class FindTheVowelWords {
	public static void main(String[] args) {
		String name="Nagalakshmi";
		if(name.contains("a")||name.contains("e")||name.contains("i")||name.contains("o")||name.contains("u"))
		{
			System.out.println("Word contains Vowels");
			
		}
		else {
			System.out.println("Word does not contain vowels");
		}
	}

}

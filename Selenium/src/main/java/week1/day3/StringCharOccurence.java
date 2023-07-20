package week1.day3;

public class StringCharOccurence {
	public static void main(String[] args) {
		String personName = "Aradhyula Padmavathi Jahnavi";
		char[] name = personName.toCharArray();
		char findChar = 'a';
		int count = 0;
		for(int i =0; i<name.length; i++)	{
			if(name[i]==findChar) {
				count++;
			}
		}
		System.out.println("The character '" +findChar+ "' is occuring " +count+ " times");
	}

}

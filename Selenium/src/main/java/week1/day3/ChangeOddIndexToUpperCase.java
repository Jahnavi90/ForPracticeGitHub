package week1.day3;

public class ChangeOddIndexToUpperCase {

	public static void main(String[] args) {
		String Upprcase = "changeme";
		
		char[] Uc = Upprcase.toCharArray();
		
		for(int i =0; i<Uc.length; i++)	{
			if(i%2 == 0)
				continue;
				else {
					Uc[i] = Character.toUpperCase(Uc[i]);
				}	
			}
		System.out.println(Uc);
	}
}
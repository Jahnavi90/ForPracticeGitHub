package week1.day2;

public class IsPrimeAnotherMethod {
	public static void main(String[] args) {
		int num = 37;
		int rem = 0;
		
		for (int i=num-1; i >=2; i--)
		{
			if(num%i==0) {
				System.out.println(num+" is a Non Prime Number");
				rem = 1;
				break;
			}
		}
		if(rem==0) {
			System.out.println(num+" is a Prime Number");
		}
		}
	}	
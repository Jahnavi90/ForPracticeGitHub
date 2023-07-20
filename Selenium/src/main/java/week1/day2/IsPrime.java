package week1.day2;

public class IsPrime {
	public static void main(String[] args) {
		boolean bPrime = true;
		int num = 59;
				for (int i=num-1; i >=2; i--)
		{
			if(num%i==0) {
				System.out.println(num+" Non Prime");
				bPrime = false;
				break;
			}
		}
		if(bPrime) {
			System.out.println(num+" Prime Number");
		}
		}
	}	
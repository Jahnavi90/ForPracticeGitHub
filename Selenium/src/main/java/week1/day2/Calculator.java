package week1.day2;

public class Calculator {
	
	public int addThreeNumbers(int num1, int num2, int num3) {
		int sum = num1+num2+num3;
	    return sum;

	}

	public int multiply_(int num1, int num2) {
		int mul = num1*num2;
		return mul;
	}
	public void divide_(int num1, int num2) {
		System.out.println("Quotient is:" + num1/num2);
	}
	public static void main(String[] args) {
		Calculator calculator = new Calculator();
		int sum= calculator.addThreeNumbers(34, 35, 36);
		System.out.println("Addition is:" + sum);
		int mul= calculator.multiply_(40, 50);
		System.out.println("Product is:" + mul);
		calculator.divide_(26, 2);
	}

}

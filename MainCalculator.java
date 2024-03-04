package my.Learning;

public class MainCalculator {

	public static void main(String[] args) {
		
		Calculator calculator = new Calculator();
		calculator.setFirst(10);
		calculator.setSecond(20);
		double sum = calculator.addition();
		System.out.println(sum);
		

	}

}

import java.util.*;

public class SimpleCalculator {

	double firstNumber;
	double secondNumber;
	private static Scanner sc;

	public double getFirstNumber() {
		return firstNumber;
	}

	public double getSecondNumber() {
		return secondNumber;
	}

	public void setFirstNumber(double d) {
		firstNumber = d;
	}

	public void setSecondNumber(double s) {
		secondNumber = s;
	}

	public double getAdditionResult() {
		return firstNumber + secondNumber;
	}

	public double getSubtractionResult() {
		return secondNumber - firstNumber;
	}

	public double getMultiplicationResult() {
		return secondNumber * firstNumber;
	}

	public double getDivisionResult() {
		if (secondNumber == 0) {
			return 0;
		} else {
			return firstNumber / secondNumber;
		}

	}

	public static void main(String[] args) {
		SimpleCalculator calculator = new SimpleCalculator();
		sc = new Scanner(System.in);
		System.out.println("Enter Two Double Type Values");
		double a = sc.nextInt();
		calculator.setFirstNumber(a);
		double b = sc.nextDouble();
		calculator.setSecondNumber(b);
		System.out.println("add= " + calculator.getAdditionResult());
		System.out.println("subtract= " + calculator.getSubtractionResult());
		calculator.setFirstNumber(a);
		calculator.setSecondNumber(b);
		System.out.println("multiply= " + calculator.getMultiplicationResult());
		System.out.println("divide= " + calculator.getDivisionResult());
	}
}

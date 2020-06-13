package az.maqa.project;

public class MathImpl implements MathExamples {

	@Override
	public int add(int a, int b) {
		return a + b;
	}

	@Override
	public int subtract(int a, int b) {
		return a - b;
	}

	@Override
	public double divide(double a, double b) {
		return a / b;
	}

	@Override
	public double multiple(double a, double b) {
		return a * b;
	}

	@Override
	public double rootOfElement(double a) {
		return Math.sqrt(a);
	}

	@Override
	public double powExample(double a, double b) {
		return Math.pow(a, b);
	}

	@Override
	public int sumOfElements(int a, int b) {
		int sum = 0;
		if (b > a) {
			for (int i = a; i <= b; i++) {
				sum += i;
			}
		} else {
			return 0;
		}

		return sum;
	}

	public void welcome() {
		System.out.println("Welcome");
	}
	
}

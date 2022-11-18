package Katas.FizzBuzz;

public class FizzLogic {
	private int num;

	public FizzLogic(int number) {
		this.num = number;
	}

	public void FizzBuzz() {

		if (num % 5 == 0 && num % 3 == 0 && num % 7 == 0) {
			System.out.println("Fizz Buzz Pop");
		} else if (num % 3 == 0 && num % 7 == 0) {
			System.out.println("Fizz Pop");
		} else if (num % 5 == 0 && num % 7 == 0) {
			System.out.println("Buzz Pop");
		} else if (num % 5 == 0 && num % 3 == 0) {
			System.out.println("Fizz Buzz");
		} else if (num % 7 == 0) {
			System.out.println("Pop");
		} else if (num % 5 == 0) {
			System.out.println("Buzz");
		} else if (num % 3 == 0) {
			System.out.println("Fizz");
		} else {
			System.out.println(num);

		}

	}

}

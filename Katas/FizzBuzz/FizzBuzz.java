package Katas.FizzBuzz;

import java.util.Scanner;

public class FizzBuzz {

	public static void main(String[] args) {

		Scanner scanner = new Scanner(System.in);
		Scanner scanner2 = new Scanner(System.in);
		int num = 0;
		int game = 0;
		boolean loop = true;
		
		while (loop) {
			
			System.out.println("Select your game (1: FizzBuzzPop | 2: CustomFizzBuzz: ");
			game = scanner.nextInt();

			if (game == 1) {
				System.out.println("Write a number: ");
				num = scanner.nextInt();

				FizzLogic fizz = new FizzLogic(num);
				fizz.FizzBuzz();
				loop = false;
			} else if (game == 2) {
				int[] nums = new int[3];
				String[] results = new String[3];

				for (int i = 0; i < 3; i++) {
					System.out.println("Select the divisble number " + (i+1) + ":");
					nums[i] = scanner.nextInt();

					System.out.println("Select the result for divisible " + (i+1) + ":");
					results[i] = scanner2.nextLine();
				}
				
				System.out.println("Introduce the number: ");
				num = scanner.nextInt();
				
				FizzCustomLogic fizzCustom = new FizzCustomLogic(nums, results, num);
				fizzCustom.CustomFizzBuzz();
				loop = false;

			} else {
				System.out.println("Invalid input");
				
			}
			
		}
		
		
		

	}

}

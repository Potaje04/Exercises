package Katas.FizzBuzz;

import java.util.ArrayList;

public class FizzCustomLogic {

	int[] num;
	String[] result;
	private int ns = 0;

	public FizzCustomLogic(int[] num, String[] result, int ns) {
		this.num = num;
		this.result = result;
		this.ns = ns;

	}

	public void CustomFizzBuzz() {

		if (ns % num[0] == 0 && ns % num[1] == 0 && ns % num[2] == 0) {
			System.out.println(result[0] + result[1] + result[2]);
		} else if (ns % num[0] == 0 && ns % num[1] == 0) {
			System.out.println((result[0] + result[1]));
		} else if (ns % num[0] == 0 && ns % num[2] == 0) {
			System.out.println((result[0] + result[2]));
		} else if (ns % num[1] == 0 && ns % num[2] == 0) {
			System.out.println((result[1] + result[2]));
		} else if (ns % num[0] == 0) {
			System.out.println(result[0]);
		} else if (ns % num[1] == 0) {
			System.out.println(result[1]);
		} else if (ns % num[2] == 0) {
			System.out.println(result[2]);
		} else {
			System.out.println(num);

		}

	}

	// private ArrayList<Integer> num;
//	private ArrayList<String> result;
//	private static int position;
//	public FizzCustomLogic (ArrayList<Integer> num, ArrayList<String> result) {
//		this.num = num;
//		this.result = result;
//	}
//	
//	public void FizzBuzz () {
//		
//		for(int i = 0; i < num.size(); i++) {
//			
//		}
//	}
//	
//	public int getInsertedNumber (int num) {
//		
//		return num;
//	}

}

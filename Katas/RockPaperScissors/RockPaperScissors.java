package Katas.RockPaperScissors;

import java.util.Random;
import java.util.Scanner;

public class RockPaperScissors {

	public static void main(String[] args) {
		int player = 0;
		int computer = 0;
		boolean loop = true;
		
		Random ran = new Random();
		
		Scanner sc = new Scanner (System.in);
		
		do {
			
			computer = ran.nextInt(2+1)+1;
			System.out.println("Introduzca 1:Piedra | 2:Papel | 3:Tijera | 0:Salir");
			player = sc.nextInt();
			System.out.println(computer);
			if ( player == computer ) {
				System.out.println("Empate");
			} else if (player == 1 && computer == 2) {
				System.out.println("Papel gana a piedra. Tu pierdes");
			} else if (player == 1 && computer == 3) {
				System.out.println("Piedra gana a tijera. Tu ganas");
			} else if (player == 2 && computer == 1) {
				System.out.println("Papel gana a piedra. Tu ganas");
			} else if (player == 2 && computer == 3) {
				System.out.println("Tijera gana a papel. Tu pierdes");
			} else if (player == 3 && computer == 1) {
				System.out.println("Piedra gana a tijera. Tu pierdes");
			} else if (player == 3 && computer == 2) {
				System.out.println("Tijera gana a papel. Tu ganas");
			}  else if (player == 0) {
				System.out.println("Fin de juego");
				loop = false;
			} else {
				System.out.println("Valor incorrecto");
			}
		} while (loop);
	

	}

}

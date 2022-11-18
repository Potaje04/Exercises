package Katas.Tennis;

import java.util.Scanner;

public class Tennis {

	public static void main(String[] args) {

		int server = 0;
		int receiver = 0;
		int point = 0;
		boolean loop = true;
		Scanner sc = new Scanner(System.in);

		System.out.println("El partido empieza: " + server + " | " + receiver);

		while (loop) {
			System.out.println("¿Que jugador ha anotado: 1:Server | 2:Receiver  ");
			point = sc.nextInt();

			if (point == 1) {
				if (server == 0 || server == 15) {
					server += 15;
				} else if (server == 30) {
					server += 10;
				} else if (server <= 40 && receiver == 30) {
					System.out.println("Server ha ganado!!, fin del juego");
					loop =  false;
				}else if (server == 40 && receiver == 40) {
					server+=10;
				}else if (server == 50 && receiver == 40) {
					System.out.println("Server ha ganado!!, fin del juego");
					loop =  false;
				} else  if (server == 40 && receiver == 50) {
					receiver-=10;
				} else {
					
					System.out.println("Server ha ganado!!, fin del juego");
					loop =  false;
				
				}
				if (loop) {
					System.out.println("La puntuación actual es: " + (server==50? "A" :server)  + " | " + receiver);
					
				}
				
			} else if (point == 2) {
				if (receiver == 0 || receiver == 15) {
					receiver += 15;
				} else if (receiver == 30) {
					receiver += 10;
				} else if (server <= 30 && receiver == 40) {
					System.out.println("Receiver ha ganado!!, fin del juego");
					loop =  false;
				}else if (server == 40 && receiver == 40) {
					receiver+=10;
				}else if (server == 50 && receiver == 40) {
					server-=10;
				} else  if (server == 40 && receiver == 50) {
					System.out.println("Server ha ganado!!, fin del juego");
					loop =  false;
				} else  {
					
					System.out.println("Receiver ha ganado!!, fin del juego");
					loop =  false;
				}
				if (loop) {
					System.out.println("La puntuación actual es: " + server  + " | " + (receiver==50? "A" :receiver));
					
				}
				
			} else {
				System.out.println("Valor no válido");
			}

		}

	}

}

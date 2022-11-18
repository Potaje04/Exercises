package Katas.Tamagotchi;

import java.util.Random;

public class TamagotchiHandler {
	
	Random ran = new Random();
	
	private TamagotchiBody tama;
	private final int TOP_LIMIT = 100;
	private final int BOTTOM_LIMIT = 20;
	
	public TamagotchiHandler(TamagotchiBody tamagotchi) {
		this.tama = tamagotchi;
	}
	
	public void poop () {
		int random = ran.nextInt(20+10)+10;
		
		if (tama.getFullness()>BOTTOM_LIMIT) {
			tama.setFullness(tama.getFullness()-random);
			System.out.println("Tamagotchi is pooping :)");
		} else {
			System.out.println("No need to poop");
		}
	}
	
	public void feeding () {
		int random = ran.nextInt(20+10)+10;
				
		tama.setFullness(tama.getFullness() + random);
		System.out.println("Tamagotchi has eaten :)");
			
		if (tama.getFullness()>TOP_LIMIT) {
			System.out.println("Your tamagotchi has eaten too much");
			tama.setFullness(TOP_LIMIT);
			poop();
			
		}
	}
	
	public void playing () {
		int random = ran.nextInt(20+10)+10;
		
		if (tama.getTiredness()>=TOP_LIMIT || 
				tama.getHappiness()>=TOP_LIMIT && tama.getFullness()<BOTTOM_LIMIT) {
			System.out.println("Your tamagotchi doesn´t want to play");
		}
		
		if (tama.getHappiness()<=TOP_LIMIT && tama.getTiredness()<=TOP_LIMIT) {
			tama.setHappiness(tama.getHappiness()+random);
			System.out.println("Your tamagotchi is playing. It looks happier");
		}
		if (tama.getHappiness()>=100 && tama.getFullness()>20) {
			System.out.println("Your tamagotchi was so happy it had an accident :( !!");
			poop();
			tama.setHappiness(90);
		} else {
			System.out.println("Your tamagotchi doesn´t want to play anymore");
		}
	}
}






















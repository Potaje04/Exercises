package Katas.Tamagotchi;

public class TamagotchiBody {
	
	private int fullness;
	private int tiredness;
	private int happiness;
	
	public TamagotchiBody () {
		this.fullness=100;
		this.tiredness=0;
		this.happiness=100;
	}

	public int getFullness() {
		return fullness;
	}

	public void setFullness(int fullness) {
		this.fullness = fullness;
	}

	public int getTiredness() {
		return tiredness;
	}

	public void setTiredness(int tiredness) {
		this.tiredness = tiredness;
	}

	public int getHappiness() {
		return happiness;
	}

	public void setHappiness(int happiness) {
		this.happiness = happiness;
	}
	
}

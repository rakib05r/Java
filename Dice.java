package first;

public class Dice {
	int randomValue;
	
	void roll(){
		randomValue=(int)(Math.random()*100+1);
	}
}

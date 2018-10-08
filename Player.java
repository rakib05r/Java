package first;

public class Player {
	int value;
	
	void throwDice(Dice diceOne,Dice diceTwo){
		
		diceOne.roll();
		diceTwo.roll();
		
		value=diceOne.randomValue+diceTwo.randomValue;
		
	}
}

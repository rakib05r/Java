package first;

public class DiceGame {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		
		
		Player player1=new Player();
		Player player2=new Player();
		Player player3=new Player();
		
		Dice diceOne=new Dice();
		Dice diceTwo=new Dice();
		
		player1.throwDice(diceOne, diceTwo);
		player2.throwDice(diceOne, diceTwo);
		player3.throwDice(diceOne, diceTwo);
		
		int p1,p2,p3;
		
		p1=player1.value;
		p2=player2.value;
		p3=player3.value;
		System.out.println("____________Dice Game_____________");
		System.out.println("\nScore of player1:"+p1+"\nScore of player2:"+p2+"\nScore of player3: "+p3);
		
		if(p1>p2&& p1>p3){
			System.out.println("Player1 have won\n");
		}
		else if(p2>p1 && p2>p3){
			System.out.println("Player2 have won\n");
		}
		else{
			System.out.println("Player3 have won\n");
		}
	}

}

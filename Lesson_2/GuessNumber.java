import java.util.*;

public class GuessNumber {			  	
	void startGame() {
		Scanner scan = new Scanner(System.in);
		Player player = new Player();
		Random r = new Random();
		player.setPlayers();
		int firstGuess = 0;
		int secondGuess = 0;
		int maxNumber = 100;
		int hiddenNum = r.nextInt(maxNumber + 1);
		do {	  		
			System.out.println("Enter the number and wait the verification");
	  		firstGuess = scan.nextInt();
	  		secondGuess = scan.nextInt();

	  		if(firstGuess < hiddenNum) {
	  			System.out.println("Number " + player.getFirstNickname() + " less than correct");

	  		} else if (firstGuess > hiddenNum) {
	  			System.out.println("Number " + player.getFirstNickname() + " greater than correct");
	  	  	} else if (firstGuess == hiddenNum) {
	  	  		System.out.println("Player " + player.getFirstNickname() + " won!");
	  	  		break; 
	  	  	}

	  	  	if (secondGuess > hiddenNum) {
	  	  		System.out.println("Number " + player.getSecondNickname() + " greater than correct");
	  	  	} else if (secondGuess < hiddenNum) {
	  	  		System.out.println("Number " + player.getSecondNickname() + " less than correct");
	  	  	} else if (secondGuess == hiddenNum) {
	  	  		System.out.println("Player " + player.getSecondNickname() + " won!");
	  	  		break;
	  	  	} 	
		} while(firstGuess != hiddenNum || secondGuess != hiddenNum);	
	} 
}
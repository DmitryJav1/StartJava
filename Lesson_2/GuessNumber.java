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
			System.out.println("Введите число, а потом ждите ответа от программы!");
	  		firstGuess = scan.nextInt();
	  		secondGuess = scan.nextInt();

	  		if(firstGuess < hiddenNum) {
	  			System.out.println("Число " + player.getFirstNickname() + " меньше правильного");

	  		} else if (firstGuess > hiddenNum) {
	  			System.out.println("Число " + player.getFirstNickname() + " больше правильного");
	  	  	} else if (firstGuess == hiddenNum) {
	  	  		System.out.println("Игрок " + player.getFirstNickname() + " победил!");
	  	  		break; 
	  	  	}

	  	  	if (secondGuess > hiddenNum) {
	  	  		System.out.println("Число " + player.getSecondNickname() + " больше правильного");
	  	  	} else if (secondGuess < hiddenNum) {
	  	  		System.out.println("Число " + player.getSecondNickname() + " меньше правильного");
	  	  	} else if (secondGuess == hiddenNum) {
	  	  		System.out.println("Игрок " + player.getSecondNickname() + " победил!");
	  	  		break;
	  	  	} 	
		} while(firstGuess != hiddenNum || secondGuess != hiddenNum);	
	} 
}

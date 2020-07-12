import java.util.*;

public class GuessNumber {			  	
	String firstName;
	String secondName;
	int firstGuess;
	int secondGuess;

	void setFirstName(String firstName) {
		this.firstName = firstName;
	}

	void setSecondName(String secondName) {
		this.secondName = secondName;
	}

	void setFirstGuess(int firstGuess) {
		this.firstGuess = firstGuess;
	}

	void setSecondGuess(int secondGuess) {
		this.secondGuess = secondGuess;
	}

	void startGame() {
		Scanner scan = new Scanner(System.in);
		Random r = new Random();
		//int firstGuess;
		//int secondGuess;
		int maxNumber = 100;
		int hiddenNum = r.nextInt(maxNumber + 1);
		do {	  		
			System.out.println("Enter the number and wait the verification");
	  		firstGuess = scan.nextInt();
	  		secondGuess = scan.nextInt();

	  		if(firstGuess < hiddenNum) {
	  			System.out.println("Number " + firstName + " less than correct");

	  		} else if (firstGuess > hiddenNum) {
	  			System.out.println("Number " + firstName + " greater than correct");
	  	  	} else if (firstGuess == hiddenNum) {
	  	  		System.out.println("Player " + firstName + " won!");
	  	  		break; 
	  	  	}

	  	  	if (secondGuess > hiddenNum) {
	  	  		System.out.println("Number " + secondName + " greater than correct");
	  	  	} else if (secondGuess < hiddenNum) {
	  	  		System.out.println("Number " + secondName + " less than correct");
	  	  	} else if (secondGuess == hiddenNum) {
	  	  		System.out.println("Player " + secondName + " won!");
	  	  		break;
	  	  	} 	
		} while(firstGuess != hiddenNum || secondGuess != hiddenNum);	
	} 
}
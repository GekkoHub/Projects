//NOTES: so I'm halfway through rewriting the dealer code
//everytime it hits it takes the original dealerhand regardless of whether its hit already or not
//setting a new variable to the sum of the first dealer hit would be ideal imo, but I'm not sure how
//to code it that way.
//Player code should probably follow that same philosophy but I believe it was functioning *mostly*
//bug free before I started hacking the code up for the dealer section


import java.util.Scanner;

public class Core {
	public static void main(String args[]) {
		Scanner sc = new Scanner(System.in);
		
	System.out.println("Welcome to this basic Blackjack Program");
	System.out.println("Dealer stands on 17.  No insurance or doubles allowed");
	System.out.println("Let's begin");
	int dealerhand = (int)(Math.random() * 21 + 1);
	//assigning a variable to random generation was retarded, don't do this
	//int hit = (int)(Math.random() * 11 + 1);
	System.out.println("Dealers hand is " + dealerhand);
	
	//Dealer hand begins
	
	
	if (dealerhand < 17) {
		int newdealerhand = nextInt();
		System.out.println("Dealer hits, dealers hand is now " + (dealerhand+(int)(Math.random() * 11 + 1)));
		if(newdealerhand > 21) {
			System.out.println("Dealer bust");
			}
		else if (newdealerhand < 17) {
			System.out.println("Dealer hits again, dealers hand is now a " + (newdealerhand+(int)(Math.random() * 11 + 1)));
			}
		if(newdealerhand > 21) {
			System.out.println("Dealer bust");
			}
	}
	
	//Player hand begins
	
	
	int playerhand = (int)(Math.random() * 21 + 1);
	System.out.println("Player hand is " + playerhand);
	System.out.println("Would you like to hit? Yes or No.");
	String input = sc.nextLine();
	if(input.equals("No")) {
		System.out.println("Dealers hand was " + dealerhand + " and your hand was " + playerhand);
		if(dealerhand>playerhand) {
			System.out.println("The Dealer has won"); 
		}	else {
				System.out.println("You have won"); 
			
		}
	}
	if(input.equals("Yes")) {
		System.out.println("Your hand is now " + (playerhand+(int)(Math.random() * 11 + 1)));
		if(playerhand > 21) {
			System.out.println("You have bust. Dealer wins");
		}
		if(playerhand < 21) {
			System.out.println("Would you like to hit or stand?");
			String input2 = sc.nextLine();
			if(input2.equals("Hit")) {
				System.out.println("Your new hand is " + (playerhand+(int)(Math.random() * 11 + 1)));
			}
			else {
				System.out.println("Dealers hand was " + dealerhand + " and your hand was " + playerhand);
				if(dealerhand>playerhand) {
					System.out.println("The Dealer wins");
				}
				else {
					System.out.println("Player wins");
				}
				
				
			}
			
		}
	
	}
	
	
	
	
	
	

	
	
		
		
		
		sc.close();
		
	}

		
		
		
}

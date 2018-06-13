import java.util.Scanner;
public class BlackjackGame {
	static Scanner scan = new Scanner(System.in);
	static Deck myDeck = new Deck();
	public static void main(String[] args) {
		System.out.println("It's Blackjack Time!!");
		while(true){
			System.out.println("Deal Card? Y or N");
			String input = scan.next();
			if(input == "Y"){
				dealCard();
			}
		}
  }

	public static void dealCard(){
		System.out.println(myDeck.dealCard());
	}
}

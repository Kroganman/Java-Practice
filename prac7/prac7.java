import java.util.Scanner;
import java.util.ArrayDeque;

public class Game {
	public static void setCards(ArrayDeque<Integer> array) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter yours cards: ");
        for (int i = 0; i < 5; i++) 
        {
        	array.addLast(sc.nextInt());
        }
	}
	
	public static void main(String[] args) {
		ArrayDeque<Integer> Player1 = new ArrayDeque<Integer>();
		ArrayDeque<Integer> Player2 = new ArrayDeque<Integer>();
		setCards(Player1);
		setCards(Player2);
		int Card1, Card2;
		for (int i = 1; i <= 106; i++) {
			Card1 = Player1.pollFirst();
			Card2 = Player2.pollFirst();
			if (((Card1 > Card2) && (Card1 != 9 && Card2 != 0)) || (Card1 == 0 && Card2 == 9)) {
				Player1.addLast(Card1);
				Player1.addLast(Card2);
				if (Player2.peekFirst() == null) {
					System.out.println("Player 1 win!");
					return 1;
				}
			}
			else if (((Card1 < Card2) && (Card1 != 0 && Card2 != 9)) || (Card1 == 9 && Card2 == 0)) {
				Player2.addLast(Card1);
				Player2.addLast(Card2);
				if (Player1.peekFirst() == null) {
					System.out.println("Player 2 win!");
					return 2;
				}
			}
		}
		System.out.println("Botva!");
	}

}

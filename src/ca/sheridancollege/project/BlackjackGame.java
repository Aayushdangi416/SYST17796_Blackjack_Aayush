
/**
 * SYST 17796 Project Base code.
 * Students can modify and extend to implement their game.
 @author Aayush Dangi2025
 */
package ca.sheridancollege.project;

import java.util.Scanner;

public class BlackjackGame extends Game {

    private Deck deck;
    private BlackjackPlayer player;
    private Dealer dealer;

    public BlackjackGame() {
        super("Blackjack");
        deck = new Deck();
        player = new BlackjackPlayer("Player");
        dealer = new Dealer();

        getPlayers().add(player);
        getPlayers().add(dealer);
    }

    @Override
    public void play() {
        startRound();
        playerTurn();
        dealerTurn();
        declareWinner();
    }

    private void startRound() {
        player.getHand().addCard(deck.dealCard());
        player.getHand().addCard(deck.dealCard());

        dealer.getHand().addCard(deck.dealCard());
        dealer.getHand().addCard(deck.dealCard());

        System.out.println("Your cards: " + player.getHand());
        System.out.println("Dealer shows: " + dealer.getHand());
    }

    private void playerTurn() {
        Scanner sc = new Scanner(System.in);
        while (true) {
            System.out.println("Hit or Stand? (H/S)");
            String choice = sc.nextLine();

            if (choice.equalsIgnoreCase("H")) {
                player.getHand().addCard(deck.dealCard());
                System.out.println("Your hand: " + player.getHand());

                if (player.getHand().isBust()) {
                    System.out.println("You BUST!");
                    break;
                }
            } else {
                break;
            }
        }
    }

    private void dealerTurn() {
        while (dealer.getHand().getTotalValue() < 17) {
            dealer.getHand().addCard(deck.dealCard());
        }

        System.out.println("Dealer's final hand: " + dealer.getHand());
    }

    @Override
    public void declareWinner() {
        int p = player.getHand().getTotalValue();
        int d = dealer.getHand().getTotalValue();

        System.out.println("Your total: " + p);
        System.out.println("Dealer total: " + d);

        if (p > 21) System.out.println("Dealer wins!");
        else if (d > 21) System.out.println("You win!");
        else if (p > d) System.out.println("You win!");
        else if (d > p) System.out.println("Dealer wins!");
        else System.out.println("Tie!");
    }
}

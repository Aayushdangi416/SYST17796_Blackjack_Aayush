/**
 * SYST 17796 Project Base code.
 * Students can modify and extend to implement their game.
 @author Aayush Dangi2025
 */
package ca.sheridancollege.project;

public class Dealer extends Player {

    private Hand hand = new Hand();

    public Dealer() {
        super("Dealer");
    }

    public Hand getHand() {
        return hand;
    }

    @Override
    public void play() {
        // Dealer hits until >=17
        System.out.println("Dealer plays...");
    }
}

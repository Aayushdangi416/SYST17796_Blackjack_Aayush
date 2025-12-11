/**
 * SYST 17796 Project Base code.
 * Students can modify and extend to implement their game.
 @author Aayush Dangi2025
 */

package ca.sheridancollege.project;

public class BlackjackPlayer extends Player {

    private Hand hand = new Hand();

    public BlackjackPlayer(String name) {
        super(name);
    }

    public Hand getHand() {
        return hand;
    }

    @Override
    public void play() {
        // Player logic handled in game
    }
}

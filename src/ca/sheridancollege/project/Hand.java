
/**
 * SYST 17796 Project Base code.
 * Students can modify and extend to implement their game.
 @author Aayush Dangi2025
 */
package ca.sheridancollege.project;

import java.util.ArrayList;

public class Hand {

    private ArrayList<PlayingCard> cards = new ArrayList<>();

    public void addCard(PlayingCard c) {
        cards.add(c);
    }

    public int getTotalValue() {
        int total = 0;
        int aces = 0;

        for (PlayingCard c : cards) {
            total += c.getValue();
            if (c.toString().startsWith("A")) aces++;
        }

        while (total > 21 && aces > 0) {
            total -= 10;
            aces--;
        }

        return total;
    }

    public boolean isBust() {
        return getTotalValue() > 21;
    }

    @Override
    public String toString() {
        return cards.toString();
    }
}

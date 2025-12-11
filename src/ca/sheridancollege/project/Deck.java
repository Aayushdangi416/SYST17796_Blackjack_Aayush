/**
 * SYST 17796 Project Base code.
 * Students can modify and extend to implement their game.
 @author Aayush Dangi2025
 */
package ca.sheridancollege.project;

import java.util.ArrayList;

public class Deck extends GroupOfCards {

    public Deck() {
        super(52);  // set deck size
        
        ArrayList<Card> newCards = new ArrayList<>();

        String[] suits = {"Hearts", "Diamonds", "Clubs", "Spades"};
        String[] ranks = {"2", "3", "4", "5", "6", "7", "8", "9", "10", "Jack", "Queen", "King", "Ace"};
        int[] values =  { 2,  3,  4,  5,  6,  7,  8,  9,  10,    10,     10,     10,    11};

        for (int s = 0; s < suits.length; s++) {
            for (int r = 0; r < ranks.length; r++) {
                newCards.add(new PlayingCard(values[r], suits[s], ranks[r]));
            }
        }

        setCards(newCards);  
        shuffle();           // Shuffle deck on creation
    }

    public PlayingCard dealCard() {
        if (cards.isEmpty()) {
            return null;
        }
        return (PlayingCard) cards.remove(0);
    }
}
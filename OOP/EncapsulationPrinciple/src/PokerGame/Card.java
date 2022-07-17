package PokerGame;

public class Card {
    private int id;
    private String strength;
    private String suit;

    Card(int id){
        if (id >=0 && id<52){
            this.id = id;
            int strengthId = id/4;
            int suitId = id%4;

            switch (strengthId){
                case 0: strength = "Two"; break;
                case 1: strength = "Three"; break;
                case 2: strength = "Four"; break;
                case 3: strength = "Five"; break;
                case 4: strength = "Six"; break;
                case 5: strength = "Seven"; break;
                case 6: strength = "Eight"; break;
                case 7: strength = "Nine"; break;
                case 8: strength = "Ten"; break;
                case 9: strength = "Jack"; break;
                case 10: strength = "Queen"; break;
                case 11: strength = "King"; break;
                case 12: strength = "Ace"; break;
            }
            switch (suitId){
                case 0: suit = "Clubs"; break;
                case 1: suit = "Diamonds"; break;
                case 2: suit = "Hearts"; break;
                case 3: suit = "Spades"; break;
            }
        }
    }

    String print()
    {
        return strength + " of " + suit;
    }
}

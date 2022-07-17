package WarGame;

class Card {
    private int id;
    private String strength;
    private String suit;

    Card(int id){
        if (id >=0 && id<52){
            this.id = id;
            int strengthId = id/4;
            int suitId = id%4;

            switch (strengthId){
                case 0: strength = "2"; break;
                case 1: strength = "3"; break;
                case 2: strength = "4"; break;
                case 3: strength = "5"; break;
                case 4: strength = "6"; break;
                case 5: strength = "7"; break;
                case 6: strength = "8"; break;
                case 7: strength = "9"; break;
                case 8: strength = "10"; break;
                case 9: strength = "J"; break;
                case 10: strength = "Q"; break;
                case 11: strength = "K"; break;
                case 12: strength = "A"; break;
            }
            switch (suitId){
                case 0: suit = "\u2663"; break;
                case 1: suit = "\u2666"; break;
                case 2: suit = "\u2665 "; break;
                case 3: suit = "\u2660"; break;
            }
        }
    }

    String print()
    {
        return strength + suit;
    }

    int cardStrength()
    {
        return this.id/4;
    }

    static int compareCards(Card card1,Card card2){
        return card1.cardStrength()-card2.cardStrength();
    }
}

package WarGame;



import java.util.Random;

class Deck {
    public static final int NUMBER_OF_CARDS = 52;
    private final Card [] cards;

    Deck(){
        this.cards = new Card[NUMBER_OF_CARDS];
        generateDeck();
        shuffleDeck(this.cards);
        printCards();
    }

/*    Deck (int capacity){
        if ((capacity>0) &&(capacity < NUMBER_OF_CARDS)) {
            this.cards = new Card[capacity];
        }else{
            this.cards = new Card[NUMBER_OF_CARDS];
        }
    }
*/
    private void generateDeck() {
        for (int index=0;index<this.cards.length;index++){
            this.cards[index]=new Card(index);
        }
    }

    void dealCards(Player p1, Player p2){
        for (int index = 0; index<52; index+=2){
            p1.takeCard(this.cards[index]);
            p2.takeCard(this.cards[index+1]);
        }
    }

    private void shuffleDeck(Card[] cards){
        Random rgen = new Random(); //Random number generator

        for (int index =0;index<cards.length;index++){
            int randomPosition = rgen.nextInt(cards.length);
            Card temp = cards[index];
            cards[index] = cards[randomPosition];
            cards[randomPosition] = temp;

        }
    }

    private void printCards(){
        System.out.println("------------Initial deck--------");
        for (int index = 0; index<cards.length;index++){

            System.out.println(cards[index].print());
        }
        System.out.println("------------Initial deck--------");
    }


}

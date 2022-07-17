package PokerGame;

import java.util.Random;

 class Dealer {
    private String name;
    private Card[] cards = new Card[52];
    private int dealtCards = 0;

    Dealer(){
        for (int index=0;index<this.cards.length;index++){
            this.cards[index]=new Card(index);
        }

        shuffleDeck(this.cards);
        printCards();
    }

     void dealCard(Player player){
        if (dealtCards<52) {
            Card dealtCard = cards[cards.length - 1 - dealtCards];
            player.takeCard(dealtCard);
            dealtCards++;
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
        for (int index = 0; index<cards.length;index++){

            System.out.println(cards[index].print());
        }
     }


}

package PokerGame;

class Player {
    private static Dealer dealer;
    private String name;
    private Card[] hand = new Card[5];
    private int receivedCards = 0;

    Player (String name, Dealer nameOfDealer){
        this.name = name;
        dealer = nameOfDealer;
    }

    public Player(String name) {
        this.name = name;
    }

    void askForCards(int numberOfCards){
        System.out.println(this.name + " asks for " + numberOfCards + " cards");
        for (int index = 0;index<=numberOfCards;index++){
            this.hand[hand.length-1-index] = null;
            this.receivedCards--;
        }
        for (int index = 0; index<=numberOfCards;index++){
            dealer.dealCard(this);
        }

    }

    void stayPass(){
        System.out.println(name + " is Pass");
    }

    void takeCard(Card dealtCard){
        if (receivedCards<hand.length){
            hand[receivedCards] = dealtCard;
            receivedCards++;
        }else{
            System.out.println("Already have maximum hand");
        }
    }

    void printHand(){
        System.out.println(name + " has: ");
        for (int index = 0;index<hand.length;index++){
            System.out.println(hand[index].print() + " ");
        }
    }

    public String getName() {
        return name;
    }
}

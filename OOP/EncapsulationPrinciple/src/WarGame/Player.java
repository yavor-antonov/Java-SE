package WarGame;

class Player {
    private String name;
    private Card [] hand = new Card[26];
    private Card [] wonCardsPile = new Card[52];
    private int wonCards=0;
    private int receivedCards=0;

    public Player(String name) {
        this.name = name;
    }

    void takeCard(Card dealtCard){
        if (receivedCards<hand.length){
            hand[receivedCards] = dealtCard;
            receivedCards++;
        }else{
            System.out.println("Already have maximum hand");
        }
    }
    void printCards(){
        System.out.println("------------"+ this.name +"--------");
        for (int index = 0; index<hand.length;index++){

            System.out.println(hand[index].print());
        }
        System.out.println("--------------------------------");
    }

    void winCard(int turn,Player player){
        System.out.print(this.name + " takes " + this.showCard(turn).print());
        wonCardsPile[wonCards] = hand[turn];
        wonCards++;
        hand[turn] = null;
        System.out.println(" and " + player.showCard(turn).print());
        wonCardsPile[wonCards]=player.loseCard(turn);
        wonCards++;
    }

    Card loseCard(int turn){
        Card temp = hand[turn];
        hand[turn] = null;
        return temp;
    }

    Card showCard(int turn){
        return hand[turn];
    }

    public int getWonCards() {
        return wonCards;
    }

    public String getName() {
        return name;
    }
}

package WarGame;

class Gameplay {

    private Player p1;
    private Player p2;
    private Deck deck;

    int turn=0;

    public Gameplay(Player p1, Player p2, Deck deck) {
        this.p1 = p1;
        this.p2 = p2;
        this.deck = deck;
    }

     void startGame(){

        while(this.turn<26){
            compareCards(this.turn);
            System.out.println("Score- " + p1.getName() + " " + p1.getWonCards()
                    + ":" + p2.getWonCards() + " " + p2.getName() );
            this.turn++;
        }

        if (this.p1.getWonCards()>this.p2.getWonCards()){
            System.out.println(this.p1.getName() + " won!");
        }
        if (this.p1.getWonCards()<this.p2.getWonCards()){
            System.out.println(this.p2.getName() + " won!");
        }
        if (this.p1.getWonCards()==this.p2.getWonCards()){
            System.out.println("Game ends in a draw!");
        }
    }

    private void compareCards(int turn){
        System.out.println(p1.showCard(turn).print() +" vs " + p2.showCard(turn).print());
        int compareCards = Card.compareCards(p1.showCard(turn),p2.showCard(turn));
        if (compareCards > 0){

            this.p1.winCard(turn,this.p2);

            return;
        }
        if (compareCards < 0){
            this.p2.winCard(turn,this.p1);

            return;
        }
        if (turn!=25){
            equalCards(turn);
        }

    }

    private void equalCards(int turn){

        if (this.turn >22){
            compareCards(25);
            if (this.p1.showCard(25)==null){
                for (int index = turn;index<26;index++){
                    this.p1.winCard(index,this.p2);
                }
            }else{
                for (int index = turn;index<26;index++){
                    this.p2.winCard(index,this.p1);
                }
            }
            this.turn=26;
        }else{
            System.out.println("Equal cards");
            System.out.println("1. " + p1.showCard(turn+1).print() +" vs " + p2.showCard(turn+1).print());
            System.out.println("2. " + p1.showCard(turn+2).print() +" vs " + p2.showCard(turn+2).print());
            compareCards(turn+3);
            if (this.p1.showCard(turn+3)==null){
                for (int index = turn;index<turn+3;index++){
                    this.p1.winCard(index,this.p2);
                }
            }else{
                for (int index = this.turn;index<this.turn+3;index++){
                    this.p2.winCard(index,this.p1);
                }
            }
            this.turn+=4;
        }

    }
}

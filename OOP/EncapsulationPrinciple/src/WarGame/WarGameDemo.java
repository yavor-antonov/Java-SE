package WarGame;



public class WarGameDemo {
    public static void main(String[] args) {
        Deck deck = new Deck();
        Player p1 = new Player("Alex");
        Player p2 = new Player("Bravo");
        Gameplay game = new Gameplay(p1,p2,deck);
        deck.dealCards(p1,p2);
        p1.printCards();
        p2.printCards();

        game.startGame();
    }




}

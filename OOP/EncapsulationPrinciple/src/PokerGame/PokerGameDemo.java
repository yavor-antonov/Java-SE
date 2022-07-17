package PokerGame;

 class PokerGameDemo {
    //create a poker app
    //the game is triple draw

		/*
			There are 5 Players. Each Player is dealt 5 cards.
			Each card has strength and suit.
			There is 1 Dealer. The dealer holds all 52 cards.
			The dealer deals each player a single card until all
			players are dealt 5 cards.
			Each player may choose to switch cards from his hand.
			Each player can switch up to 3 cards at a time.
			When switching, the player returns the number of cards and is dealt new cards.

			Write a demo that:
			1: creates 5 players and 1 Dealer ready to play.
			2: invokes a method "startGame" that:
				2.1 - commands the dealer to deal 5 cards to each player
				2.2 - prints all the cards the players have
				2.3 - commands each player to decide if he wants to switch cards
				2.4 - prints all the cards the players have
		 */
        public static void main(String[] args) {
            Dealer dealer = new Dealer();

            Player p1 = new Player("Alex",dealer);
            Player p2 = new Player("Bran");
            Player p3 = new Player("Charlie");
            Player p4 = new Player("Danny");
            Player p5 = new Player("Emiliya");

            Player [] players = new Player[5];
            players[0] = p1;
            players[1] = p2;
            players[2] = p3;
            players[3] = p4;
            players[4] = p5;


            startGame(dealer,players);
        }

        private static void startGame(Dealer dealer, Player[] players){
            //deals 5 cards to each player
            for (int index = 0; index< players.length ;index++){
                for (int player = 0; player<5; player++){
                    dealer.dealCard(players[player]);
                }
            }

            for (int index = 0; index< players.length ;index++){
                players[index].printHand();
            }
            System.out.println("----------------- Initial hand is dealt -------------------");

            for (int index = 0; index< players.length ;index++){
                double rand = Math.random();
                if (rand<0.5){
                    players[index].stayPass();
                }else{
                    players[index].askForCards((int)(Math.random()*3+1));
                }
            }

            for (int index = 0; index< players.length ;index++){
                players[index].printHand();
            }

        }



}



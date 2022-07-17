package playlist;

import java.util.*;

public class Main {

    public static void main(String[] args) {
        LinkedList<Song> playlistOne = new LinkedList<Song>();

        ArrayList<Album> albums = new ArrayList<>();

        Album album = new Album("Stormbringer");
        album.addSong("Stormbringer", 4.6);
        album.addSong("Love don't mean a thing", 4.22);
        album.addSong("Holy man", 4.3);
        album.addSong("Hold on", 5.6);
        album.addSong("Lady double dealer", 3.21);
        album.addSong("You can't do it right", 6.23);
        album.addSong("High ball shooter", 4.27);
        album.addSong("The gypsy", 4.2);
        album.addSong("Soldier of fortune", 3.13);
        albums.add(album);

        album = new Album("For those about to rock");
        album.addSong("For those about to rock", 5.44);
        album.addSong("I put the finger on you", 3.25);
        album.addSong("Lets go", 3.45);
        album.addSong("Inject the venom", 3.33);
        album.addSong("Snowballed", 4.51);
        album.addSong("Evil walks", 3.45);
        album.addSong("C.O.D.", 5.25);
        album.addSong("Breaking the rules", 5.32);
        album.addSong("Night of the long knives", 5.12);
        albums.add(album);


        albums.get(0).addToPlayList("You can't do it right", playlistOne);
        albums.get(0).addToPlayList("Holy man", playlistOne);
        albums.get(0).addToPlayList("Speed king", playlistOne);
        albums.get(0).addToPlayList(9, playlistOne);
        albums.get(1).addToPlayList(3, playlistOne);
        albums.get(1).addToPlayList(2, playlistOne);
        albums.get(1).addToPlayList(24, playlistOne);

        printList(playlistOne);
        menu(playlistOne);

    }

    private static void printList(LinkedList<Song> linkedList){
        Iterator<Song> i = linkedList.iterator();
        System.out.println("Song in the playlist");
        while(i.hasNext()){
            System.out.println(i.next());
        }
        System.out.println("=============================");
    }

   private static void menu(LinkedList<Song> playlist) {
       Scanner scanner = new Scanner(System.in);
       boolean quit = false;
       boolean goingForward = true;
       ListIterator<Song> playListIterator = playlist.listIterator();

       if (playlist.isEmpty()) {
           System.out.println("No songs in the itenerary");
           return;
       } else {
           System.out.println("Now playing " + playListIterator.next());
           printMenu();
       }

       while (!quit) {
           int action = scanner.nextInt();
           scanner.nextLine();
           switch (action) {
               case 0:
                   System.out.println("PLaylist closed");
                   quit = true;
                   break;

               case 1:
                   if (!goingForward) {
                       if (playListIterator.hasNext()) {
                           playListIterator.next();
                       }
                       goingForward = true;
                   }
                   if (playListIterator.hasNext() && playListIterator.hasPrevious()) {
                       System.out.println("Now playing " + playListIterator.next());
                   } else if(playListIterator.hasPrevious() && !playListIterator.hasNext()){
                       System.out.println("Reached the end of the PLaylist");
                       goingForward = false;
                   }else{
                       playListIterator.next();
                       System.out.println("Now playing " + playListIterator.next());
                   }
                   break;

               case 2:
                   if (goingForward) {
                       if (playListIterator.hasPrevious()) {
                           playListIterator.previous();
                       }
                       goingForward = false;
                   }

                   if (playListIterator.hasPrevious() && playListIterator.hasNext()) {
                       System.out.println("Now playing " + playListIterator.previous());
                   } else if(playListIterator.hasNext() && !playListIterator.hasPrevious()){
                       System.out.println("We are at the start of the Playlist");
                       goingForward = true;
                   }else{
                       playListIterator.previous();
                       System.out.println("Now playing " + playListIterator.previous());
                   }
                   break;

               case 3:
                   if (goingForward) {
                       if (playListIterator.hasPrevious()) {
                           System.out.println("Now playing " + playListIterator.previous());
                           playListIterator.next();
                       }else{
                           System.out.println("Now playing " + playListIterator.next());
                           playListIterator.previous();
                       }

                   }
                   if (!goingForward) {
                       if (playListIterator.hasNext()) {
                           System.out.println("Now playing " + playListIterator.next());
                           playListIterator.previous();
                       }else{
                           System.out.println("Now playing " + playListIterator.previous());
                           playListIterator.next();
                       }
                   }
                   break;
               case 4:
                   printMenu();
                   break;
               case 5:
                   printList(playlist);
                   break;
               case 6:
                   if(playlist.size() >0) {
                       playListIterator.remove();
                       if(playListIterator.hasNext()) {
                           System.out.println("Now playing " + playListIterator.next());
                       } else if(playListIterator.hasPrevious()) {
                           System.out.println("Now playing " + playListIterator.previous());
                       }
                   }
                   break;
           }
       }
   }

    private static void printMenu(){
        System.out.println("Available actions:\npress ");
        System.out.println("0 - to quit\n" +
                "1 - Next song\n" +
                "2 - Previous song\n" +
                "3 - Replay\n" +
                "4 - print menu options\n" +
                "5 - print list of songs\n");
    }

}

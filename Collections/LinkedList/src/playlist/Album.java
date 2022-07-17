package playlist;

import java.util.ArrayList;
import java.util.LinkedList;

public class Album {
    private String name;
    private ArrayList<Song> songs;

    public Album(String name) {
        this.name = name;
        this.songs = new ArrayList<Song>();
    }

    private Song findSong(String title){
        for (Song checkedSong: this.songs) {
            if (checkedSong.getTitle().equals(title)) {
                return checkedSong;
            }
        }
        return null;
    }

    public boolean addSong(String title, double duration){
        if (findSong(title) == null) {
            this.songs.add(new Song(title, duration));
            System.out.println("New song " + title + " duration: " + duration);
            return true;
        }
        System.out.println("Contact is already on file");
        return false;

    }

    public  boolean addToPlayList(int trackNumber, LinkedList linkedList){
        if(trackNumber > 0 && trackNumber <= this.songs.size()){
            linkedList.add(this.songs.get(trackNumber - 1));
            return true;
        }else{
            System.out.println("The album does not have: " + trackNumber);
        }
        return false;
    }

    public  boolean addToPlayList(String trackName, LinkedList linkedList){
        Song chekcedSong = findSong(trackName);
        if(chekcedSong != null){
            linkedList.add(findSong(trackName));
            return true;
        }
        System.out.println("There is no track: " + trackName);
        return false;
    }
}

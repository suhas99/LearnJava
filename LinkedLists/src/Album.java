import java.util.ArrayList;
import java.util.LinkedList;

public class Album {
    String name;
    String artist;
    private ArrayList<Song> songs;

    public Album(String name, String artist) {
        this.name = name;
        this.artist = artist;
        this.songs =new ArrayList<Song>();

    }

    public boolean addSong(String title, double duration){
        if(findSong(title)==null){
            this.songs.add(new Song(title,duration));
            return true;
        }
        return false;
    }

    private Song findSong(String title) {
        for (Song song : this.songs) {
            if(song.getTitle().equals(title)){
                return song;
            }
            
        }
        return null;
    }

//
//    public boolean addToPlayList(int trackNumber, LinkedList<Song> playlist){
//       int index =trackNumber-1;
//       if(index>0 && index<=this.songs.size()){
//
//       }
//    }
}

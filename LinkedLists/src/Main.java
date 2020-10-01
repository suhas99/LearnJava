import java.util.ArrayList;
import java.util.LinkedList;
import java.util.ListIterator;


public class Main {

    private static ArrayList<Album> albums=new ArrayList<Album>();

    public static void main(String[] args) {
        Album album =new Album("Kannada breakup Album","Mixed breakup singers");
        album.addSong("kagadada Doniayalli",3.5);
        album.addSong("Bisilu kudre",3);
        album.addSong("Marate hogide hrta karana",4);
        albums.add(album);

        album =new Album("Kannada Love Album","Vijay prakash");
        album.addSong("Belgageduu",3.37);
        album.addSong("Love you jaanu",4.22);
        album.addSong("Its time for mohabat",3.40);
        albums.add(album);


        LinkedList<Song> playlist =new LinkedList<Song>();
        albums.get(0).addToPlayList("Bisilu kudre",playlist);
        albums.get(1).addToPlayList("Love you jaanu",playlist);
        albums.get(0).addToPlayList(1,playlist);


    play(playlist);



    }


    private static void play(LinkedList<Song> playlist ){
        ListIterator<Song> node =playlist.listIterator();

        if(playlist.size()==0){
            System.out.println("no songs in playlist");
            return;
        }
        else{
            System.out.println("now playing "+node.next().toString());
        }

    }

}

import java.util.LinkedList;

public class Song {
    private String title;
    private double duration;

    public String getTitle() {
        return title;
    }

    public Song(String title, double duration) {
        this.title = title;
        this.duration = duration;
    }

    @Override
    public String toString() {
        return this.title+" : "+this.duration;
    }
}

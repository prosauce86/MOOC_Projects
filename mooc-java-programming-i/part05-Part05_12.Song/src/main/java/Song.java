
public class Song {

    private String artist;
    private String name;
    private int durationInSeconds;

    public Song(String artist, String name, int durationInSeconds) {
        this.artist = artist;
        this.name = name;
        this.durationInSeconds = durationInSeconds;
    }

    @Override
    public String toString() {
        return this.artist + ": " + this.name + " (" + this.durationInSeconds + " s)";
    }

    @Override
    public boolean equals(Object compared) {
        if (this == compared) return true; // compares if objects have same memory location

        if (!(compared instanceof Song)) return false; // checks if compared var is of type Song

        Song comparedSong = (Song) compared; // Since generic object passed as method param, cast as Song object

        // Compare object variables
        // statement below will return true or false
        return artist.equals(comparedSong.artist) &&
                name.equals(comparedSong.name) &&
                durationInSeconds == comparedSong.durationInSeconds;
    }


}
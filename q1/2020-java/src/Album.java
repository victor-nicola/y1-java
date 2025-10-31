import java.util.ArrayList;

public class Album {
    private String name;
    private String artist;
    private int year;
    private ArrayList<String> writers;
    private ArrayList<Song> songs;

    /**
     * Default class constructor - initializes fields with default values
     */
    Album() {
        this.name = "";
        this.artist = "";
        this.year = -1;
        this.writers = new ArrayList<>();
        this.songs = new ArrayList<>();
    }

    /**
     * Sets the album name
     * @param name - name of the album of the type String
     */
    public void setName(String name) {
        this.name = name;
    }

    /**
     * Sets the artist
     * @param artist - name of the artist of the type String
     */
    public void setArtist(String artist) {
        this.artist = artist;
    }

    /**
     * Sets the year the album was launched in
     * @param year - year the album was launched in of the type int
     */
    public void setYear(int year) {
        this.year = year;
    }

    /**
     * Adds a writer to the list of writers
     * @param writer - name of a contributing writer of the type String
     */
    public void addWriter(String writer) {
        this.writers.add(writer);
    }

    /**
     * Adds a song to the album
     * @param song - song in the album of the type Song
     */
    public void addSong(Song song) {
        this.songs.add(song);
    }

    /**
     * Gets the album name
     * @return String of the name of the album
     */
    public String getName() {
        return name;
    }

    /**
     * Gets the artist name
     * @return String of the name of the artist
     */
    public String getArtist() {
        return artist;
    }

    /**
     * Gets the album year
     * @return int of the year of the album
     */
    public int getYear() {
        return year;
    }

    /**
     * Gets the list of writers
     * @return ArrayList of Strings of writer names
     */
    public ArrayList<String> getWriters() {
        return writers;
    }

    /**
     * Gets the list of songs
     * @return ArrayList of Songs in the album
     */
    public ArrayList<Song> getSongs() {
        return songs;
    }

    /**
     * Puts the Album data in a nice looking String
     * @return String containing album data in a nice format
     */
    @Override
    public String toString() {
        String s = "Album: " + this.getArtist() + "\'s " + this.getName() + " (" + this.getYear() + ")\n" + "Artists:";
        for (int i = 0; i < this.getWriters().size() - 2; i++) {
            s += " " + this.getWriters().get(i) + ",";
        }
        s += " " + this.getWriters().get(this.getWriters().size() - 2);
        if (this.getWriters().size() >= 2) {
            s += " & " + this.getWriters().get(this.getWriters().size() - 1) + "\n";
        }
        for (Song song : this.getSongs()) {
            s += "\t" + song.toString() + "\n";
        }
        return s.substring(0, s.length() - 1);
    }
}

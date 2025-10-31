public class Song {
    private String name;
    private int posAlbum;
    private int durationSec;

    /**
     * Default class constructor - initializes fields with default values
     */
    Song() {
        this.name = "";
        this.posAlbum = 0;
        this.durationSec = 0;
    }

    /**
     * Sets the name of the song
     * @param name - name of the song
     */
    public void setName(String name) {
        this.name = name;
    }

    /**
     * Sets the album position of the song
     * @param posAlbum - position of the song in the album
     */
    public void setPosAlbum(int posAlbum) {
        this.posAlbum = posAlbum;
    }

    /**
     * Sets the duration of the song in seconds
     * @param durationSec - duration of the song in seconds
     */
    public void setDurationSec(int durationSec) {
        this.durationSec = durationSec;
    }

    /**
     * Gets the name of the song
     * @return name of the song
     */
    public String getName() {
        return name;
    }

    /**
     * Gets the album position of the song
     * @return position of the song in the album
     */
    public int getPosAlbum() {
        return posAlbum;
    }

    /**
     * Gets the duration of the song in seconds
     * @return duration of the song in seconds
     */
    public int getDurationSec() {
        return durationSec;
    }

    /**
     * Puts the Song data in a nice looking String
     * @return String containing song data in a nice format
     */
    @Override
    public String toString() {
        return "Track " + this.getPosAlbum() + ": " + this.getName() + " (" + this.getDurationSec() / 60 + ":" + this.getDurationSec() % 60 + ")";
    }
}

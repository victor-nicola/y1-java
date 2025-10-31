import java.io.File;
import java.io.FileNotFoundException;
import java.util.ArrayList;
import java.util.Scanner;

public class Main {
    /**
     * Main function
     * @param args - command line arguments
     */
    public static void main(String[] args) {
        // load data
        ArrayList<Album> albums = new ArrayList<>();
        ArrayList<Ad> ads = new ArrayList<>();
        try {
            File file = new File("../deezer.txt");
            Scanner scanner = new Scanner(file);

            scanner.nextLine(); // skip ALBUMS line
            albums = loadAlbums(scanner);
            ads = loadAds(scanner);

            scanner.close();
        } catch (FileNotFoundException e) {
            System.out.println("File not found: ../deezer.txt");
        }

        // handle user input
        Scanner console = new Scanner(System.in);
        while (true) {
            String line = console.nextLine();
            if (line.equals("7")) {
                break;
            }
            if (line.equals("1")) {
                printAlbums(albums);
            } else if (line.equals("2")) {
                // add new ad
            } else if (line.equals("3")) {
                // enable shuffling of songs
            } else if (line.equals("4")) {
                // add song to the front of the playlist
            }  else if (line.equals("5")) {
                // write to file
            }  else if (line.equals("6")) {
                // calculate commercial value
            }
        }
    }

    private static void addAd() {

    }

    /**
     * Function that prints an array of albums in an easy to read format
     * @param albums - ArrayList of type Album that contains the albums that we want to print
     */
    private static void printAlbums(ArrayList<Album> albums) {
        for (Album album : albums) {
            System.out.println(album.toString());
        }
    }

    /**
     * Function that loads the albums from the scanner into the specified array
     * @param scanner - scanner to read from
     * @return ArrayList of Album in which to store albums
     * */
    private static ArrayList<Album> loadAlbums(Scanner scanner) {
        String line = scanner.nextLine(); // get album name, artist and year
        String[] splitLine = line.split(";");
        ArrayList<Album> albums = new ArrayList<>();
        do {
            Album album = new Album();
            album.setArtist(splitLine[0].substring(6));
            album.setName(splitLine[1].substring(1));
            album.setYear(Integer.parseInt(splitLine[2].substring(1)));

            line = scanner.nextLine(); // get album writers
            splitLine = line.split(";");
            album.addWriter(splitLine[0].substring(8));
            for (int i = 1; i < splitLine.length; i++) {
                album.addWriter(splitLine[i].substring(1));
            }

            // add songs
            while (scanner.hasNextLine()) {
                line = scanner.nextLine();
                splitLine = line.split(";");
                Song song = new Song();
                song.setPosAlbum(Integer.parseInt(splitLine[0].substring(6)));
                song.setName(splitLine[1].substring(1));
                song.setDurationSec(getSeconds(splitLine[2]));
                album.addSong(song);
            }

            albums.add(album);

            if (line.equals("ADS"))
                break;
        } while (scanner.hasNextLine());
        return albums;
    }

    private static ArrayList<Ad> loadAds(Scanner scanner) {
        ArrayList<Ad> ads = new ArrayList<>();
        while (scanner.hasNextLine()) {
            String line = scanner.nextLine(); // get ad
            String[] splitLine = line.split(";");
            Ad ad = new Ad();

            ad.setBusiness(splitLine[0].substring(3));
            ad.setDurationSec(getSeconds(splitLine[1]));
            ad.setValue(Float.parseFloat(splitLine[2].substring(1,  splitLine[2].length() - 6)));

            ads.add(ad);

            if (line.equals("ADS"))
                break;
        }
        return ads;
    }

    /**
     * Converts a time string in seconds
     * @param str - String of the format ' mm:ss' representing the time in minutes and seconds
     * @return duration in seconds of the time
     */
    private static int getSeconds(String str) {
        String[] durationString = str.substring(1).split(":");
        int mins = Integer.parseInt(durationString[0]);
        int secs = Integer.parseInt(durationString[1]);
        return mins * 60 + secs;
    }
}

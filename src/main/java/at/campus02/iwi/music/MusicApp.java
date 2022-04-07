package at.campus02.iwi.music;

public class MusicApp {
    public static void main(String[] args) {
        Album  a1 = new Album();
        a1.nrSongs = 20;
        a1.shortestSong = 120.02;
        a1.shortestSong = 230.03;

        double erg= a1.averageSongLength();
        System.out.println(erg);

        double length = a1.totalLength();
        System.out.println(length);

        System.out.println(a1.fitsOnMedium(50));

    }
}

package at.campus02.iwi.music;

public class Album {
    public int nrSongs;
    public double shortestSong;
    public double longestSong;

    public double averageSongLength(){
        return((shortestSong+longestSong)/2);
    }

    public double totalLength(){
        return averageSongLength()*nrSongs;
    }

    public boolean fitsOnMedium(int minutes){
        double total= totalLength();
        double totalSeconds= (double) minutes*60;
        if(total<=totalSeconds){
            return true;
        }return false;
    }
}

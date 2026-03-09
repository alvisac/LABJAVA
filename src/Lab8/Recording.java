package Lab8;

public class Recording {

    private String title;
    private String artist;
    private int playingTime;

    public Recording(){}

    public void setTitle(String title){
        this.title = title;
    }

    public String getTitle(){
        return title;
    }

    public void setArtist(String artist){
        this.artist = artist;
    }

    public String getArtist(){
        return artist;
    }

    public void setPlayingTime(int playingTime){
        this.playingTime = playingTime;
    }

    public int getPlayingTime(){
        return playingTime;
    }
}
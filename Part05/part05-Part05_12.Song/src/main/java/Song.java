
public class Song {

    private String artist;
    private String name;
    private int durationInSeconds;

    public Song(String artist, String name, int durationInSeconds) {
        this.artist = artist;
        this.name = name;
        this.durationInSeconds = durationInSeconds;
    }
    public String getArtist(){
        return this.artist;
    }
    public String getName(){
        return this.name;
    }
    public int getDurationInSeconds(){
        return this.durationInSeconds;
    }
    
    public boolean equals(Object compared){
        if (this == compared){
            return true;
        }
        if (!(compared instanceof Song)){
            return false;
    }
        Song other = (Song) compared;
        String songArtist = other.getArtist();
        String songName = other.getName();
        int songDuration = other.getDurationInSeconds();
        if (this.artist.equals(songArtist) && this.name.equals(songName) && this.durationInSeconds == songDuration){
            return true;
        }
        return false;
    }   
    @Override
    public String toString() {
        return this.artist + ": " + this.name + " (" + this.durationInSeconds + " s)";
    }


}

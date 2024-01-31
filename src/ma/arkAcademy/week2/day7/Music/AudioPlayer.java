package Day7.Music;

public abstract class AudioPlayer implements Playable {
    private int volumeConrol;
    public AudioPlayer(int volumeCovnrol){
        this.volumeConrol=volumeConrol;
    }

    public void setVolumeConrol(int volumeConrol) {
        this.volumeConrol = volumeConrol;
    }
}
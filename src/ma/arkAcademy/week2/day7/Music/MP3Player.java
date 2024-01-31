package Day7.Music;

public  class MP3Player extends AudioPlayer {
    private String Song;

    public MP3Player(int volumeConrol,String Song) {
        super(volumeConrol);
        this.Song=Song;
    }

    @Override
    public void play() {
        System.out.println("playing audio");

    }

    @Override
    public void pause() {
        System.out.println("pause audio");

    }

    @Override
    public void stop() {
        System.out.println("stop audio");

    }

    @Override
    public String toString() {
        return "Song='" + Song + '\'' +
                '}';
    }
}
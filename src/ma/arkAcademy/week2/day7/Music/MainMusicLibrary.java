package ma.arkAcademy.week2.day7.Music;

public class MainMusicLibrary {
    public static void main(String[] args) {
        MusicLibrary musicLibrary=new MusicLibrary();
        MP3Player mp3Player=new MP3Player(15,"hello");
        CDPlayer cdPlayer=new CDPlayer(22);
        musicLibrary.addaudiotoplaylist(mp3Player);
        musicLibrary.play(0);
        musicLibrary.pause(0);
        musicLibrary.stop(0);

    }

    }


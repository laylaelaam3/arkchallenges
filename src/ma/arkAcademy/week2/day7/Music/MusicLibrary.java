package ma.arkAcademy.week2.day7.Music;

import java.util.ArrayList;

public class MusicLibrary {
    private ArrayList<AudioPlayer> audiotracks = new ArrayList<>();

    public void addaudiotoplaylist(AudioPlayer audioPlayer) {
        audiotracks.add(audioPlayer);
        System.out.println("this audio have been added");
    }

    public void play(int index) {
        audiotracks.get(index).play();
        System.out.println("this songs is played : " +audiotracks.get(index));
    }

    public void stop(int index) {
        audiotracks.get(index).stop();
        System.out.println("this songs is stoped");
    }

    public void pause(int index) {
        audiotracks.get(index).pause();
        System.out.println("this songs is paused");

    }

}
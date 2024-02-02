package ma.arkAcademy.week2.InterfaceAbstraction.Music;

public class CDPlayer extends AudioPlayer {

    public CDPlayer(int volumeConrol) {
        super(volumeConrol);
    }

    @Override




    public void play() {
        System.out.println("playing video");

    }

    @Override
    public void pause() {
        System.out.println("pause video");

    }

    @Override
    public void stop() {
        System.out.println("stop video");

    }
}

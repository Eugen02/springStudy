package ru.zhogolev.firstspring;


public class MusicPlayer {
 Music music;
    //IoC
    public MusicPlayer(Music music) {
        this.music=music;
    }
    public MusicPlayer() {}

    public void playMusic(){
            System.out.println("Music Play = " + music.getSong());
    }

}

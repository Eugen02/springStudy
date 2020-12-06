package ru.zhogolev.firstspring;

public class MusicPlayer {
    private Music music;
    private String name;
    private int volume;

    //IoC
    public MusicPlayer(Music music) {
        this.music = music;
    }

    public MusicPlayer() {}

    public void setMusic(Music music) {
        this.music = music;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void setVolume(int volume) {
        this.volume = volume;
    }

    public void playMusic(){
        System.out.println("Playing: " + music.getSong());
    }

    @Override
    public String toString() {
        return "MusicPlayer{" +
                "music=" + music +
                ", name='" + name + '\'' +
                ", volume=" + volume +
                '}';
    }
}

package ru.zhogolev.firstspring;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class MusicPlayer {
     List<Music> musicList = new ArrayList<>();
    private String name;
    private int volume;

    //IoC
    public MusicPlayer(Music musicList, Music musicList1, Music musicList2) {
        this.musicList.add(musicList);
        this.musicList.add(musicList1);
        this.musicList.add(musicList2);
    }

    public MusicPlayer() {}


    public void setMusicList(List<Music> musicList) {
        this.musicList = musicList;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void setVolume(int volume) {
        this.volume = volume;
    }

    public void playMusic(){
        for (Music music: musicList
             ) {
            System.out.println("Music Play = " + music.getSong());
        }
    }

    @Override
    public String toString() {
        return "MusicPlayer{" +
                ", name='" + name + '\'' +
                ", volume=" + volume +
                '}';
   }
//    private Music music;
//    private String name;
//    private int volume;
//
//    //IoC
//    public MusicPlayer(Music music) {
//        this.music = music;
//    }
//
//    public MusicPlayer() {}
//
//    public void setMusic(Music music) {
//        this.music = music;
//    }
//
//    public void setName(String name) {
//        this.name = name;
//    }
//
//    public void setVolume(int volume) {
//        this.volume = volume;
//    }
//
//    public void playMusic(){
//        System.out.println("Playing: " + music.getSong());
//    }
//
//    @Override
//    public String toString() {
//        return "MusicPlayer{" +
//                "music=" + music +
//                ", name='" + name + '\'' +
//                ", volume=" + volume +
//                '}';
//    }
}

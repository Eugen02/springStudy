package ru.zhogolev.firstspring;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Component;

import java.security.SecureRandom;
import java.util.ArrayList;
import java.util.List;
import java.util.Random;

public class MusicPlayer {
//    private ClassicalMusic classicalMusic;
//    //IoC
//    @Autowired                                                             /AW FROM CONSTRUCTOR
//    public MusicPlayer(ClassicalMusic classicalMusic) {
//        this.classicalMusic=classicalMusic;
//    }

//    private Music music;
//
//    //IoC                                                                    AW FROM SETTER
//    public MusicPlayer(Music music) {
//        this.music = music;
//    }
//
//    @Autowired
//    public void setMusic(Music music) {
//        this.music = music;
//    }
//
//    @Autowired                            AW FROM PARR
//    Music music;
//
//
//    @Autowired
//    @Qualifier("classicalMusic")
//    Music music;

    private Music music1;
    private Music music2;

    public MusicPlayer(@Qualifier("classicalMusic") Music music1, @Qualifier("rockMusic") Music music2) {
        this.music1 = music1;
        this.music2 = music2;
    }

    public MusicPlayer(List<Music> musicList) {
        this.musicList = musicList;
    }

    public List<Music> musicList = new ArrayList<>();




    public String playMusic() {
        Random random = new SecureRandom();
        return musicList.get(random.nextInt(musicList.size())).getSong();
    }

}

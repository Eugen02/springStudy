package ru.zhogolev.firstspring;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Component;

@Component
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

    @Autowired
    public MusicPlayer(@Qualifier("classicalMusic") Music music1, @Qualifier("rockMusic") Music music2) {
        this.music1 = music1;
        this.music2 = music2;
    }

    public MusicPlayer() {
    }

    public String playMusic(Ganr enums) {
        if (Ganr.CLASSICAL == enums) {
            return String.valueOf(music1.getSong());
        }

        if (Ganr.ROCK == enums) {
            return String.valueOf(music2.getSong());
        }

        return "It's can't be";
    }

}

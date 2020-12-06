package ru.zhogolev.firstspring;

import org.springframework.beans.factory.annotation.Autowired;
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

    ClassicalMusic classicalMusic;
    RockMusic rockMusic;
    @Autowired
    public MusicPlayer(ClassicalMusic classicalMusic, RockMusic rockMusic) {
        this.classicalMusic = classicalMusic;
        this.rockMusic = rockMusic;
    }

    public MusicPlayer() {
    }

    public String playMusic() {
        StringBuilder sb = new StringBuilder();
        sb.append("Music Play = ").append(classicalMusic.getSong())
                .append(System.lineSeparator())
                .append("Music Play = ").append(rockMusic.getSong());
      return sb.toString();
    }

}

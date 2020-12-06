package ru.zhogolev.firstspring;

import org.springframework.context.support.ClassPathXmlApplicationContext;

public class TestSpring {
    public static void main(String[] args) {
        ClassPathXmlApplicationContext context = new ClassPathXmlApplicationContext(
                "applicationContext.xml"
        );

        ClassicalMusic classicalMusic = context.getBean("musicBean", ClassicalMusic.class);
        System.out.println(classicalMusic.getSong());

        //  Music testBean = context.getBean("musicBean",Music.class);
        //  MusicPlayer musicPlayer = new MusicPlayer(testBean);
//
//        MusicPlayer musicPlayer = context.getBean("musicPlayer", MusicPlayer.class);
//
//        musicPlayer.playMusic();
//        System.out.println(musicPlayer.toString());
        context.close();
    }
}

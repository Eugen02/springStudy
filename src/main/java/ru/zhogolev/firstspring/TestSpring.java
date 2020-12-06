package ru.zhogolev.firstspring;

import org.springframework.context.support.ClassPathXmlApplicationContext;

public class TestSpring {
    public static void main(String[] args) {
        ClassPathXmlApplicationContext context = new ClassPathXmlApplicationContext(
                "applicationContext.xml"
        );


        MusicPlayer musicPlayer = context.getBean("musicPlayer", MusicPlayer.class);
        musicPlayer.playMusic();


//          Music testBean = context.getBean("someRockMusic",Music.class);
//          MusicPlayer musicPlayer = new MusicPlayer(testBean);
//        musicPlayer.playMusic();
        context.close();
    }
}

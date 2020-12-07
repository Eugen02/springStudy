package ru.zhogolev.firstspring;

import org.springframework.context.annotation.AnnotationConfigApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class TestSpring {
    public static void main(String[] args) {
        AnnotationConfigApplicationContext context = new AnnotationConfigApplicationContext(
                SpringConfig.class
        );


//        MusicPlayer musicPlayer = context.getBean("musicPlayer", MusicPlayer.class);
   //     System.out.println(musicPlayer.playMusic(Ganr.ROCK));


//          Music testBean = context.getBean("someRockMusic",Music.class);
//          MusicPlayer musicPlayer = new MusicPlayer(testBean);
//        musicPlayer.playMusic();
        Computer computer = context.getBean("computer",Computer.class);
        System.out.println(computer.toString());
        context.close();
    }
}

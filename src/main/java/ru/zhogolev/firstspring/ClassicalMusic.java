package ru.zhogolev.firstspring;

import org.springframework.stereotype.Component;

import java.util.ArrayList;
import java.util.List;

@Component
public class ClassicalMusic implements Music {
    List<String> musicList = new ArrayList<>();

    int random1(){
        return (int) (Math.random()*musicList.size());
    }

    @Override
    public String getSong() {
        musicList.add("firstClassicalMusic");
        musicList.add("secondClassicalMusic");
        musicList.add("thirdClassicalMusic");
        return musicList.get(random1());
    }
}

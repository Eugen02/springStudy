package ru.zhogolev.firstspring;


import org.springframework.stereotype.Component;

import java.util.ArrayList;
import java.util.List;

@Component
public class RockMusic implements Music {

    List<String> musicList = new ArrayList<>();
    int random1(){
        return (int) (Math.random()*musicList.size());
    }
    @Override
    public String getSong() {
        musicList.add("firstRockMusic");
        musicList.add("secondRockMusic");
        musicList.add("thirdRockMusic");
        return musicList.get(random1());
    }}

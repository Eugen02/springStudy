package ru.zhogolev.firstspring;

import java.util.ArrayList;
import java.util.List;

public class LofiMusic implements Music {

    List<String> musicList = new ArrayList<>();
    int random1(){
        return (int) (Math.random()*musicList.size());
    }
    @Override
    public String getSong() {
        musicList.add("firstLofiMusic");
        musicList.add("secondLofiMusic");
        musicList.add("thirdLofiMusic");
        return musicList.get(random1());
    }
}

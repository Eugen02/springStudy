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
        return "Lofi MUSIC";
    }
}

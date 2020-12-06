package ru.zhogolev.firstspring;


import org.springframework.stereotype.Component;

@Component("someRockMusic")
public class RockMusic implements Music {
    @Override
    public String getSong() {
        return "Ramstain";
    }
}

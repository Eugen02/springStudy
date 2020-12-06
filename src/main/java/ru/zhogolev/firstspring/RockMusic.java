package ru.zhogolev.firstspring;


import org.springframework.stereotype.Component;

@Component
public class RockMusic implements Music {
    @Override
    public String getSong() {
        return "Ramstain";
    }
}

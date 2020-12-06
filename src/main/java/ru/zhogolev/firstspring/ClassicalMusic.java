package ru.zhogolev.firstspring;

import org.springframework.stereotype.Component;

@Component
public class ClassicalMusic implements Music {
    @Override
    public String getSong() {
        return "Hungurian repsodi";
    }
}

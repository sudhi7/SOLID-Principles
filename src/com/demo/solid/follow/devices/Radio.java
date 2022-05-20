package com.demo.solid.follow.devices;

import com.demo.solid.follow.features.MusicFeature;

public class Radio implements MusicFeature {
    String power;
    String batteryLife;

    public Radio(String power, String batteryLife) {
        this.power = power;
        this.batteryLife = batteryLife;
    }

    @Override
    public void playMusic() {
        System.out.println("Playing music in radio");
    }
}

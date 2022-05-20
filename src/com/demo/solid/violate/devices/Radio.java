package com.demo.solid.violate.devices;

import com.demo.solid.violate.Features;

public class Radio implements Features {

    String power;
    String batteryLife;

    public Radio(String power, String batteryLife) {
        this.power = power;
        this.batteryLife = batteryLife;
    }

    @Override
    public String writeMessage() {
        throw new RuntimeException("Radio cannot write messages");
    }

    @Override
    public void call() {
        throw new RuntimeException("Radio cannot call");
    }

    @Override
    public void sendMessage(String message) {
        throw new RuntimeException("Radio cannot send messages");
    }

    @Override
    public void playMusic() {
        System.out.println("Playing music in radio");
    }

    @Override
    public void playGames() {
        throw new RuntimeException("Radio cannot play games");
    }

    @Override
    public void capturePhoto() {
        throw new RuntimeException("Cannot capture photos");
    }

    @Override
    public void shareImages() {
        throw new RuntimeException("Cannot share images");
    }
}

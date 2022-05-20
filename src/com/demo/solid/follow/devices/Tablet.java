package com.demo.solid.follow.devices;

import com.demo.solid.follow.features.*;

import java.util.Scanner;

public class Tablet implements GamingFeature, SharingFeature, MusicFeature, PhotoFeature, MessageFeature, CallFeature {

    protected String ram;
    protected String rom;
    protected String batteryLife;
    protected String camera;
    protected String bluetooth;

    public Tablet(String ram, String rom, String batteryLife, String camera, String bluetooth) {
        this.ram = ram;
        this.rom = rom;
        this.batteryLife = batteryLife;
        this.camera = camera;
        this.bluetooth = bluetooth;
    }

    @Override
    public void playGames() {
        System.out.println("Playing games in tablet...");
    }

    @Override
    public void shareImages() {
        System.out.println("Sharing images via bluetooth..");
    }

    @Override
    public void playMusic() {
        System.out.println("Playing music in phone...");
    }

    @Override
    public void capturePhoto() {
        System.out.println("Photo captured!!");
    }

    public void call() {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter contact number to call");
        String contactNo = sc.nextLine();
        System.out.println("Call number through facebook");
    }

    @Override
    public String writeMessage() {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter your message");
        return sc.nextLine();
    }

    @Override
    public void sendMessage(String message) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter recipient's contact number");
        String mobileNo = sc.nextLine();
        System.out.println("Send message through facebook");
    }
}

package com.demo.solid.violate.devices;

import java.util.Scanner;

public class Tablet{

    protected String ram;
    protected String rom;
    protected String batteryLife;
    protected String camera;
    protected String bluetooth;
    String mouse;
    String keyboard;

    public Tablet(String ram, String rom, String batteryLife, String camera, String bluetooth) {
        this.ram = ram;
        this.rom = rom;
        this.batteryLife = batteryLife;
        this.camera = camera;
        this.bluetooth = bluetooth;
    }

    public void connectMouse(String mouse) {
        this.mouse = mouse;
    }

    public void connectKeyboard(String keyboard) {
        this.keyboard = keyboard;
    }

    public void playMusic() {
        System.out.println("Tablet is playing Music");
    }

    public void playGames() {
        System.out.println("Playing games in Tablet");
    }

    public String writeMessage() {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter your message");
        return sc.nextLine();
    }

    public void capturePhoto() {
        System.out.println("Captured Photo!!");
    }

    public void shareImages() {
        System.out.println("Sharing images!!");
    }

}

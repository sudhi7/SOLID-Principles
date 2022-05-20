package com.demo.solid.violate.devices;


import com.demo.solid.violate.Features;
import com.demo.solid.violate.JioNetwork;

import java.util.*;

public class Phone implements Features {
    protected String ram;
    protected String rom;
    protected String batteryLife;
    protected JioNetwork network;
    protected String camera;
    protected String bluetooth;

    public Phone(String ram, String rom, String batteryLife) {
        this.ram = ram;
        this.rom = rom;
        this.batteryLife = batteryLife;
    }

    public Phone(String ram, String rom, String batteryLife, String camera) {
        this(ram,rom,batteryLife);
        this.camera = camera;
    }

    public Phone(String ram, String rom, String batteryLife, String camera, String bluetooth) {
        this(ram,rom,batteryLife,camera);
        this.bluetooth = bluetooth;
    }

    public void addNetwork(String mobileNumber) {
        this.network = new JioNetwork(mobileNumber);
    }

    public String writeMessage() {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter your message");
        return sc.nextLine();
    }


    public void sendMessage(String message) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter recipient's contact number");
        String mobileNo = sc.nextLine();
        if(network != null)
            System.out.println("Message sent to " + mobileNo + " successfully!!!");
        else
            throw new RuntimeException("Cannot send message !!");
    }


    public void call() {

        Scanner sc = new Scanner(System.in);
        System.out.println("Enter contact number to call");
        String contactNo = sc.nextLine();
        System.out.println("Calling" + "... " + contactNo);
    }

    public void playMusic() {
        System.out.println("Music is playing...");
    }

    public void playGames() {
        System.out.println("Playing games...");
    }

    @Override
    public void capturePhoto() {
        System.out.println("Captured Photo!!");
    }

    @Override
    public void shareImages() {
        System.out.println("Sharing images!!");
    }
}

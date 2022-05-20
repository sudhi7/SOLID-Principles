package com.demo.solid.follow.devices;

import com.demo.solid.follow.Network;
import com.demo.solid.follow.features.CallFeature;
import com.demo.solid.follow.features.GamingFeature;
import com.demo.solid.follow.features.MessageFeature;
import com.demo.solid.follow.features.MusicFeature;

import java.util.Scanner;

public class Phone implements GamingFeature, MusicFeature, MessageFeature, CallFeature {
    protected String ram;
    protected String rom;
    protected String batteryLife;
    protected Network network;

    public Phone(String ram, String rom, String batteryLife) {
        this.ram = ram;
        this.rom = rom;
        this.batteryLife = batteryLife;
    }

    @Override
    public void playGames() {
        System.out.println("Playing games in phone...");
    }

    @Override
    public void playMusic() {
        System.out.println("Playing music in phone...");
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
        network.sendMessageToNumber(mobileNo, message);
    }

    @Override
    public void call() {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter contact number to call");
        String contactNo = sc.nextLine();
        network.callNumber(contactNo);
    }

    public void addNetwork(Network network) {
        this.network = network;
    }

}

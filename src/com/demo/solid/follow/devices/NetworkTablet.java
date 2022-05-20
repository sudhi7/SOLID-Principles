package com.demo.solid.follow.devices;

import com.demo.solid.follow.Network;
import com.demo.solid.follow.features.CallFeature;
import com.demo.solid.follow.features.MessageFeature;

import java.util.Scanner;

public class NetworkTablet extends Tablet implements CallFeature, MessageFeature {

    protected Network network;

    public NetworkTablet(String ram, String rom, String batteryLife, String camera, String bluetooth, Network network) {
        super(ram, rom, batteryLife, camera, bluetooth);
        this.network = network;
    }

    public void call() {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter contact number to call");
        String contactNo = sc.nextLine();
        network.callNumber(contactNo);
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

}

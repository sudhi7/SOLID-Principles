package com.demo.solid.violate.devices;

import com.demo.solid.violate.JioNetwork;

import java.util.Scanner;

public class NetworkTablet extends Tablet{

    protected JioNetwork network;

    public NetworkTablet(String ram, String rom, String batteryLife, String camera, String bluetooth) {
        super(ram, rom, batteryLife, camera, bluetooth);
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

    public void addNetwork(String mobileNumber) {
        this.network = new JioNetwork(mobileNumber);
    }
}

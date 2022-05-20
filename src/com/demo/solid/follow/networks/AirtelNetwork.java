package com.demo.solid.follow.networks;

import com.demo.solid.follow.Network;

public class AirtelNetwork implements Network {

    String mobileNumber;

    public AirtelNetwork(String mobileNumber) {
        this.mobileNumber = mobileNumber;
    }

    @Override
    public void sendMessageToNumber(String mobileNo, String message) {
        System.out.println("Message sent to " + mobileNo + " successfully!!!\n Message sent through Airtel network");
    }

    @Override
    public void callNumber(String contactNo) {
        System.out.println("Calling" + "... " + contactNo + " through Airtel Network");
    }
}

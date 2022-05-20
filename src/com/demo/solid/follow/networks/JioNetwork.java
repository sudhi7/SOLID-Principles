package com.demo.solid.follow.networks;

import com.demo.solid.follow.Network;

public class JioNetwork implements Network {

    String mobileNumber;

    public JioNetwork(String mobileNumber) {
        this.mobileNumber = mobileNumber;
    }

    @Override
    public void sendMessageToNumber(String mobileNo, String message) {
        System.out.println("Message sent to " + mobileNo + " successfully!!!\n Message sent through Jio network");
    }

    @Override
    public void callNumber(String contactNo) {
        System.out.println("Calling" + "... " + contactNo + " through Jio Network");
    }
}

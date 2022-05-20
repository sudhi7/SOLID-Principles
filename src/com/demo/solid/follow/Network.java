package com.demo.solid.follow;

public interface Network {

    void sendMessageToNumber(String mobileNo, String message);

    void callNumber(String contactNo);
}

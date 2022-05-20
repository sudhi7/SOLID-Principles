package com.demo.solid.follow.devices;

import com.demo.solid.follow.features.SharingFeature;

public class BluetoothPhone extends CameraPhone implements SharingFeature {

    protected String bluetooth;

    public BluetoothPhone(String ram, String rom, String batteryLife, String camera, String bluetooth) {
        super(ram, rom, batteryLife, camera);
        this.bluetooth = bluetooth;
    }

    public void shareImages() {
        System.out.println("Sharing images via bluetooth..");
    }

}

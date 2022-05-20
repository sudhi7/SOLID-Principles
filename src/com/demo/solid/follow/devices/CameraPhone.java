package com.demo.solid.follow.devices;

import com.demo.solid.follow.features.PhotoFeature;

public class CameraPhone extends Phone implements PhotoFeature {

    protected String camera;

    public CameraPhone(String ram, String rom, String batteryLife, String camera) {
        super(ram, rom, batteryLife);
        this.camera = camera;
    }

    @Override
    public void capturePhoto() {
        System.out.println("Photo captured!!");
    }
}

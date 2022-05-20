package com.demo.solid.violate;

import com.demo.solid.violate.devices.NetworkTablet;
import com.demo.solid.violate.devices.Phone;
import com.demo.solid.violate.devices.Radio;
import com.demo.solid.violate.devices.Tablet;

public class Main {
    public static void main(String args[]) {

        /* violation of SRP */
        Phone nokia8210 = new Phone("4MB", "4MB", "800 mAh");
        nokia8210.addNetwork("9999999999");
        String message = nokia8210.writeMessage();
        nokia8210.sendMessage(message);

         /* violation of OCP */
        Phone nokia110 = new Phone("4MB", "4MB", "800 mAh", "QVGA");
        nokia110.addNetwork("9988998899");
        nokia110.playGames();

        /* violation of LSP */
        NetworkTablet samsung = new NetworkTablet("1 GB", "8 GB" , "4325 mAh", "1.2 MP", "3.0");
        samsung.addNetwork("8899889988");

        Tablet samsungGalaxy = new NetworkTablet("1 GB", "8 GB" , "4325 mAh", "1.2 MP", "3.0");
        //samsungGalaxy.addNetwork("5555555555");

        /* violation of ISP */
        Radio RL118 = new Radio("230V AC/ 50 Hz", "2 x R6");
        RL118.playMusic();
        RL118.call();

        /* violation of DIP */
        Phone asusZenfone = new Phone("6 GB", "64 GB", "5000 mAh", "18 MP", "5.0");
        asusZenfone.addNetwork("7788997799");

    }
}

package com.demo.solid.follow;

import com.demo.solid.follow.devices.*;
import com.demo.solid.follow.networks.AirtelNetwork;
import com.demo.solid.follow.networks.JioNetwork;

public class Main {

    public static void main(String args[]) {

        /* SRP */
        Phone nokia8210 = new Phone("4MB", "4MB", "800 mAh");
        Network jio1 = new JioNetwork("9999999999");
        nokia8210.addNetwork(jio1);
        String message = nokia8210.writeMessage();
        nokia8210.sendMessage(message);

        /* OCP */
        CameraPhone nokia110 = new CameraPhone("4MB", "4MB", "800 mAh", "QVGA");
        Network airtel1 = new JioNetwork("8888888888");
        nokia110.addNetwork(airtel1);
        nokia110.playGames();

        /* LSP */
        Tablet nexus = new Tablet("1 GB", "8 GB" , "4325 mAh", "1.2 MP", "3.0");
        nexus.call();

        Network jio2 = new JioNetwork("7777777777");
        Tablet samsungGalaxy = new NetworkTablet("4 GB", "64 GB", "7040 mAh", "13 MP", "5.0", jio2);
        samsungGalaxy.call();

        /* ISP */
        Radio RL118 = new Radio("230V AC/ 50 Hz", "2 x R6");
        RL118.playMusic();

        /* DIP */
        BluetoothPhone asusZenfone = new BluetoothPhone("6 GB", "64 GB", "5000 mAh", "18 MP", "5.0");
        Network airtel2 = new AirtelNetwork("6666666666");
        asusZenfone.addNetwork(airtel2);
        asusZenfone.sendMessage("HelloWorld");

    }

}

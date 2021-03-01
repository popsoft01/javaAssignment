package com.company;

import java.nio.channels.Channel;
import java.util.Scanner;

public class Television1Test {
    public static void main(String... args){

        Scanner input = new Scanner(System.in);

        Television1 tv = new Television1("shape", 55);



        tv.powerOn = true;

        System.out.println("A " + tv.getScreenSize() + " inch " +
                tv.getManufacturer() + " has been turned on.");

        System.out.print("What channel do you want? ");
        int station = input.nextInt();

        tv.setChannel(station);

        tv.getIncreaseVolume();
        tv.getIncreaseVolume();
        tv.getIncreaseVolume();

        System.out.println("Channel: " + tv.getChannel() +
                " Volume: " + tv.getVolume());
        System.out.println("Too loud, lowering the volume.");

        tv.getDecreaseVolume();
        tv.getDecreaseVolume();

        System.out.println("Channel: " + station +
                " Volume: " + tv.getVolume());

    }
}

package com.company;

import java.util.ArrayList;

public class Main {

    public static void main(String[] args) {
        var myRecord = new Record(12, 15);
        System.out.println(myRecord.x());
        System.out.println(myRecord.y());
        var code = "604";

        switch (code) {
            case "401", "402", "403", "404" -> System.out.println("Client's error");
            case "501", "502", "503", "504" -> System.out.println("Server's error");
            default -> {
                System.out.println("U dum dum, code wrong. haha");
                System.out.println("Code not recognized");
            }
        }
    }
}

package com.company;

import java.util.ResourceBundle;

public class Main {

    public static void main(String[] args) {
        ResourceBundle resourceBundle = ResourceBundle.getBundle("messages.Messages");
        System.out.println("Imię po angielsku: " + resourceBundle.getString("name"));

        resourceBundle = ResourceBundle.getBundle("messages.Messages_pl");
        System.out.println("Surename in polish: " + resourceBundle.getString("surname"));
    }
}

package com.learnjava.organized;

public class Main {
    public static void main(String[] args) {

        String country = "germany";

        System.out.print("Spoken Language : ");
        switch (country) {
            case "germany":
                System.out.println("German");
                break;
            case "usa":
            case "canada":
                System.out.println("English");
                break;
            default:
                System.out.println("No Country for Old Men");
                break;
        }
    }
}
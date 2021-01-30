package com.company;

import java.util.Scanner;

public class case_tanlash {
    public static void main(String[] args) {
        Scanner svitch=new Scanner(System.in);
        int a=svitch.nextInt();
        switch (a)
        {
            case 1:
                System.out.println("qish");
            case 2:
                System.out.println("bahor");
            case 3:
                System.out.println("yoz");
            case 4:
                System.out.println("kuz");
            default:
                System.out.println("bunday faslyoq");

        }
    }
}

package com.company;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Scanner scanner=new Scanner(System.in);
        int k=scanner.nextInt();
        int c=scanner.nextInt();
        Birinchidars(k,c);
    }
    static void Birinchidars(int a,int b){
       int suma;
       suma=a+b;
        System.out.println("soma="+suma);
    }
}

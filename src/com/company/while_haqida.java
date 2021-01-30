package com.company;

import java.util.Scanner;

public class while_haqida {
    public static void main(String[] args) {
        Scanner Whlie=new Scanner(System.in);
//        int a=Whlie.nextInt();
//        int S=0,r;
//
//        while (a>0){
//
//            r=a%10;
//            S+=r;
//            a/=10;
//
//        }
//        System.out.println("S="+S);

    //------------------raqamlarni teskari tartibda chiqarish

//        int a=Whlie.nextInt();
//        int r ,A=0;
//        while(a>0)
//        {
//            r=a%10;
//            A=A*10+r;
//            a=a/10;
//        }
//        System.out.println("A="+A);


        //----------raqamlar soni

        int a=Whlie.nextInt();
        int r=0;

        while (a>0){
            r++;
            a=a/10;

        }
        System.out.println("soni="+r);
    }
}

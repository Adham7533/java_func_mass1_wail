package com.company;

import java.util.Scanner;

import static java.lang.Math.*;

public class for_haqida {
    public static void main(String[] args) {
//
//        Scanner forin=new Scanner(System.in);
//        double S=0;
//
//        for (int m=1;m<=19;m++)
//
//        {
//            if(m>3)
//            S+=(3*pow(m,3)+4*m+5)/(pow(m,3)+log(m-3));
//        }
//        System.out.println("S="+S);

        //---------------ko'paytma
//        Scanner for1 = new Scanner(System.in);
//        double P = 1;
//
//        for (int k = 1; k <= 46; k++)
//        {
//            P*=k/(pow(k,3)+7*k+5);
//
//        }
//        System.out.println("P="+P);

                    //-----------------qo'shish ko'paytirish


//        Scanner for_S_P=new Scanner(System.in);
//        double S=0,P=1;
//        double n=for_S_P.nextDouble();
//        for (int i=1;i<=32;i++)
//        {
//            for (int m=1;m<=14;m++)
//            {
//                P*=(log(1)+pow(m,i))/(pow(m,i)+pow(n,2*i));
//            }
//            S+=P;
//        }
//        System.out.println("S="+S);

        //------------------ko'paytrish -2

//        Scanner for_P1=new Scanner(System.in);
//        double P=1;
//        for (int i=1;i<=34;i++)
//        {
//            P*=(pow(i,3)+abs(i-9))/(log(i)+7*i);
//        }
//        System.out.println("P="+P);

        //--------qo'shish-2

//        Scanner for_S1=new Scanner(System.in);
//        double S=0;
//        for (int k=1;k<=10;k++)
//        {
//            S+=(pow(-1,k)*(k+1))/(pow(k,3)+pow(k,2)+1);
//        }
//        System.out.println("S="+S);


        //------------ko'paytrish qo'shish

        Scanner for_P_S=new Scanner(System.in);

        double a=for_P_S.nextDouble();
        double b=for_P_S.nextDouble();
        double S=0,P=1;
        for (int n=1;n<=a;n++)
        {
            for (int m=1;m<=b;m++)
            {
            S+=pow(-1,m)*(log10(m+5))/(pow(m,n+3)+n*m);
            }
            P*=S;
        }
        System.out.println("S="+S);
        System.out.println("P="+P);
    }
}

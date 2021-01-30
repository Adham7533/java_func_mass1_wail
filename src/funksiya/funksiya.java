package funksiya;

import java.util.Scanner;

public class funksiya {
    public static void main(String[] args) {
        Scanner scanner=new Scanner(System.in);
//        int a=scanner.nextInt();
//        int b=scanner.nextInt();
////        funksion(a,b);
//        kopaytma(a,b);
//    }
////    static void funksion(int a,int b){
////         int c=a+b;
////        System.out.println("S="+c);
////    }
//    static int kopaytma(int a,int b){
//        int c;
//        c=a*b;
//        System.out.println(c);
//        return c;
    int a= scanner.nextInt();
    yigindi(a);
    }
    static double yigindi(int a){
        int S=0,r;
        while (a>0){
            r=a%10;
            S=S+r;
            a/=10;
        }
        System.out.println("S="+S);
        return S;
    }
}

package funksiya;

import java.util.Scanner;

public class massiv {
    public static void main(String[] args) {
        //Scanner massiv1 = new Scanner(System.in);
//        int[] a;
//        int n;
//        n=massiv1.nextInt();
//        a=new int[n];
//        for (int i=0;i<=n;i++)
//        {
//            System.out.print("Enter a["+i+"]=");
//            a[i]=massiv1.nextInt();
//        }
        Scanner in=new Scanner(System.in);
        int[] a;
        int n, max;
        n = in.nextInt();
        a = new int[n];
        max = a[0];
        for (int i = 0; i <= n; i++) {
            System.out.print("Enter a[" + i + "]=");
            a[i] = in.nextInt();
        }
        for (int i = 0; i <= n; i++) {
            if (a[i] > max)
                System.out.println(max);
            a[i] = in.nextInt();
        }
    }
}

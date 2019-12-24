package com.lak54n4.dasarjava.wujudair;

import java.util.Scanner;

public class WujudAir {
    public static void main(String[] args){
        int T;

        System.out.println("Wujud Air");
        System.out.print("Masukkan Suhu (der.C) =  ");

        Scanner scanner = new Scanner (System.in);
        T = scanner.nextInt();

        if(T < 0){
            System.out.println("wujud air adalah es/beku, dengan suhu " + T + " derajat celcius");
        } else if ((0 <= T) && (T <= 100)) {
            System.out.println("wujud air adalah cair, dengan suhu " + T + " derajat celcius");
        }else if(T > 100){
            System.out.println("wujud air adalah gas/uap, dengan suhu " + T + " derajat celcius");
        }
    }
}


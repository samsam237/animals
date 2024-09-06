package org.afrikpay.interfaces;

import java.util.Scanner;

public interface GetUserStringInterface {
    public static String getUserChoice(){
        Scanner sc = new Scanner(System.in);
        return sc.nextLine();
    };
}

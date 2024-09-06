package org.afrikpay.interfaces;

import java.util.Scanner;

public interface GetUserIntInterface {
    public static int getUserChoice(){
        Scanner sc = new Scanner(System.in);
        int value = sc.nextInt();
        return Math.max(value, 0);
    };
}

package com.company;

public class Validator {
    public static boolean isProperInt(String param) {
        try {
            int num = Integer.parseInt(param);
            if(num < 1) {
                System.out.println("Podałeś liczbę ujemną! Podaj dodatnią:");
            }

        }catch (Exception e) {
            System.out.println("Podaj poprawną liczbę całkowitą dodatnią:");
            return false;
        }
        return true;
    }

    public static boolean isProperCharacter(String param) {
        if(param.length() != 1) {
            System.out.println("Podaj jeden znak do rysowania choinki:");
            return false;
        }
        return true;
    }
}

package com.company;

import java.util.Scanner;

public class InitialParametes {
    private Scanner scanner;
    InitialParametes() {
        scanner = new Scanner(System.in);
    }
    public int getIntParameter() {
        while (true) {
            String param = scanner.next();
            if(Validator.isProperInt(param))
                return Integer.parseInt(param);
        }
    }

    public String getCharacterParameter() {
        while (true) {
            String param = scanner.next();
            if(Validator.isProperCharacter(param))
                return param;
        }
    }
}

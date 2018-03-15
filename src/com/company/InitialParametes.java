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

    public XmassTreePrinter.Direction getDirection(){
        while (true) {
            String param = scanner.next();
            if(Validator.isProperDirection(param))
                if(param.equals("u") || param.equals("U")){
                    return XmassTreePrinter.Direction.UP;
                }
                else if(param.equals("l") || param.equals("L")){
                    return XmassTreePrinter.Direction.LEFT;
                }
                else if(param.equals("r") || param.equals("R")){
                    return XmassTreePrinter.Direction.RIGHT;
                }
                else if(param.equals("d") || param.equals("D")){
                    return XmassTreePrinter.Direction.DOWN;
                }
        }
    }
}

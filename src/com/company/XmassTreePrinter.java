package com.company;

public class XmassTreePrinter {
    public enum Direction{
        UP,
        DOWN,
        LEFT,
        RIGHT
    }

    private String treeCharacter;
    private int sizeOfTree;
    private Direction direction;

    public XmassTreePrinter() {
        this.treeCharacter = this.getTreeCharacter();
        this.sizeOfTree = this.getSizeOfTree();
        this.direction = this.getDirection();

    }

    public void printTree(){
        this.printTreeUp();
        this.printTreeRight();
        this.printTreeDown();
        this.printTreeLeft();
    }

    private void printTreeUp(){
        for (int i = 0; i < sizeOfTree; i++) {
            drawLineUpDown(i);
        }
    }

    private void printTreeDown() {
        for (int i = sizeOfTree - 1; i > -1; i--) {
            drawLineUpDown(i);
        }
    }

    private void printTreeLeft() {
        for (int i = 0; i < 2 * sizeOfTree - 1; i++) {
            drawLineLeft(i);
        }
    }

    private void printTreeRight() {
        for (int i = 0; i < 2 * sizeOfTree - 1; i++) {
            drawLineRight(i);
        }
    }

    private int getSizeOfTree(){
        return 10;
    }

    private String getTreeCharacter(){
        return "*";
    }

    private Direction getDirection(){
        return Direction.UP;
    }

    private void drawLineUpDown(int levelFromBottom) {
        for (int j = 0; j < 2 * this.sizeOfTree; j++) {
            if (Math.abs(j - this.sizeOfTree) > levelFromBottom) {
                System.out.print(" ");
            } else {
                System.out.print(this.treeCharacter);
            }
        }
        System.out.println();
    }

    private void drawLineLeft(int levelFromTop) {
        for (int j = 0; j < sizeOfTree; j++) {
            if (j < Math.abs(sizeOfTree - levelFromTop - 1)) {
                System.out.print(" ");
            } else {
                System.out.print(this.treeCharacter);
            }
        }
        System.out.println();
    }

    private void drawLineRight(int levelFromTop) {
        for (int j = 0; j < sizeOfTree; j++) {
            if (j + 1 > sizeOfTree - Math.abs(sizeOfTree - levelFromTop - 1)) {
                System.out.print(" ");
            } else {
                System.out.print(this.treeCharacter);
            }
        }
        System.out.println();
    }
}

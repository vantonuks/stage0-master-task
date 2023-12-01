package com.epam.loops;

public class Pyramid {

    public void printPyramid(int cathetusLength) {
        int floorLength = cathetusLength * 2 - 1;
        for (int floor = 1; floor <= cathetusLength; floor++) {
            int symbol = floor;
            String result = "";
            for (int i = 1; i <= floorLength; i++){
                if (i > cathetusLength - 1 + floor) break;      //stop filling result string and print it

                if (i < cathetusLength + 1 - floor) result += " ";
                else {
                    result += symbol;
                    //increase or decrease the number that must be printed
                    if (i < cathetusLength) symbol--;
                    else symbol++;
                }
            }
            System.out.println(result);
        }
    }

    public static void main(String[] args) {
        new Pyramid().printPyramid(7);
    }
}

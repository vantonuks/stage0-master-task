package com.epam.loops;

public class HalfPyramid {
    //Solution is based on Pyramid solution
    public void printHalfPyramid(int cathetusLength) {
        int floorLength = cathetusLength * 2 - 1;
        for (int floor = 1; floor <= cathetusLength; floor++) {
            String result = "";
            for (int i = 1; i <= cathetusLength; i++){
                if (i > cathetusLength - 1 + floor) break;      //stop filling result string and print it
                if (i < cathetusLength + 1 - floor) result += " ";
                else {
                    result += "*";
                }
            }
            System.out.println(result);
        }
    }

    public static void main(String[] args) {
        new HalfPyramid().printHalfPyramid(8);
    }

}

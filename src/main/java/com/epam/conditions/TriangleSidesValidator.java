package com.epam.conditions;

public class TriangleSidesValidator {

    public void validate(double firstSide, double secondSide, double thirdSide) {
        if (firstSide > 0 && secondSide > 0 && thirdSide > 0) System.out.println("this is a valid triangle");
        else System.out.println("it's not a triangle");
    }
}

package com.epam.langSyntax;

public class NumberReverter {

    public void revert(int number) {
        int d1 = number%10;
        int d3 = number/100;
        int d2 = (number%100)/10;
        int result = d1*100 + d2*10 + d3;

        System.out.println(result);
    }
}

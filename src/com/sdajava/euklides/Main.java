package com.sdajava.euklides;

public class Main {

    public static int euk(int a, int b) {

        while (a != b)
            if (a > b) {
                a = a - b;
            }
            else {
                b = b - a;
            }
        return a;
    }

    public static void main (String[] args){

        int a = 25;
        int b = 15;

        System.out.println("Najwiekszym wspolnym dzielnikiem liczb jest: " + euk(a,b));

    }
}
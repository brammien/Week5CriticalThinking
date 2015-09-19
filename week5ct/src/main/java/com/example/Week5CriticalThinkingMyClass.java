package com.example;

public class Week5CriticalThinkingMyClass {

    public static void main(String args[]) {
        int a = 15;	//00001111
        int b = 11;	//00001011
        int c = 3; //00000011
        int d = 7; //00000111
        int e = 10; //00001010
        int f = 4;  //00000100
        int g = 5;  //00000101

        System.out.println("00000101 * 00001111" + " = " +( g * a));
        System.out.println("5 * 15 = 75");
        System.out.println("00001011 % 00000011" + " = " +( b % c));
        System.out.println("11 % 3 = 2");
        System.out.println("00001111 / 00000011" + " = " +( a / c));
        System.out.println("15 / 3 = 5");
        System.out.println("00001111 - 00001010" + " = " +( a - e));
        System.out.println("15 - 10 = 5");
        System.out.println("00000100 + 00000111" + " = " +( f + d));
        System.out.println("4 + 7 = 11");
        System.out.println("00000101 + 00001111" + " = " +( g * a));
        System.out.println("5 * 15 = 75");
        System.out.println("(00000100 * 00001011) * 00000101" + " = " +( f + b) * g);
        System.out.println("(4 + 11) * 5 = 75");

    }
}

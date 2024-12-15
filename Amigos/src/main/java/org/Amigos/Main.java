package org.Amigos;

import java.util.Arrays;

public class Main {
    public static void main(String[] args) {
        int[] number = {1,2,3,4,5,6};
        Arrays.stream(number).forEach(System.out::println);
        System.out.println("Hello world!");
    }
}
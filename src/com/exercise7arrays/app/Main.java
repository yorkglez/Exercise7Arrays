package com.exercise7arrays.app;

public class Main {
    public static void main(String[] args) {
        //Constants declaration
        //I want 10 elements because it's a practice project
        final int ElEMENTS_ARRAY = 10;
        //Arrays declaration
        //1st Way
        int[] intArray = new int[ElEMENTS_ARRAY];
        char[] charArray = new char[ElEMENTS_ARRAY];
        boolean[] boolArray = new boolean[ElEMENTS_ARRAY];
        double[] doubleArray = new double[ElEMENTS_ARRAY];
        String[] stringArray = new String[ElEMENTS_ARRAY];

        //2st Way
        int[] intArray2 = {10,20,30,40,50,60};
        char[] charArray2 = {'a','b','c','d'};
        boolean[] booleanArray2 = {true, false, true, false, true};
        double[] doubleArray2 = {1.0,2.0,3.0,4.0,5.0};
        String[] stringArray2 = {"first","second","third","fourth"};

        //3st Way

        for(int i = 0; i < intArray2.length; i++){
            System.out.println(intArray2[i]);
        }
    }
}

package com.numbers;// Java program to find numbers are dividable by 3

import java.util.ArrayList;
import java.util.List;

// Main class
public class Main {

    // Method to run java program
    public static void main(String[] args) {

        // Creating list to store numbers
        List<Integer> list = new ArrayList<>();

        // Adding elements to a list
        for (int index = 0; index < 100; index++) {
            list.add(index);
        }

        // Checking that numbers are dividable by 3
        for (int index = 0; index < 100 ; index++) {

            // Condition
            if (list.get(index) % 3 == 0){

                // Printing result to console
                System.out.println(list.get(index) + " is dividable by 3.");
            } else {

                // Printing result to console
                System.out.println(list.get(index) + " is not dividable by 3.");
            }
        }
    }
}
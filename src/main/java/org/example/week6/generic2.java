package org.example.week6;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;
import java.util.Collections;

public class ReversedList{
    public static <T> void reverseList(List<T> firstList){
        Collections.reverse(firstList);
    }

    public static void main(String[] args){
        Scanner reader = new Scanner(System.in);

        System.out.println("Enter integers: ");
        List<Integer> firstIntegerList = readList(reader.nextLine());

        System.out.println("Enter strings: ");
        List<String> firstStringList = readList(reader.nextLine());

        reverseList(firstIntegerList);
        reverseList(firstStringList);

        System.out.println("Reversed integers: " + firstIntegerList);
        System.out.println("Reversed strings: " + firstStringList);

    }

    private static List<Integer> readList(String input){
        List<Integer> list = new ArrayList<>();
        Scanner reader = new Scanner(input);

        while(reader.hasNextInt()){
            list.add(reader.nextInt());
        }
        return list;
    }

    private static List<String> readList(String input){
        List<String> list = new ArrayList<>();
        Scanner reader = new Scanner(input);

        while(reader.hasNext()){
            list.add(reader.next())
        }
        return list;
    }
}
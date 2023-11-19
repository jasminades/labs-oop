package org.example.week6;

import java.util.ArrayList;

public class IndexFrom{
    public static int indexOfTheSmallestStartingFrom(int[] array, int index){
        if(array.length==0 || startIndex>=array.length || startIndex < 0){
            System.out.println("Invalid inputs! ");
            return;
        }

        int smallestNumber=array[index];
        int indexOfTheSmallest = index;

        for(int i=index +1; i<array.length; i++){
            if(array[i] < smallestNumber){
                smallestNumber=array[i];
                indexOfTheSmallest=i;
            }
        }
        return indexOfTheSmallest;
    }

    public static void main(STring[] args){
        int[] values={-1,6,9,8,12};
        int index=2;
        System.out.println(indexOfTheSmallestStartingFrom(numbers,1));
        System.out.println(indexOfTheSmallestStartingFrom(numbers,2));
        System.out.println(indexOfTheSmallestStartingFrom(numbers,4));
    }
}
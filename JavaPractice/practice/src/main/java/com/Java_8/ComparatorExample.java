package com.Java_8;

import java.util.Comparator;

public class ComparatorExample {
    public static void main(String[] args) {
    
        Comparator<Integer> comparator = new Comparator<Integer>() {
        @Override
        public int compare(Integer x, Integer y) {
            // TODO Auto-generated method stub
            return x.compareTo(y);
            }
         };


     System.out.println(comparator.compare(2, 4));
   
     //returns 1,-1,0

     //In java 8 

     Comparator<Integer> nComparator = (x,y) -> x.compareTo(y);
     System.out.println(comparator.compare(20, 4));
   
    }
}

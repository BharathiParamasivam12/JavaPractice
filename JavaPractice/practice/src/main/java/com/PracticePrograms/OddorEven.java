package com.PracticePrograms;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Map;
import java.util.stream.Collector;
import java.util.stream.Collectors;

public class OddorEven {
    public static void main(String[] args){
        List<Integer> input = Arrays.asList(89,79,66,12,53,191,78,82,100,101);
        OddorEven objEven = new OddorEven();
        objEven.toFindOddOrEven(input);
    }
    public void toFindOddOrEven(List<Integer> input){
            Map<Boolean,List<Integer>> oddOrEvenMap =   
                    input.stream()
                    .collect(Collectors.partitioningBy(i-> i % 2 == 0));
            oddOrEvenMap.forEach((k,v)->{
                if(k)
                    System.out.println("Even List : "+v);
                else
                    System.out.println("Odd List : "+v);
            });
    
    }
}

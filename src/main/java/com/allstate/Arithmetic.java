package com.allstate;

import java.util.Collection;
import java.util.Collections;
import java.util.List;
import java.util.Map;
import java.util.function.Function;
import java.util.stream.Collectors;
import java.util.stream.IntStream;

/**
 * Created by localadmin on 03/01/17.
 */
public class Arithmetic {

    public static float calculateMean(List<Integer> list){
        int mean =list.stream().reduce(0,(acc, value) -> acc +value);
        return (float)mean/list.size();
    }

    public static int calculateMedian(List<Integer> list){
        Collections.sort(list);
        int size = list.size();
        if(size % 2 == 0){
           return  (list.get(size/2)+ list.get(size/2 -1))/2;
        }
        else{
            return list.get(size/2);
        }

    }

   public static Long calculateMode(List<Long> list){

       Map<Long, Long> counts =
               list.stream().collect(Collectors.groupingBy( e -> e, Collectors.counting()));
       System.out.println(counts);
      return counts.entrySet().stream().max((entry1, entry2) -> entry1.getValue() > entry2.getValue() ? 1 : -1).get().getKey();

   }

}

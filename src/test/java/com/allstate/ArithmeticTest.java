package com.allstate;

import org.junit.Assert;
import org.junit.Test;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.stream.IntStream;
import java.util.stream.LongStream;

import static org.junit.Assert.*;

/**
 * Created by localadmin on 03/01/17.
 */
public class ArithmeticTest {

    @Test
    public void Arithmetic_MeanTest(){
        int[] nums1 = {3,1,7,3};
        IntStream stream1 =  Arrays.stream(nums1);
        List<Integer> nums2 = new ArrayList<>();

        for(int i = 0; i < nums1.length; i++){
            nums2.add(nums1[i]);
        }

        float mean= Arithmetic.calculateMean(nums2);
        Assert.assertEquals(mean,3.5,0.0);

    }

    @Test
    public void Arithmetic_MedianTest(){
        int[] nums1 = {3,1,7,3,5};
        IntStream stream1 =  Arrays.stream(nums1);
        List<Integer> nums2 = new ArrayList<>();

        for(int i = 0; i < nums1.length; i++){
            nums2.add(nums1[i]);
        }

        int  median= Arithmetic.calculateMedian(nums2);
        Assert.assertEquals(median,3);

    }

    @Test
    public void Arithmetic_ModeTest(){
        long[] nums1 = {3,1,7,3,5};
        LongStream stream1 =  Arrays.stream(nums1);
        List<Long> nums2 = new ArrayList<>();

        for(int i = 0; i < nums1.length; i++){
            nums2.add(nums1[i]);
        }

        long   mode= Arithmetic.calculateMode(nums2);
        Assert.assertEquals(mode,3);

    }


}
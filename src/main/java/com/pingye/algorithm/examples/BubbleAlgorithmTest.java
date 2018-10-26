package com.pingye.algorithm.examples;

import java.util.Arrays;

/**
 * @author : huhu
 * @desc: 冒泡算法
 *
 */
public class BubbleAlgorithmTest {

    public static void main(String[] args) {
        Long[] longArr = {10L,2L,34L,16L,1L,45L,30L,-4L,16L};
        System.out.println(Arrays.toString(longArr));

        longArr = bubbling(longArr);
        System.out.println(Arrays.toString(longArr));
    }


    public static Long[] bubbling(Long[] longArr) {

        for(int i = 0 ; i < longArr.length -1 ; i ++) {
            for(int j = i ; j < longArr.length ; j ++) {
                 if(longArr[i] > longArr[j]) {
                     long data = longArr[i];
                     longArr[i] = longArr[j];
                     longArr[j] = data;
                 }
            }
        }

        return longArr;

    }
}

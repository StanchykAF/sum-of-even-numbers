package com.epam.rd.autotasks.arrays;

import com.epam.rd.autotasks.arrays.SumOfEvenNumbers;
import org.junit.jupiter.api.Test;

import java.util.Arrays;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class Tests {

    @Test
    public void sumTest(){
        int[] array = new int[]{1, 3, 2, 8, 15, 199};
        int actual = SumOfEvenNumbers.sum(array);

        assertEquals(18, actual);

        array = new int[10000];
        Arrays.fill(array, 1);
        actual = SumOfEvenNumbers.sum(array);

        assertEquals(5000, actual);

        array = new int[700];
        actual = SumOfEvenNumbers.sum(array);

        assertEquals(0, actual);

        array = new int[1000];
        Arrays.fill(array, 1);
        array[0] = 11;
        array[1] = -100;
        actual = SumOfEvenNumbers.sum(array);

        assertEquals(510, actual);

        array = new int[1001];
        Arrays.fill(array, -100);
        for (int i = 0; i < array.length; i+=2){
            array[i] = 10;
        }
        actual = SumOfEvenNumbers.sum(array);

        assertEquals(5010, actual);
    }

    @Test
    public void nullOrEmptyTest(){
        int[] nullArray = null;
        int[] emptyArray = new int[0];

        assertEquals(0, SumOfEvenNumbers.sum(nullArray));
        assertEquals(0, SumOfEvenNumbers.sum(emptyArray));
    }
}

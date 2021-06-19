import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class Tests {

    @Test
    public void sumTest(){
        int[] array = new int[]{1, 3, 2, 8, 15};
        int actual = SumOfEvenNumbers.sum(array);

        assertEquals(18, actual);
    }

    @Test
    public void nullOrEmptyTest(){
        int[] nullArray = null;
        int[] emptyArray = new int[0];

        assertEquals(0, SumOfEvenNumbers.sum(nullArray));
        assertEquals(0, SumOfEvenNumbers.sum(emptyArray));
    }
}

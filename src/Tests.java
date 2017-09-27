/**
 * Created by z on 27.09.2017.
 */

import org.junit.Test;

import static org.junit.Assert.*;


public class Tests {
    int[] Price1 = {100, 113, 110, 85, 105, 102, 86, 63, 81, 101, 94, 106, 101, 79, 94};
    int[] Price2 = {7, 3, 2, 5, 10};
    int[] Price3 = {1, 40, 30, 25, 80, 30};

    @Test
    public void findTest() {
        assertEquals(Sort.findMaxSubArraySum(Price1), 43);
        assertEquals(Sort.findMaxSubArraySum(Price2), 8);
        assertEquals(Sort.findMaxSubArraySum(Price3), 55);
    }
}


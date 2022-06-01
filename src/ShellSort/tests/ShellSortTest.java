package ShellSort.tests;

import static org.junit.Assert.assertEquals;

import org.junit.Test;

import ShellSort.classes.ShellSort;

public class ShellSortTest {
    @Test
    public void testSort() {
        Integer[] array = new Integer[6];
        ShellSort sortAlgorithm =  new ShellSort();
        
        array[0] = 7;
        array[1] = 1;
        array[2] = 8;
        array[3] = 6;
        array[4] = 0;
        array[5] = 4;

        sortAlgorithm.Sort(array);

        assertEquals(0, (int)array[0]);
        assertEquals(1, (int)array[1]);
        assertEquals(4, (int)array[2]);
        assertEquals(6, (int)array[3]);
        assertEquals(7, (int)array[4]);
        assertEquals(8, (int)array[5]);
    }
    @Test
    public void ArrayWithJustOnlyOneElement() {
        Integer[] array = new Integer[1];
        ShellSort sortAlgorithm =  new ShellSort();
        sortAlgorithm.Sort(array);
        assertEquals(null, array[0]);
    }
}

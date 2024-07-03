package herb.ng.interview;

import org.junit.Before;
import org.junit.Test;
import java.util.Arrays;

/**
 * See <a href="https://www.geeksforgeeks.org/introduction-to-sorting-algorithm/"/>
 * src/test/resources/SortingTYPE.png
 */
public class SortingTest {

    private Sorting sorting;
    private int[] numbers;
    @Before
    public void setUp() {
        numbers = new int[] {10, 5, 3, 0, 8, 4, 2, 0, 1, 5, 6, 11};
        sorting = new Sorting();
    }

    @Test
    public void selectionSorting() {
        System.out.println("Before sorting: " + Arrays.toString(numbers));
        sorting.selectionSort(numbers);
        System.out.println("After sorting: " + Arrays.toString(numbers));
    }

    @Test
    public void bubbleSorting() {
        System.out.println("Before sorting: " + Arrays.toString(numbers));
        sorting.bubbleSort(numbers);
        System.out.println("After sorting: " + Arrays.toString(numbers));
    }

    @Test
    public void insertionSorting() {
        System.out.println("Before sorting: " + Arrays.toString(numbers));
        sorting.insertionSort(numbers);
        System.out.println("After sorting: " + Arrays.toString(numbers));
    }
}

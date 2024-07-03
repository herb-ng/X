package herb.ng.interview;

import org.junit.Test;

import java.util.Arrays;
// see src/test/resources/SortingTYPE.png
public class SortingTest {

    /**
     * Find the smallest element in every iteration and place in the beginning of the
     * array starting from index Z=0, Z=1, Z=2, Z=3, Z=4, Z=5, Z=6, Z=7, Z=8, Z=9, Z=10, Z=11
     * Complexity of
     * @param numbers
     */
    void selectionSort(int[] numbers) {
        for (int z = 0; z < numbers.length; z++) {
            int min_index = z;
            // Traverse array starting from index Z to the end of the array.
            // Find the smallest element and swap with element at index Z.
            for (int x = z; x < numbers.length; x++) {
                if (numbers[min_index] > numbers[x]) {
                    min_index = x;
                }
            }
            int minNumber = numbers[min_index];
            int zNumber = numbers[z];
            // Swap the smallest element found at min_index with the element at index Z
            numbers[min_index] = zNumber;
            numbers[z] = minNumber;
        }
    }

    @Test
    public void selectionSorting() {
        int[] numbers = new int[] {10, 5, 3, 0, 8, 4, 2, 0, 1, 5, 6, 11};
        System.out.println("Before sorting: " + Arrays.toString(numbers));
        selectionSort(numbers);
        System.out.println("After sorting: " + Arrays.toString(numbers));
    }

    /**
     * Compare and sort (by swapping) the adjacent two elements in ascending
     * order until the array is sorted and no swapping was performed.
     * Complexity of bubble sort is O(N^2) where N is the number of elements in the array.
     * @param numbers
     */
    private void bubbleSort(int[] numbers) {
        boolean isSwapped = true;
        while (isSwapped) {
            isSwapped = false;
            for (int i = 0; (i + 1) < numbers.length; i++) {
                int element = numbers[i];
                int adjacentElement = numbers[i + 1];
                if (element > adjacentElement) {
                    numbers[i] = adjacentElement;
                    numbers[i + 1] = element;
                    isSwapped = true;
                }
            }
        }
    }

    @Test
    public void bubbleSorting() {
        int[] numbers = new int[] {10, 5, 3, 0, 8, 4, 2, 0, 1, 5, 6, 11};
        System.out.println("Before sorting: " + Arrays.toString(numbers));
        bubbleSort(numbers);
        System.out.println("After sorting: " + Arrays.toString(numbers));
    }

    /**
     * Insertion sort is a technique where you keep sorting elements from left to right.
     * @param numbers
     */
    private void insertionSort(int[] numbers) {
        boolean isSorted = true;
        while (isSorted) {
            isSorted = false;
            for (int i = 0; (i + 1) < numbers.length; i++) {
                int element = numbers[i];
                int adjacentElement = numbers[i + 1];
                if (element > adjacentElement) {
                    numbers[i] = adjacentElement;
                    numbers[i + 1] = element;
                    isSorted = true;
                    // Found and swapped the first pair of elements.
                    // Break the loop and start from the beginning of the array
                    // again. This is because we need to sort the array from left to right.
                    break;
                }
            }
        }
    }

    @Test
    public void insertionSorting() {
        int[] numbers = new int[] {10, 5, 3, 0, 8, 4, 2, 0, 1, 5, 6, 11};
        System.out.println("Before sorting: " + Arrays.toString(numbers));
        insertionSort(numbers);
        System.out.println("After sorting: " + Arrays.toString(numbers));
    }
}

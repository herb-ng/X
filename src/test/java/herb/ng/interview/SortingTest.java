package herb.ng.interview;

import org.junit.Test;

import java.util.Arrays;

// see src/test/resources/SortingTYPE.png
public class SortingTest {


    void selectionSort(int[] numbers) {
        // Find the smallest element in every iteration and place in the beginning of the
        // array starting from index Z=0, Z=1, Z=2, Z=3, Z=4, Z=5, Z=6, Z=7, Z=8, Z=9, Z=10, Z=11
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
    public void selection_sorting() {
        int[] numbers = new int[] {10, 5, 3, 0, 8, 4, 2, 0, 1, 5, 6, 11};
        System.out.println("Before sorting: " + Arrays.toString(numbers));
        selectionSort(numbers);
        System.out.println("After sorting: " + Arrays.toString(numbers));
    }

    @Test
    public void bubble_sorting() {
        int[] numbers = new int[] {10, 5, 3, 0, 8, 4, 2, 0, 1, 5, 6, 11};
        System.out.println("Before sorting: " + Arrays.toString(numbers));
        bubbleSort(numbers);
        System.out.println("After sorting: " + Arrays.toString(numbers));
    }

    private void bubbleSort(int[] numbers) {

    }
}

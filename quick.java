import java.util.Scanner;

public class quick{

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // Get user input for array size
        System.out.print("Enter the size of the array: ");
        int size = scanner.nextInt();

        // Get user input for array elements
        int[] array = new int[size];
        System.out.println("Enter the elements of the array:");

        for (int i = 0; i < size; i++) {
            System.out.print("Element " + (i + 1) + ": ");
            array[i] = scanner.nextInt();
        }

        System.out.println("\nOriginal Array:");
        printArray(array, 0);

        // Sort the array using QuickSort and print passes and iterations
        quickSort(array, 0, size - 1, 1);

        scanner.close();
    }

    public static void quickSort(int[] array, int low, int high, int iteration) {
        if (low < high) {
            // Find the pivot element such that elements smaller than the pivot are on the left,
            // and elements greater than the pivot are on the right.
            int pivotIndex = partition(array, low, high);

            // Print the array at each pass and iteration
            printArray(array, iteration);

            // Recursively sort the sub-arrays on the left and right of the pivot.
            quickSort(array, low, pivotIndex - 1, iteration + 1);
            quickSort(array, pivotIndex + 1, high, iteration + 1);
        }
    }

    public static int partition(int[] array, int low, int high) {
        int pivot = array[high];
        int i = low - 1;

        for (int j = low; j < high; j++) {
            if (array[j] <= pivot) {
                i++;

                // Swap array[i] and array[j]
                int temp = array[i];
                array[i] = array[j];
                array[j] = temp;
            }
        }

        // Swap array[i+1] and array[high] (pivot)
        int temp = array[i + 1];
        array[i + 1] = array[high];
        array[high] = temp;

        return i + 1;
    }

    public static void printArray(int[] array, int iteration) {
        System.out.print("Pass " + iteration + ": ");
        for (int value : array) {
            System.out.print(value + " ");
        }
        System.out.println();
    }
}

public class QuickSort {

    // Partition method to find the partition index
    static int partition(int arr[], int low, int high) {
        int pivot = arr[high]; // Choose the last element as pivot
        int i = low - 1; // Pointer for the smaller element

        for (int j = low; j < high; j++) {
            // If current element is smaller than or equal to pivot, swap it
            if (arr[j] <= pivot) {
                i++;
                // Swap arr[i] and arr[j]
                int temp = arr[i];
                arr[i] = arr[j];
                arr[j] = temp;
            }
        }

        // Swap the pivot element to its correct position
        int temp = arr[i + 1];
        arr[i + 1] = arr[high];
        arr[high] = temp;

        return i + 1; // Return the partition index
    }

    // Recursive method to perform QuickSort
    static void Sort(int arr[], int low, int high) {
        if (low < high) {
            // Find partition index
            int pivot = partition(arr, low, high);

            // Recursively sort elements before and after partition
            Sort(arr, low, pivot - 1);
            Sort(arr, pivot + 1, high);
        }
    }

    public static void main(String[] args) {
        int[] arr = { 3, 45, 43, 5, 65, 46, 45 };

        // Perform QuickSort on the array
        Sort(arr, 0, arr.length - 1);

        // Print the sorted array
        System.out.println("Sorted array:");
        for (int i = 0; i < arr.length; i++) {
            System.out.print(arr[i] + " ");
        }
    }
}
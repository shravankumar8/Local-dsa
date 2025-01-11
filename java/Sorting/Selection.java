public class Selection {
    static void Sorted(int[] arr) {
        for (int i = 0; i < arr.length - 1; i++) {
            int min = i;
            for (int j = i+1; j < arr.length ; j++) {
                if (arr[j] < arr[min]) {
                    min = j;

                }

            }
            int temp = arr[i];
            arr[i] = arr[min];
            arr[min] = temp;
        }
        for (int i = 0; i < arr.length; i++) {
            System.out.println(arr[i]);
        }

    }

    public static void main(String[] args) {
        int[] arr = { 4, 52, 5, 654, 35, 64, 56, 54, 545, 654 };

        Sorted(arr);

    }

}

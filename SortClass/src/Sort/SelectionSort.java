package Sort;

public class SelectionSort {
    public void selectsort(int[] array) {
        for (int i = 0; i < array.length - 1; i++) {
            int min_idx = i;
            for (int j = i + 1; j < array.length; j++) {
                if (array[j] < array[min_idx]) {
                    min_idx = j;
                }
                int temp = array[min_idx];
                array[min_idx] = array[i];
                array[i] = temp;

            }

        }


    }


    public static void main(String[] args) {

        int Array1[] = {0, 12, 34, 11,-55, 90, -1,60,12,45,9,24};
        SelectionSort selection = new SelectionSort();
        selection.selectsort(Array1);
        System.out.print("Array Sorted ");
        for (int a = 0; a < Array1.length; a++) {
            System.out.print(Array1[a] + " ");
        }
    }
}

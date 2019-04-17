package Sort;

public class BubbleSort {
    public static void main(String[] args) {
       /* for (int a =0;a<5;a++){
            System.out.println("JAVA printed for the " +(a+1)+" time");
            for (int j=0;j<3;j++) {
                System.out.println("Selenium " +(a+1)+ " time");
            }
        }*/
        int Array1[] = {0, 12, 34, 11, -55, 90, -1};
        BubbleSort bubblesort = new BubbleSort();
        bubblesort.bubbles(Array1);
        System.out.print("Array Sorted ");
        for (int a = 0; a < Array1.length; a++) {
            System.out.print(Array1[a] + " ");
        }
    }

    public void bubbles(int Array[]) {
        int n = Array.length;


        for (int i = 0; i < n+1; i++) {
            for (int j = 0; j < n - 1; j++) {
                if (Array[j] > Array[j + 1]) {
                    int temp = Array[j];
                    Array[j] = Array[j + 1];
                    Array[j + 1] = temp;

                }
            }

        }

    }
}

package Sort;

public class ReplaceFor {
    public static void main(String[] args) {
        for (int i = 0; i < 31; i++)
         if ((i % 3) == 0 && (i % 5) == 0) {
            System.out.print(" fuzzbuzz ");}
           else if ((i % 5) == 0) {
                System.out.print(" buzz ");

            } else if ((i % 3) == 0) {
                System.out.print(" fuzz ");
            }
             else
                System.out.print(i+" ");

        }

    }



import java.util.Scanner;

// Press Shift twice to open the Search Everywhere dialog and type `show whitespaces`,
// then press Enter. You can now see whitespace characters in your code.
public class minmax {
    public static void main(String[] args) {


        Scanner sc = new Scanner(System.in);
        int size = sc.nextInt();
        int array[] = new int[size];
        for (int i = 0; i < size; i++) {
            array[i] = sc.nextInt();
        }
        System.out.println(sumofminmax(array));
    }

    public static int sumofminmax(int[] array) {
        int max = Integer.MIN_VALUE;
        int min = Integer.MAX_VALUE;

        for (int i = 0; i < array.length; i++)//so the overall time complexity of the code is O(N).
        {
            if (array[i] > max) {
                max = array[i];
            }
            if (array[i] < min) {
                min = array[i];
            }
        }
        return max + min;
    }
}
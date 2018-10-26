import java.lang.*;

public class ArrayCopy2 {
    public static void main(String args[]) {
        int[] array1 = {1, 2, 3, 4, 5};
        
        int[] array2 = new int[5];

        for (int e : array2) {
            System.out.print(e);
        }

        System.arraycopy(array1, 0, array2, 0, array1.length);

        for (int e : array2) {
            System.out.print(e);
        }

    }
}

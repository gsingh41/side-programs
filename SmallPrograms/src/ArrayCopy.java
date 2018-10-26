public class ArrayCopy {

    // Small program to copy one array to another using loop method
    public static void main(String args[]) {
        int[] sourceArray = {5, 6, 3, 1, 10, 9};
        int[] targetArray = new int[sourceArray.length];

        for (int i = 0; i < sourceArray.length; i++) {
            targetArray[i] = sourceArray[i];
        }

        System.out.println("Contents of sourceArray");
        for (int e :sourceArray) {
            System.out.println(e);
        }

        System.out.println("Contents of targetArray");
        for (int e :targetArray) {
            System.out.println(e);
        }

        /*int[] myList;
        myList = new int[10];
        myList = new int[20];*/
     }
}

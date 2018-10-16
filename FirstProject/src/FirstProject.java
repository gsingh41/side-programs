import java.util.Scanner;

public class FirstProject{
    public static void main(String args[]) {

        double myList[] = {1.0, 2.0, 3.0, 4.0, 5.0};

        double temp = myList[0];

        System.out.print(temp + "\n");
        
        for (int i = 1; i < myList.length; i++) {
            myList[i - 1] = myList[i];
        }
        
        myList[myList.length - 1] = temp;


        for (double e :
                myList) {
            System.out.println(e);
        }
        
    }
}
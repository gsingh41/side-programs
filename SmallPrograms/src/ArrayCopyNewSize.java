// Just wanted to find out how can I create a new array with increased size
class ArrayCopyNewSize {
    public static void main(String[] args) {

        int[] myList;
        myList = new int[10];

        for (int i = 0; i < myList.length; i++) {
            myList[i] = i;
        }

        System.out.println("Contents of myList");
        for (int e :
                myList) {
            System.out.println(e);
        }

        int[] myList2;
        myList2 = new int[20];

        System.arraycopy(myList, 0, myList2, 0, myList.length);

        System.out.println("Contents of myList2");
        for (int e :
                myList2) {
            System.out.println(e);
        }
    }
}
class ArrayCopyNewSize {
    public static void main(String[] args) {
        int[] myList;

        myList = new int[10];
        //myList[0] = 13;
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

/*        for (int e :
                myList) {
            System.out.println(e);
        }
        System.out.println(myList.length);*/

        System.arraycopy(myList, 0, myList2, 0, myList.length);

        System.out.println("Contents of myList2");
        for (int e :
                myList2) {
            System.out.println(e);
        }
        //System.out.println(myList.length);

    }
}
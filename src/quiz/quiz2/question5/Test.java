package quiz.quiz2.question5;

public class Test {
    public static void main(String[] args) {
        byte[] val = new byte[10];
        int [ ] arr2 = {1,2,3,4,5};
        char [ ] arr1 [ ] = new char [5] [ ];

        //Below declaration were not allowed, because
        //you cannot declare size and data at same time.
        //int [ ] arr3 = new int[3] {10,20,30};
        //Therefore you can split it as whether you want
        //to delcare size or data.
        int [ ] arr3 = new int[3];
        int [ ] arr4 = {10,20,30};

        System.out.println(val);
        System.out.println(arr2);
        System.out.println(arr1);
        System.out.println(arr3);
        System.out.println(arr4);
    }
}

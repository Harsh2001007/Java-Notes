public class Type_conversion {
    public static void main(String[] args){
        int myInt = 5;
        double myDouble = myInt;
        System.out.println(myDouble);

        double myDoubleTwo = 5.0;
        int myIntTwo = (int) myDoubleTwo;
        System.out.println(myIntTwo);
    }
}

// type coversion has two types - widening casting and narrowing casting
// widening casting --> smaller size into larger type ( byte -> short -> char -> int -> long -> float -> double )
// narrowing casting --> larger to smaller type (double -> float -> long -> int -> char -> short -> byte)
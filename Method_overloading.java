public class Method_overloading {
    //muliple methods can have same name with different parameters.

    static int plusNum(int x, int y){
        return x+y;
    }

    static double plusNum(double x, double y){
        return x+y;
    }

    public static void main(String[] args){
       int numOne = plusNum(5,5);
       double numTwo = plusNum(5.1, 2.1);

       System.out.println(numOne);
       System.out.println(numTwo);
    }

}

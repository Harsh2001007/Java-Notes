// Arithmetic operators
// Assignment operators
// Comparison operators
// Logical operators
// Bitwise operators

public class operators {
    public static void main(String[] args){
        int varOne = 5;
        int varTwo = 5;
        int varThree = 6;

        System.out.println(varOne + varTwo);
        System.out.println(varOne - varTwo);
        System.out.println(varOne / varTwo);
        System.out.println(varOne % varTwo);
        System.out.println(varOne * varTwo);
        // System.out.println(++varOne);
        // System.out.println(--varTwo);

        // comparison operator

        System.out.println("comparison operator");
        System.out.println(varOne == varTwo);
        System.out.println(varOne != varTwo);
        System.out.println(varOne < varThree);
        System.out.println(varOne > varThree);
        System.out.println(varOne <= varTwo);

        // logical operator

        System.out.println("logical operators");
        System.out.println(varOne<10 && varTwo<2);
        System.out.println(varOne<10 || varTwo<2);
        System.out.println(!(varOne<10 || varTwo<2));



    }
}

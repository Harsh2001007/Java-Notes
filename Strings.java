public class Strings {
    public static void main(String[] args){
        String strOne = "i am string one";
        String strTwo = "I AM STRING TWO";
        int varThree = 77;
        System.out.println(strOne);

        // length method
        System.out.println(strOne.length());

        //to upper case method
        System.out.println(strOne.toUpperCase());

        // to lower case method
        System.out.println(strTwo.toLowerCase());

        // index of method
        System.out.println(strOne.indexOf("i",5));

        // concat method
        System.out.println(strOne.concat(strTwo));

        // adding string and integer
        System.out.println(strOne + varThree);

        // escape sequence
        System.out.println("i am a \"viking\"");
        System.out.println("its a man\'s promise");
        System.out.println("there is no meaning \n in this life");
    }
}

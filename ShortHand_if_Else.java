/**
 * ShortHand_if_Else
 */
public class ShortHand_if_Else {

    public static void main(String[] args){
        int x = 5;
        int y = 10;
        String strOne = x<10 ? "case one" : "case two";
        System.out.println(strOne);
        String result = (y==10) ? "equal" : "not equal";
        System.out.println(result);
    }
}
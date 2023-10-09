/**
 * Break_Continue
 */
public class Break_Continue {

    public static void main(String[] args){
        for(int i = 0;i<6;i++){
            if(i == 5){
                break;
            }
            System.out.println(i);
        }
        // continue statement ( skips few iterations based on conditions and then continue the further execution )
        System.out.println("continue statement example");
        for (int i = 1; i<10; i++){
            if(i==5 || i<6){
                continue;
            }
            System.out.println(i);
        }
    }
}




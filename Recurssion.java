public class Recurssion {
    public static void main(String[] args){
        int result = sumDigit(2);
        System.out.println(result);
    }

    static int sumDigit(int k){
        if (k>0){
            return k+sumDigit(k-1);
        }
        else{
            return 0;
        }
    }
}

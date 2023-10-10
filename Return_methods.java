public class Return_methods {
    static String myMethod(){
        return "hello";
    }
    static int myMethodTwo(int x){
        return x+5;
    }

    public static void main(String[] args){
        System.out.println(myMethod());
        System.out.println(myMethodTwo(5));
    }
}

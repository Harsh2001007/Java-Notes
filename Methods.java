public class Methods {
    
    //Mehtod with no parameters
    static void myMethod(){
        System.out.println("I am a method");
    }

    //Method with multiple parameters
    static void myMehtodWithParas(String name, int score,boolean status){
        System.out.println("i am "+ name + "my highscore is "+ score + " level status " + status);
    }

    public static void main(String[] args){
        myMethod();
        myMethod();
        myMethod();
        myMethod();
        myMehtodWithParas("harsh ", 7899,true);
    }
}

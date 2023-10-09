public class Arrays_and_methods {
    public static void main(String[] args){
        String[] arrOne = {"hello","HTML","css","JS","React"};
        System.out.println(arrOne);
        
        // Accessing elements in the array.
        System.out.println(arrOne[0]);
        System.out.println(arrOne[1]);
        System.out.println(arrOne[2]);
        System.out.println(arrOne[3]);

        // updating/changing the elements in array.
        arrOne[0] = "Mongo DB";
        System.out.println(arrOne[0]);

        //get length of array using length function.
        System.out.println(arrOne.length);

        //Multi-dimensional arary
        int[][] arrTwo = {{1,2,3},{4,5,6}};
        
        // accessing the elements in 2D array
        System.out.println(arrTwo[0][1]);

        // changing/updating value in 2D array
        arrTwo[1][2] = 777;
        System.out.println(arrTwo[1][2]);

        // looping over the 2D array

        for(int k = 0; k < arrTwo.length; k++){
            for(int j = 0; j < arrTwo[k].length; j++){
                System.out.println(arrTwo[k][j]);
            }
        }
    }
}

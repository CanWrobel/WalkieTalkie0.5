public class Test {
    public static void main(String[] args) {
        int[][] array = {
                {1,2,3},
                {7,8,9}
        };
        print2darray(array);
    }

    public static void print2darray(int[][] array){
        for(int i = 0; i < array.length; i++){
            for(int p = 0; p < array[i].length; p++){
                System.out.print(array[i][p]);
            }
            System.out.println("");
        }
    }
}

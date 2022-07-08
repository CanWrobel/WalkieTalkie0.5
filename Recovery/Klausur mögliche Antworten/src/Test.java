public class Test {
    public static void main(String[] args) {
        int[][] array = {
                {1,2,3},
                {7,8,9}
        };
        print2darraydelbst(array);
    }

    public static void print2darraydelbst(int[][] array){
        for(int i = 0; i < array.length; i++){
            for(int p = 0; p < array[i].length; p++){
                System.out.print(array[i][p]);
            }
            System.out.println("");
        }
    }
    public static void print2darray(int[][] array){
        for(int[] elemA : array){
            for(int[] elemB : array){
                System.out.print(elemB + "\t");
            }
            System.out.println("");
        }
    }
}

import org.w3c.dom.ls.LSOutput;

public class ArraySortierung {
    public static int[] bubblesortIter (int[]array){
        int[] copy = new int[array.length];
        for(int j : copy){
            copy[j] = array[j];
        }
        int speicher1;
        int speicher2;
        int count = copy.length;
        for (int i = 1; i < copy.length; i++){
            for(int j = 0; j < copy.length-i; j++){
                if (copy[j] > copy[j+1]){
                    speicher1 = copy[j];
                    speicher2 = copy[j+1];
                    copy[j] = speicher2;
                    copy[j+1] = speicher1;
                }
            }
        }
        return copy;
    }
    public static void printArray(int[] array){
        System.out.print("[ ");
        for ( int j : array){
            System.out.print(j + " ");
        }
        System.out.println("]");
    }
    public static int[] bubblesortRek(int[] array, int laenge){
        if(laenge == 1) return array;
        int temp;
        for(int i = 0; i < laenge-1; i++){
           if(array[i] > array[i+1]){
               temp = array[i];
               array[i] = array[i+1];
               array[i+1] = temp;
           }
        }
        return bubblesortRek(array, laenge-1);
    }
    public static int[] selektionSortierIter(int[] array){
        int kleinste = array[0];
        for(int i = 1; i < array.length; i++){
            if(array[i] < kleinste){
                kleinste = array[i];
            }
        }
        return array;
    }
}



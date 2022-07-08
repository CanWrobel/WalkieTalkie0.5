public class Bubblesorter {
    public static int[] bubblesortRek(int[] array, int laenge) {
/*        System.out.print("Reingeschmissen: [ ");
        for (int j : array) {
            System.out.print(j + " ");
        }
        System.out.println("]");
*/      if (laenge == 1) return array;
        int temp;
        for (int i = 0; i < laenge - 1; i++) {
            if (array[i] > array[i + 1]) {
                temp = array[i];
                array[i] = array[i + 1];
                array[i + 1] = temp;
            }
        }
        System.out.print("[ ");
        for (int j : array) {
            System.out.print(j + " ");
        }
        System.out.println("]");
        return bubblesortRek(array, laenge - 1);
    }

    public static void main(String[] args) {
        int[] array = {12, 0, 9, 6, 2};
        printArray(bubblesortRek(array, array.length));
    }
    public static void printArray(int[] array) {
            System.out.print("[ ");
            for (int j : array) {
                System.out.print(j + " ");
            }
            System.out.println("]");
        }
}

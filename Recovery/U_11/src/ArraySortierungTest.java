public class ArraySortierungTest {
    public static void main(String[] args) {
        int[] alpha = {10,6,8,7,9,5,4,3,2,1};
        int[] bravo = alpha;
        int[] charlie = alpha;
        ArraySortierung.printArray(alpha);
        ArraySortierung.printArray(ArraySortierung.bubblesortIter(alpha));
        ArraySortierung.printArray(alpha);
        ArraySortierung.printArray(ArraySortierung.bubblesortRek(alpha, alpha.length));
        ArraySortierung.printArray(ArraySortierung.selektionSortierIter(bravo));
        ArraySortierung.printArray(charlie);
    }
}

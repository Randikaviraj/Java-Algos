
public class Main {
    public static void main(String[] args) {
        int[] list = { 15, 13, 3, 11, 6, 1 };
        InsertionSort obj = new InsertionSort(list);

        for (int i : obj.insertionSort()) {
            System.out.println(i);
        }
    }
}
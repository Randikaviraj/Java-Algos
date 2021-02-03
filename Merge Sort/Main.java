public class Main {
    public static void main(String[] args) {
        int[] list = { 15, 13, 3, 11, 6, 1 ,5,75,2,5,45,6,8,3};
        MergeSort.mergeSort(list,0,list.length-1);

        for (int i : list) {
            System.out.println(i);
        }
    }
}
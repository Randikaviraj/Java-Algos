/**
 * Main
 */
public class Main {

    public static void main(String[] args) {
        int[] list = { 15, 13, 3, 11, 6, 1 ,5,75,2,5,45,6,8,3};
        BubleSort obj=new BubleSort(list);

        for (int i : obj.bubleSort()) {
            System.out.println(i);
        }
    }
}
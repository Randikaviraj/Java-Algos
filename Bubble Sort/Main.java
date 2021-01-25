/**
 * Main
 */
public class Main {

    public static void main(String[] args) {
        int[] list={15,13,3,11,6,1};
        BubleSort obj=new BubleSort(list);

        for (int i : obj.bubleSort()) {
            System.out.println(i);
        }
    }
}
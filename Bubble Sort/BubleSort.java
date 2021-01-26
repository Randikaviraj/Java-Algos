/**
 * BubleSort
 */
public class BubleSort {

    private int[] input_list;

    public BubleSort(int[] input_list) {
        this.input_list = input_list;
    }

    public int[] bubleSort() {
        for (int i = 0; i < this.input_list.length; i++) {
            for (int j = 0; j < input_list.length - 1; j++) {
                if (this.input_list[j] > this.input_list[j + 1]) {
                    int temp = this.input_list[j];
                    this.input_list[j] = this.input_list[j + 1];
                    this.input_list[j + 1] = temp;
                }
            }
        }
        return this.input_list;
    }
}
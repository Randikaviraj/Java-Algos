class MergeSort {

    public static void mergeSort(int[] list, int starting, int end) {
        int middle = (starting + end) / 2;
        if (end > starting) {
            mergeSort(list, starting, middle);
            mergeSort(list, middle + 1, end);
            merge(list, starting, middle, end);
        }

    }

    private static void merge(int[] list, int starting, int middle, int end) {
        int[] temp = list.clone();
        int i = starting;
        int j = middle + 1;
        int k ;
        for (k= starting; k < end+1; k++) {
            if(i==middle+1 || j==end+1){
                break;
            }
            if (temp[i]>temp[j]) {
                list[k]=temp[i];
                i++;
            }else{
                list[k]=temp[j];
                j++;
            }
        }

        while (i<middle+1) {
            list[k]=temp[i];
            k++;
            i++;
        }
        while (j<end+1) {
            list[k]=temp[j];
            k++;
            j++;
        }

    }
}
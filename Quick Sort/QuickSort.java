public class QuickSort {
    
    public static void quickSort(int [] list,int start,int end){
        if (start<end) {
            int pivot=partition(list,start,end);
            quickSort(list, start, pivot);
            quickSort(list, pivot+1, end);
        }
        
    }

    private static int partition(int [] list,int start,int end){
        int pivotvalue=list[end-1];
        int i=start;

       for (int j = start; j < end; j++) {
           if (list[j]<pivotvalue) {
               int jval=list[j];
               list[j]=list[i];
               list[i]=jval;
               i++;
           }
       }
       list[end-1]=list[i];
       list[i]=pivotvalue;

       return i;
    }
}

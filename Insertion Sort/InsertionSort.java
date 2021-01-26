
public class InsertionSort{
    private int[] list;

    public InsertionSort(int[] list){
        this.list=list;
    }

    public int[] insertionSort(){
        for (int i = 0; i < this.list.length; i++) {
            for (int j = i; j > 0; j--) {
                if (this.list[j-1]>this.list[j]){
                    int temp=this.list[j-1];
                    this.list[j-1]=this.list[j];
                    this.list[j]=temp;
                }else{
                    break;
                }
           }
        }
        return this.list;
    }
}
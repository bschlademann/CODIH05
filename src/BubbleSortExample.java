public class BubbleSortExample {
    static void bubbleSort(int[] unsorted) {
        int n = unsorted.length;
        int temp = 0;
        for(int i=0; i < n; i++){
            for(int j=1; j < (n-i); j++){
                if(unsorted[j-1] > unsorted[j]){
                    //swap elements
                    temp = unsorted[j-1];
                    unsorted[j-1] = unsorted[j];
                    unsorted[j] = temp;
                }
            }
        }
    }
}

public class QuickSort {
    
    static void swap(int[] ar, int indexFrom, int indexTo) {
        int temp = ar[indexTo];
        ar[indexTo] = ar[indexFrom];
        ar[indexFrom] = temp;
    }
    
    static int partition(int[] ar, int start, int end) {
        int p = ar[end];
        int i = start;
        for(int j = start; j <= end - 1; j++) {
            if(ar[j] <= p) {
                swap(ar, i++, j);
            }
        }
        swap(ar, i, end);
        return i;
    }
    
    static void printArray(int[] ar, int start, int end) {
        for(int i = start; i <= end; i++){
            System.out.print(ar[i]+" ");
        }
        System.out.println("");
    }
    
    static void sort(int[] ar, int start, int end) {
        if(!(start < end)) {
            return;
        }
        int p = partition(ar, start, end);
        sort(ar, start, p - 1);
        sort(ar, p + 1, end);
        printArray(ar, start, end);
    }
}

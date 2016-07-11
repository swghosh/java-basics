class ArraySearch {
    
    int[] n;
    int ele;
    
    ArraySearch(int[] n, int ele) {
        this.n = n;
        this.ele = ele;
    }

    int binarySearch(int l, int u) {
        int mid = (l + u) / 2;
        if(n[mid] == ele) return mid;
        else if(l == u) return -1;
        else if(n[mid] > ele) return binarySearch(l, mid - 1);
        else if(n[mid] < ele) return binarySearch(mid + 1, u);
        return -1;
    }
    
}
public class SelectionSort {  
    public void selectionSort(int[] arr) {  
        int len = arr.length;  
        for (int i = 0; i < len - 1; i++) {  
            int minDex = i;  
            for (int y = i + 1; y < len; y++) {  
                if (arr[y] < arr[minDex]) {  
                    minDex = y;  
                }  
            }  
            int temp = arr[minDex];  
            arr[minDex] = arr[i];  
            arr[i] = temp;  
        }  
    }  
    public void selectionSortBack(int[] arr) {  
        int len = arr.length;  
        for (int i = len-1; i >= 0; i--) {  
            int maxIndex = i;  
            for (int y = i - 1; y >= 0; y--) {  
                if (arr[y] < arr[maxIndex]) {  
                    maxIndex = y;  
                }  
            }  
            int temp = arr[maxIndex];  
            arr[maxIndex] = arr[i];  
            arr[i] = temp;  
        }  
    }  
}  
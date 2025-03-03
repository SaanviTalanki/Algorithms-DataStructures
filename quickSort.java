public class QuickSort
{
    public static void quickSort(int[] arr, int low, int high)
    {
        if (low < high)
        {               
            int pivot = arr[high];      
            int loc = low - 1;
    
            for (int z= low; z < high; z++) 
            {   
                if (arr[z] < pivot)
                {            
                    loc++;                         
                    int temp = arr[loc];         
                    arr[loc] = arr[z];
                    arr[z] = temp;
                }
            }
    
            int temp = arr[loc + 1];
            arr[loc + 1] = arr[high];
            arr[high] = temp;
    
            int pivotIndex = loc + 1;
    
            quickSort(arr, low, pivotIndex - 1);  
            quickSort(arr, pivotIndex + 1, high);  
        }
    }   
}


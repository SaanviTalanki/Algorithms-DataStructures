public class mergeSort
{
    public void mergeSort(int[] arr, int len)
    {
      len = arr.length;
      if (len < 2)
      {
          return;
      }
      int mid = len/2;
      int[] lower = new int[mid];
      int[] upper = new int[len-mid];
      for(int i=0; i <= mid-1; i++)
      {
          lower[i] = arr[i];
      }
      for(int k=mid; k < len; k++)
      {
          lower[k] = arr[k];
      }
      mergeSort(lower, mid);
      mergeSort(upper, len - mid);
    }
    public void merge(int[] arr, int[] lower, int[] upper, int left, int right)
    {
        int i = 0;
        int j = 0;
        int k = 0;
        while (i < left && j < right)
        {
            if (lower[i] <= upper[j])
            {
                
            }
        }
    }
}
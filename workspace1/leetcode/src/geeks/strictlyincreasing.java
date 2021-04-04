package geeks;

class strictlyincreasing
{
    static int arr[] = new int[]{1, 2, 2, 4};
     
    static int countIncreasing(int n)
    {
        // Initialize count of subarrays as 0
        int cnt = 0;
      
        // Pick starting point
        for (int i=0; i<n; i++)
        {
            // Pick ending point
            for (int j=i+1; j<n; j++)
            {
                if (arr[j] > arr[j-1])
                    cnt++;
      
                // If subarray arr[i..j] is not strictly 
                // increasing, then subarrays after it , i.e., 
                // arr[i..j+1], arr[i..j+2], .... cannot
                // be strictly increasing
                else
                    break;
            }
        }
        return cnt;
    }
    // Driver method to test the above function
    public static void main(String[] args) 
    {
        System.out.println("Count of strictly increasing subarrays is " + 
                                               countIncreasing(arr.length));
    }
}
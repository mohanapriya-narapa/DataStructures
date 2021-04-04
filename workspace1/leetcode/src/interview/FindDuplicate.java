package interview;

class FindDuplicate
{
    public static int printRepeating(int arr[], int size)
    {
        int i;  int count=0;
        System.out.println("The repeating elements are : ");
    
        for (i = 0; i < size; i++)
        {
            if (arr[Math.abs(arr[i])] >= 0)
                arr[Math.abs(arr[i])] = -arr[Math.abs(arr[i])];
            else
                //System.out.print(Math.abs(arr[i]) + " ");
            	count++;
        }  return (arr.length-count);       
    } 
 
    /* Driver program to test the above function */
    public static void main(String[] args) 
    {
        FindDuplicate duplicate = new FindDuplicate();
        int arr[] = {4, 2, 4, 5, 2, 3, 1};
        int arr_size = arr.length;
       System.out.println(duplicate.printRepeating(arr, arr_size)); 
    }
}
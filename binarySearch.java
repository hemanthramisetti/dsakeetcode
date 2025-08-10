



public class binarySearch {
    public static void main(String args[])
    {
     int arr[]={1,2,3,4,5,6,7,8,9,10};
     int target=10;
     int index=binarySearch(arr,target);
     if(index!=-1)
     {
        System.out.println("ef\n"+index);
     }
     else
     {
        System.out.println("NF");
     }


        
    }
    public static int binarySearch(int arr[],int target)
    {
        int start=0;
        int end=arr.length-1;
        while(start<=end)
        {
            int mid=start+(end-start)/2;
            if(arr[mid]==target)
            {
                return mid;
            }
            else if(target<arr[mid])
            {
                end=mid-1;
            }
            else
            {
                start=mid+1;
            }
           

         }
         return -1;
        
    }


}   


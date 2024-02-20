class Solution
{
    //Function to find a continuous sub-array which adds up to a given number.
    static ArrayList<Integer> subarraySum(int[] arr, int n, int s) 
    {
        // Your code here
        ArrayList<Integer> a1 = new ArrayList<Integer>();
        boolean found=false;
        int st = 0; int end=0;
        int sum=0;
        for(int i=0; i<n; i++)
        {
            sum+=arr[i];
            if(sum>=s)
            {
                end=i;
                while(s<sum && st<end)
                {
                    sum-=arr[st++];
                }
            }
            if(sum==s)
            {
                a1.add(st+1); a1.add(end+1);
                found=true;
                break;
            }
        }
        if(!found)
        a1.add(-1);
        
        return a1;
    }
}
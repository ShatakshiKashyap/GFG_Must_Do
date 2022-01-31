package Array;

import java.util.ArrayList;

public class subarrayWithGivenSum {
    /*Given an unsorted array A of size N that contains only non-negative integers,
     find a continuous sub-array which adds to a given number S.
     complete the function subarraySum() which takes arr, N and S as
     input parameters and returns a list containing the starting and ending positions
     of the first such occurring subarray from the left where sum equals to S. The two indexes in the list
     should be according to 1-based indexing. If no such subarray is found, return an array consisting
     only one element that is -1.*/
    public ArrayList<Integer> subArraySum(int []arr, int n, int s) {
        int start=0,i=0,curr_sum=arr[0];
        for(i=1;i<=n;i++){
            while(curr_sum>s && start<n)
                curr_sum-=arr[start++];

            if(curr_sum==s) break;

            if(i<n)
                curr_sum+=arr[i];
        }
        ArrayList<Integer> res=new ArrayList<>();
        if(curr_sum!=s) res.add(-1);
        else{
            res.add(start+1);
            res.add(i);
        }
        return res;
    }
    public static void main(String[] args) {
        subarrayWithGivenSum ob=new subarrayWithGivenSum();
        int[] testArr1={1,2,3,7,5};
        int[] testArr2={1,2,3,4,5,6,7,8,9,10};
        System.out.println(ob.subArraySum(testArr1,5,12));
        System.out.println(ob.subArraySum(testArr2,10,15));
        System.out.println(ob.subArraySum(testArr2,10,150));
    }
}

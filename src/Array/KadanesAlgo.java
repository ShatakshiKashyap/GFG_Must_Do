package Array;

public class KadanesAlgo {
    /*Given an array Arr[] of N integers. Find the contiguous sub-array(containing at least one number)
      which has the maximum sum and return its sum.*/

    public long maxSubarraySum(int[] arr,int n){
        long max_Sum=Integer.MIN_VALUE,sum=0;
        for(int i=0;i<arr.length;i++){
            sum+=arr[i];
            max_Sum=Math.max(sum,max_Sum);
            if(sum<0)
                sum=0;
        }
        return max_Sum;
    }
    public static void main(String[] args) {
        KadanesAlgo ob=new KadanesAlgo();
        int[] test1={1,2,3,-2,5};
        int[] test2={-1,-2,-3,-4};
        System.out.println(ob.maxSubarraySum(test1,5));
        System.out.println(ob.maxSubarraySum(test2,4));
    }
}

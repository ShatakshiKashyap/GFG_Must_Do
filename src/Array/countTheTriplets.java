import java.util.Arrays;

public class countTheTriplets {
    /*Given an array of distinct integers. The task is to count all
     the triplets such that sum of two elements equals the third element.*/
    public boolean BinSearch(int[] arr, int n, int low, int high,int target){
        while(low<=high){
            int mid=(high+low)/2;
            if(arr[mid]==target)
                return true;
            else if(target<arr[mid])
                high=mid-1;
            else
                low=mid+1;
        }
        return false;
    }
    public int countTriplets(int[] arr,int n){
        int count=0;
        Arrays.sort(arr);
        for(int i=0;i<n;i++){
            for(int j=i+1;j<n;j++){
                if(BinSearch(arr,n,j,n-1,arr[i]+arr[j]))
                    count++;
            }
        }
        return count;
    }
    public static void main(String[] args) {
        int[] testArr1={1, 5, 3, 2};
        int[] testArr2={2, 3, 4};
        countTheTriplets ob=new countTheTriplets();
        System.out.println(ob.countTriplets(testArr1,4));
        System.out.println(ob.countTriplets(testArr2,3));
    }
}

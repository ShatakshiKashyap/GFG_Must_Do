package Array;

public class EquilibriumPoint {
    public int findEquilibriumPoint(long[] arr,int n){
        if(n==1) return 1;
        long[] prefixSum=new long[n];
        long[] suffixSum=new long[n];
        prefixSum[0]=arr[0];
        suffixSum[n-1]=arr[n-1];
        for(int i=1;i<n;i++)
            prefixSum[i]=prefixSum[i-1]+arr[i];
        for(int i=n-2;i>=0;i--)
            suffixSum[i]=suffixSum[i+1]+arr[i];

        for(int i=1;i<n-1;i++){
            if(prefixSum[i-1]==suffixSum[i+1])
                return i+1;
        }
        return -1;
    }
    public static void main(String[] args) {
        long[] testArr1={1,3,5,2,2};
        long[] testArr2={1,3,5,5,2,2};
        long[] testArr3={1};
        EquilibriumPoint ob=new EquilibriumPoint();
        System.out.println(ob.findEquilibriumPoint(testArr1,5));
        System.out.println(ob.findEquilibriumPoint(testArr2,6));
        System.out.println(ob.findEquilibriumPoint(testArr3,1));
    }
}

package Array;

public class findMissingNumber {
    /*Given an array of size N-1 such that it only contains distinct integers
     in the range of 1 to N. Find the missing element.*/

    public int missingNumber(int[] arr,int n){
        int currSum=0,sumUptoN=0;

        sumUptoN=n*(n+1)/2;

        for(int a : arr)
            currSum+=a;

        return sumUptoN-currSum;
    }
    public static void main(String[] args) {
        int[] testArr1={1,2,3,5};
        int[] testArr2={6,1,2,8,3,4,7,10,5};
        findMissingNumber ob=new findMissingNumber();

        System.out.println(ob.missingNumber(testArr1,5));
        System.out.println(ob.missingNumber(testArr2,10));
    }
}

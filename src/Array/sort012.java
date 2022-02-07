public class sort012 {
    public static void sort(int[] arr,int n){
        int start=0;
        for(int i=0;i<=1;i++){
            for(int j=start;j<n;j++){
                if(arr[j] == i){
                    int temp=arr[start];
                    arr[start++]=arr[j];
                    arr[j]=temp;
                }
            }
        }
    }
    public static void main(String[] args) {
        int[] testArr1 = {0,2,1,2,0};
        int[] testArr2 = {0,1,0};
        sort(testArr1,5);
        sort(testArr2,3);

        for(int n:testArr1)
            System.out.print(n+" ");
        System.out.println();
        for(int n:testArr2)
            System.out.print(n+" ");
    }
}

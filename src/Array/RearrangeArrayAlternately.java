import java.util.Arrays;
import java.util.Collections;
import java.util.Objects;

public class RearrangeArrayAlternately {
    public static void rearrange(int[] arr,int n){
        int min_idx=0,max_idx=n-1,max_elem=arr[n-1]+1;

        for(int i=0;i<n;i++){
            if(i%2==0){
                arr[i]+=(arr[max_idx]%max_elem)*max_elem;
                max_idx--;
            }
            else{
                arr[i]+=(arr[min_idx]%max_elem)*max_elem;
                min_idx++;
            }
        }
        for(int i=0;i<n;i++)
            arr[i]=arr[i]/max_elem;
    }
    public static void main(String[] args) {
        int[] testArr1={1,2,3,4,5,6};
        int[] testArr2={10,20,30,40,50,60,70,80,90,100,110};

        rearrange(testArr1,6);
        rearrange(testArr2,11);

        for(int n:testArr1)
            System.out.print(n+" ");
        System.out.println();
        for(int n:testArr2)
            System.out.print(n+" ");
    }
}

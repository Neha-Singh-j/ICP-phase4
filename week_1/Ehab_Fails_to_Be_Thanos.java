package ICP_2026.week_1;
import java.util.*;
public class Ehab_Fails_to_Be_Thanos {
    public static void main(String[] args){
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();
        int[] arr=new int[2*n];
        int sum=0;
        int curr=0;
        for(int i=0;i<2*n;i++){
            arr[i]=sc.nextInt();
            if(i<n){
                curr+=arr[i];
            }
            sum+=arr[i];
        }
        sc.close();
        if(sum-curr==curr){
            for(int i=0;i<n;i++){
                if(arr[i]!=arr[n+i]){
                    int temp=arr[n+i];
                    arr[n+i]=arr[i];
                    arr[i]=temp;
                    curr-=arr[i];
                    curr+=arr[n+i];
                }else{
                    continue;
                }
            }
        }
        if(sum-curr==curr){
            System.out.println(-1);
            return;
        }
        System.out.println(arr);
        
    }
}

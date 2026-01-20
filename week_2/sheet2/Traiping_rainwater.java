package week_2.sheet2;

public class Traiping_rainwater {
    public static void main(String[] args){
        int[] arr={0,1,0,2,1,0,1,3,2,1,2,1};
        System.out.println(trap(arr));
    }
     public static int trap(int[] height) {
        int n=height.length;
        if(n==0) return 0;
        int[] l=new int[n];
        int[] r=new int[n];
        int mleft=height[0];
        for(int i=0;i<n;i++){
            mleft=Math.max(height[i],mleft);
            l[i]=mleft;
        }
        int mright=height[n-1];
         for(int i=n-1;i>=0;i--){
            mright=Math.max(height[i],mright);
            r[i]=mright;
        }
        int sum=0;
        for(int i=0;i<n;i++){
            int h=Math.min(r[i],l[i])-height[i];
            sum+=h;
        }
        return sum;
        
    }
}

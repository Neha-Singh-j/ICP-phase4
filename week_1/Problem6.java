package ICP_2026.week_1;
import java.util.*;
public class Problem6 {
    public static void main(String[] args) {
        Problem6 obj = new Problem6();

        int[] nums = {3, 4, -1, 1};

        int ans = obj.firstMissingPositive(nums);
        System.out.println(ans);
    }
    public int firstMissingPositive(int[] nums) {
        int n=nums.length;
        //unique values are there
        HashSet<Integer> set=new HashSet<>();
        for(int i=0;i<n;i++){
            if(nums[i]>0){ //we have to find first posiitve 
                set.add(nums[i]);
            }
        }
        int i=1;
        while(true){
            if(!set.contains(i)) return i;
            i++;
        }
    }
}

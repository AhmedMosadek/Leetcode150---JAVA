import java.util.Arrays;
import java.util.HashSet;
import java.util.Set;

public class MinIncrementForUnique {
    public static void main(String[] args) {
        int[] A = {3,2,1,2,1,7};
        System.out.println(minIncrementForUnique(A));
    }

    public static int minIncrementForUnique(int[] nums){
        Arrays.sort(nums);
        int moves = 0;
        for(int i =1;i<nums.length;i++){
            if(nums[i]<=nums[i-1]){
                moves+=((nums[i-1]-nums[i])+1);
                nums[i]= nums[i-1]+1;
            }
        }
        return moves;
    }
}

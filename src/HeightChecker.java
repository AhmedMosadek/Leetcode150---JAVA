import java.util.Arrays;

public class HeightChecker {
    public static void main(String[] args) {
        int[] heights = {1,1,4,2,1,3};
        System.out.println(new HeightChecker().heightChecker(heights));
    }
    public int heightChecker(int[] heights){
        int[] sortedArr = heights.clone();
        Arrays.sort(sortedArr);
        int count = 0;
        for(int i=0; i<heights.length; i++){
            if(heights[i] != sortedArr[i]){
                count++;
            }
        }
        return count;
    }
}

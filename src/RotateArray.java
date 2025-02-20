public class RotateArray {
    public void rotate(int[] nums, int k) {
        int[] newNum = new int[nums.length];

    }
    public static void main(String[] args) {
        int[] nums = {1,2,3,4,5,6,7};
        int k = 3;
        RotateArray ra = new RotateArray();
        ra.rotate(nums, k);
        for (int num : nums) {
            System.out.print(num + " ");
        }
    }
}

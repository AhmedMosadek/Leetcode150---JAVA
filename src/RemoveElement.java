public class RemoveElement {
    public int removeElement(int[] nums, int val) {
        int count=0;
        for(int i=0; i<nums.length; i++) {
            if(nums[i] != val) {
                nums[count++] = nums[i];
            }
        }
        return count;
    }

    public static void main(String[] args) {
        RemoveElement re = new RemoveElement();
        int[] nums = {3,2,2,3};
        int val = 3;
        System.out.println(re.removeElement(nums, val));
    }
}

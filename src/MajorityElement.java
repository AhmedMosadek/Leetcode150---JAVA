public class MajorityElement {
    public int majorityElement(int[] nums) {
        int candidate=nums[0];
        int votes=0;
        for (int num : nums) {
            if (votes == 0) {
                candidate = num;
            }
            if (candidate == num) {
                votes++;
            } else {
                votes--;
            }
        }
        return candidate;
    }
    public static void main(String[] args) {
        int[] nums = {1,1,1,1,2,1,1,2,2,2,1,2};
        MajorityElement me = new MajorityElement();
        System.out.println(me.majorityElement(nums));
    }
}

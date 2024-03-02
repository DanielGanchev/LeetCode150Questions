public class Solution {

  public static void main(String[] args) {
    Solution solution = new Solution();
    int[] nums = {2,3,1,1,4};
    boolean result = solution.canJump(nums);
    System.out.println(result);
  }

  public boolean canJump(int[] nums) {
    int max = 0;
    for (int i = 0; i < nums.length; i++) {
      if (i > max) {
        return false;
      }
      max = Math.max(max, i + nums[i]);
    }
    return true;
  }

}

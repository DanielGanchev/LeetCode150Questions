public class Solution {

public static void main(String[] args) {
  Solution solution = new Solution();
  int[] nums = {2,3,1,1,4};
  int result = solution.jump(nums);
  System.out.println(result);
  }

  public int jump(int[] nums) {

    if (nums.length == 1) {
      return 0;
    }

    if (0  + nums[0]  >= nums.length - 1) {
      return 1;
    }
    int jumps = 0;
    int currentJumpEnd = 0;
    int farthest = 0;
    for (int i = 0; i < nums.length - 1; i++) {
      farthest = Math.max(farthest, i + nums[i]);
      if (i == currentJumpEnd) {
        jumps++;
        currentJumpEnd = farthest;
      }
    }
    return jumps;

  }

}

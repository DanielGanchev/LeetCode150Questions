import java.util.Arrays;

public class Solution {

  public static void main(String[] args) {
    Solution solution = new Solution();
    int[] nums = {0,0,1,1,1,2,2,3,3,4};
    int result = solution.removeDuplicates(nums);
    System.out.println(result);

    System.out.println( Arrays.toString(nums));
  }

  public int removeDuplicates(int[] nums) {
    int i = 0;

    for (int j = 1; j < nums.length; j++) {
      if (nums[j] != nums[i]) {
        i++;
        nums[i] = nums[j];
      }
    }

    return i + 1;

  }
}


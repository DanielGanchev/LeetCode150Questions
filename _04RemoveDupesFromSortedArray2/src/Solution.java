import java.util.Arrays;

public class Solution {

  public static void main(String[] args) {
    Solution solution = new Solution();
    int[] nums = {0,0,1,1,1,1,2,3,3};
    int result = solution.removeDuplicates(nums);
    System.out.println(result);

    System.out.println( Arrays.toString(nums));
  }

  public int removeDuplicates(int[] nums) {
if (nums.length < 3){
  return nums.length;
}
    int i = 0;
    int count = 1;
    for (int j = 1; j < nums.length; j++) {
      if (nums[j] == nums[i]) {
        if (count < 2) {
          i++;
          nums[i] = nums[j];
          count++;
        }
      } else {
        i++;
        nums[i] = nums[j];
        count = 1;
      }
    }

    return i + 1;

  }
}


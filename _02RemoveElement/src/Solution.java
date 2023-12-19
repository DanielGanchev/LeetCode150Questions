import java.util.Arrays;

public class Solution {

  public static void main(String[] args) {
    Solution solution = new Solution();
    int[] nums = {0,1,2,2,3,0,4,2};
    int val = 2;
    int result = solution.removeElement(nums, val);
    System.out.println("After removing " + val + ", the length of the array is: " + result);

    System.out.println("The array after removal is: " + Arrays.toString(nums));
  }

  public int removeElement(int[] nums, int val) {

    int i = 0;
    for (int j = 0; j < nums.length; j++) {
      if (nums[j] != val) {
        int temp = nums[i];
        nums[i] = nums[j];
        nums[j] = temp;
        i++;
      }
    }
    return i;
  }
  }


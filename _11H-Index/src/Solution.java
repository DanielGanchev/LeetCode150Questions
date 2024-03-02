public class Solution {

  public static void main(String[] args) {
    Solution solution = new Solution();
    int[] citations = {3,0,6,1,5};
    int result = solution.hIndex(citations);
    System.out.println(result);
  }

  public int hIndex(int[] citations) {
    int n = citations.length;
    int[] buckets = new int[n + 1];
    for (int c : citations) {
      if (c >= n) {
        buckets[n]++;
      } else {
        buckets[c]++;
      }
    }
    int count = 0;
    for (int i = n; i >= 0; i--) {
      count += buckets[i];
      if (count >= i) {
        return i;
      }
    }
    return 0;
  }

}

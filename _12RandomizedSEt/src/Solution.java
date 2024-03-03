public class Solution {

  public static void main(String[] args) {


    RandomizedSet randomizedSet = new RandomizedSet();
    randomizedSet.insert(1);
    randomizedSet.remove(2);
    randomizedSet.insert(2);
    randomizedSet.getRandom();
    randomizedSet.remove(1);
    System.out.println(randomizedSet.insert(2));
    System.out.println(randomizedSet.getRandom());






  }

}

import java.util.ArrayList;

import java.util.HashMap;


import java.util.Map;
import java.util.Random;

public class RandomizedSet {
  private ArrayList<Integer> list;
  private Map<Integer, Integer> mapWithIndexes;

  public RandomizedSet() {
    list =new ArrayList<>();
    mapWithIndexes =new HashMap<>();
  }

  public boolean insert(int val) {
    if(mapWithIndexes.containsKey(val)){
      return false;
    }

    list.add(val);
    mapWithIndexes.put(val,list.size() -1);
    return true;
  }

  public boolean remove(int val) {
    if(!(mapWithIndexes.containsKey(val))){
      return false;
    }


    int i = mapWithIndexes.get(val);
    list.set(i,list.get(list.size()-1));
    mapWithIndexes.put(list.get(i),i);
    list.remove(list.size()-1);
    mapWithIndexes.remove(val);

    return true;
  }

  public int getRandom() {
    Random random = new Random();

    return list.get(random.nextInt(list.size()));
  }
}

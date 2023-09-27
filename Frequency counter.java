import java.util.*;
public class Main{
  public static void main(String args[]){
    int[] arr={3,4,3,5,4,2};
    HashMap<Integer,Integer> frequencyMap=new HashMap<>();
    for(int ele:arr){
      if(frequencyMap.containsKey(ele)){
        frequencyMap.put(ele,frequencyMap.get(ele)+1);
      }
      else{
        frequencyMap.put(ele,1);
      }
    }
    System.out.println(frequencyMap);
  }
}
  

import java.util.*;
public class Main{
	public static void main(String[] args){
	    ArrayList<String> str=new ArrayList<>();
	    str.add("apple");
	    str.add("banana");
	    str.add("cherry");
	    str.add("apple");
	    str.add("banana");
	    str.add("date");
	    findDuplicates(str);
	}
	public static void findDuplicates(ArrayList<String> list){
	    HashSet<String> uniqueEle=new HashSet<>();
	    HashSet<String> duplicates=new LinkedHashSet<>();
	    for(String ele:list){
	        if(!uniqueEle.add(ele)){
	            duplicates.add(ele);
	        }
	    }
	    System.out.println(duplicates);
	}
}

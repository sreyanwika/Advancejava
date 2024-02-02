package Mod3;
import java.util.*;
public class map {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
    Map<String,Integer> a=new HashMap<String,Integer>();
    a.put("orange", 14);
    a.put("apple", 10);
    a.put("mango", 13);
    a.put("dragon", 17);
    a.put("kiwi", 19);
    Set<Map.Entry<String,Integer>> b=a.entrySet();
    for(Map.Entry<String,Integer> str:b) {
    	System.out.println("the keys and values are:");
    	System.out.println("key:"+str.getKey());
    	System.out.println("value:"+str.getValue());
    }
	}

}

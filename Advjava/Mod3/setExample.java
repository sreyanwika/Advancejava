package Mod3;
import java.util.*;
public class setExample {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		 // Create a set of integers
        HashSet<Integer> a = new HashSet<Integer>();
        a.addAll(Arrays.asList(new Integer[]{1,2,3,4,5,6,10}));

        Set<Integer> b = new HashSet<Integer>();
        b.addAll(Arrays.asList(new Integer[] {1,4,2,23,5,34,6,60}));

        //to find union
        Set<Integer> union = new HashSet<Integer>(a);
        union.addAll(b);
        System.out.println("Union: " + union);

        // to find intersection
        Set<Integer> intersection = new HashSet<Integer>(a);
        intersection.retainAll(b);
        System.out.println("Intersection: " + intersection);

        // to find symmetric difference
        Set<Integer> difference = new HashSet<Integer>(a);
        difference.removeAll(b);
        System.out.println("Difference: " + difference);

	}

}

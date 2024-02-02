package Mod3;
import java.util.*;
public class set {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		HashSet<Integer> a=new HashSet<Integer>();
		a.addAll(Arrays.asList(new Integer[] {1,2,3,4,5,6,10}));
		HashSet<Integer> b=new HashSet<Integer>();
		b.addAll(Arrays.asList(new Integer[] {1, 3, 7, 5, 4, 0, 7, 5}));
		Set<Integer> union=new HashSet<Integer>(a);
		union.addAll(b);
		System.out.println("the union of two sets:"+union);
		Set<Integer> intersection=new HashSet<Integer>(a);
		intersection.retainAll(b);
		System.out.println("the intersection of two sets:"+intersection);
		Set<Integer> diff=new HashSet<Integer>(a);
		diff.removeAll(b);
		System.out.println("the diff of two sets:"+diff);

	}

}

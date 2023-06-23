package add;
import java.util.*;
public class GfG {
public static void main(String[] args){
       List<Integer> l = new LinkedList<>();
		l.add(10);
		l.add(20);
		l.add(30);
        l.add(90); 
        l.add(10);
		l.add(10);
		l.add(40);
        l.add(50); 
		System.out.println(l);
		ArrayList<Integer> arr = new ArrayList<Integer>();
		arr.add(10);
		arr.add(20);
		arr.add(30);
        arr.add(90);
		arr.add(10);
		arr.add(10);
        arr.add(10);
        arr.add(50);
       arr.add(60); 
		System.out.println(arr);
            l.addAll(arr);
         System.out.println(l);
	}
}

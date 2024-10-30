package set;

import java.util.LinkedHashSet;
import java.util.Set;
import java.util.TreeSet;

public class HashSetTest {

	public static void main(String[] args) { //mais rápido mas não garante ordem
		
		Set<String> set = new LinkedHashSet<>();
		
		set.add("Tv");
		set.add("Tablet");
		set.add("Notebook");
		
		set.removeIf(x -> x.length() >= 3);
		
		for (String p : set) {
		System.out.println(p);
		}
	}

}

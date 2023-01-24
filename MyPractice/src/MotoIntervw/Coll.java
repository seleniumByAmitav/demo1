package MotoIntervw;

import java.io.Reader;
import java.util.Collection;
import java.util.HashMap;
import java.util.HashSet;
import java.util.LinkedHashSet;
import java.util.LinkedList;
import java.util.Properties;

public class Coll {

	public static void main(String[] args) {
	LinkedHashSet<String> h=new LinkedHashSet<>();
	h.add("bye");
	h.add("byeeee");
	h.add("hii");
	int si = h.size();
	System.out.println(si);
	for(String s:h)
	{
		System.out.println(s);
	}
	}

}

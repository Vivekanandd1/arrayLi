package arrayList;

import java.util.ArrayList;

import org.junit.After;
import org.junit.Before;
import org.junit.Test;

public class ARRAYCASES {
	
	@Test
	
	public void lenth() {
		
		String[] dogs = {"Pitbull", "Poodle", "Lab", "Pug"};
		System.out.println("length is  " +dogs.length);
		System.out.println(dogs[2]);
	}
	
	@After
	
	public void size() {
		
		ArrayList<String> ar = new ArrayList<String>();
		ar.add("udit");
		ar.add("pulsar");
		ar.add("vivek");
		ar.add("bajaj");
		
		//System.out.println("lambai is " +ar.length); 
        System.out.println("size is "  +ar.size());
		System.out.println(ar.contains("ivek"));
		System.out.println(ar);
		
	}
	@Before
	public void twodimensional() {
	
		int[][]	a = {{1,2,3},{4,5,6}};
		
		System.out.println(a[1][1]);
		System.out.println("-------------------");
		System.out.println(a[0][0]);
		System.out.println(a[0].length);
		
		}
	
	public void legthsize() {
		
		int[] a = new int[5];
		int[] b = {1,2,4,5,5};
		
		//System.out.println(a.size());
     	System.out.println(b.length);
		
		
		
	}

}



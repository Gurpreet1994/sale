package Circumfrence;

import static org.junit.Assert.*;

import org.junit.After;
import org.junit.Before;
import org.junit.Test;

public class AlgebraTest {
  Algebra obj ;
 int x, y, z;
	@Before
	public void setUp() throws Exception {
		obj = new Algebra();
		 x = 1000;
		 y = 10;
		 z = 2;
		  
		
				
	}

	@After
	public void tearDown() throws Exception {
		obj = null;
		x= 0;
		y= 0;
		z=0;
		
			
	}


@Test
public void testAlgebra() {
	assertEquals(1008,obj.algebra(x,y,z));
}

@Test
public void testInterest() {
	assertEquals(200,obj.interest(x,y,z),0.1);
	
}

@Test
public void testCircumfrence() {
	assertEquals(2020,obj.circumfrence(x,y));
	
}

}


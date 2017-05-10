import static org.junit.Assert.*;

import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.Test;
import org.junit.runners.parameterized.*;

public class SerioTest {
	
	@Test
	public void testSerio1(){
		Serio test = new Serio();
		assertEquals(6,Serio.serio(1, 2, 3));
		System.out.println("0");
	}
	@Test
	public void testSerio2(){
		Serio test = new Serio();
		assertEquals(1,Serio.serio(1, 2, 2));
		System.out.println("1");
	}
	@Test
	public void testSerio3(){
		Serio test = new Serio();
		assertEquals(2,Serio.serio(1, 2, 1));
		System.out.println("2");
	}
	@BeforeClass
	public void testSerio4(){
		Serio test = new Serio();
		assertEquals(3,Serio.serio(2, 2, 3));
		System.out.println("3");
	}
	@Test
	public void testSerio5(){
		Serio test = new Serio();
		assertEquals(0,Serio.serio(1, 1, 1));
		System.out.println("4");
	}
}

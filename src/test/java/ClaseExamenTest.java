import static org.junit.jupiter.api.Assertions.assertEquals;

import java.util.ArrayList;
import java.util.List;

import org.junit.Test;

public class ClaseExamenTest {
	
	ClaseExamen claseExamen=new ClaseExamen();
	
	
	@Test
	public void test1() throws Exception {
		int n=6;
		List<Integer>result= new ArrayList<Integer>();
		result.add(2);result.add(3);
		assertEquals(result,ClaseExamen.primos(n));
	}
	
	@Test
	public void test2() throws Exception {
		int n=13;
		List<Integer>result= new ArrayList<Integer>();
		result.add(13);
		assertEquals(result,ClaseExamen.primos(n));
	}
	
	@Test
	public void test3() throws Exception {
		int n=25;
		List<Integer>result= new ArrayList<Integer>();
		result.add(5);result.add(5);
		assertEquals(result,ClaseExamen.primos(n));
	}
}

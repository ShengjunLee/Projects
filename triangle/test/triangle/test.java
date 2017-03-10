package triangle;
import static org.junit.Assert.*;
import org.junit.After;
import org.junit.Before;
import org.junit.Test;
public class test {
@Before
	public void setUp() {
        System.out.println("---begin test---");
    }
	 @Test
	    public void test1() {
	        triangle tri = new triangle();
	        assertEquals(true,tri.equilateral(3,3,3));
	    }

	 @Test
	    public void test111() {
	        triangle tri = new triangle();
	        assertEquals(true,tri.equilateral(4,4,4));
	    }
	 @Test
	    public void test2() {
	        triangle tri = new triangle();
	        assertEquals(true,tri.isosceles(3,3,5));
	    }
	 @Test
	    public void test22() {
	        triangle tri = new triangle();
	        assertEquals(true,tri.isosceles(3,3,5));
	    }
	 @Test
	    public void test222() {
	        triangle tri = new triangle();
	        assertEquals(true,tri.isosceles(3,3,5));
	    }
	 @Test
	    public void test3() {
	        triangle tri = new triangle();
	        assertEquals(true,tri.scalene(3,43,5));
	    }
	 @Test
	    public void test33() {
	        triangle tri = new triangle();
	        assertEquals(true,tri.scalene(3,43,5));
	    }
	 @Test
	    public void test333() {
	        triangle tri = new triangle();
	        assertEquals(true,tri.scalene(3,422,5));
	    }
 @After
	    public void tearDown() {
	        System.out.println("---end test---");
	    }
	
	
}

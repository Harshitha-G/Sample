import static org.junit.Assert.*;
import org.junit.Test;
public class SampleTest {
	@Test
  	public void SampleTestImpl() {
		// TODO Auto-generated method stub
		  Sample tester = new Sample(); // MyClass is tested
          // assert statements
		  String S1= "hello world";
          assertEquals(S1,tester.Hello());
	}

}

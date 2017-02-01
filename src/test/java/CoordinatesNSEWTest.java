import org.junit.Assert;
import org.junit.Test;

public class CoordinatesNSEWTest {

	@Test
	public void CoordinatesNSEW() {
		CoordinatesNSEW underTest = new CoordinatesNSEW();// arrange
		String result = underTest.findDirection("0,0,1,5");// act
		Assert.assertEquals("NE", result); // assert
	}

	@Test
	public void CoordinatesNSEW2() {
		CoordinatesNSEW underTest = new CoordinatesNSEW();// arrange
		String result = underTest.findDirection("12,13,12,13");// act
		Assert.assertEquals("Here", result); // assert
	}
	@Test
	public void CoordinatesNSEW3() {
		CoordinatesNSEW underTest = new CoordinatesNSEW();// arrange
		String result = underTest.findDirection("-1,0,-2,6");// act
		Assert.assertEquals("NE", result); // assert
	}
}


import static org.junit.Assert.*;
import org.junit.*;

public class ArrayTests {
	@Test 
	public void testReverseInPlace() {
    int[] input1 = { 3 };
    ArrayExamples.reverseInPlace(input1);
    assertArrayEquals(new int[]{ 3 }, input1);
	}

  @Test 
	public void hamza_testReverseInPlace() {
    int[] input1 = { 3, 2, 1, 0 };
    ArrayExamples.reverseInPlace(input1);
    assertArrayEquals(new int[]{ 0, 1, 2, 3 }, input1);

	}


  @Test
  public void testReversed() {
    int[] input1 = { };
    assertArrayEquals(new int[]{ }, ArrayExamples.reversed(input1));
  }

  @Test
  public void hamza_testReversed() {
    int[] input1 = { 0, 1, 2, 3, 4, 5 };
    assertArrayEquals(new int[]{ 5, 4, 3, 2, 1, 0 }, ArrayExamples.reversed(input1));
  }

  @Test
  public void hamza_averageWithoutLowest0() {
    double[] input1 = { };
    assertEquals(0.0, ArrayExamples.averageWithoutLowest(input1), 0.01);
  }

  @Test
  public void hamza_averageWithoutLowest1() {
    double[] input1 = { 1 };
    assertEquals(0.0, ArrayExamples.averageWithoutLowest(input1), 0.01);
  }

  @Test
  public void hamza_averageWithoutLowest2() {
    double[] input1 = { 2, 2, 3, 4};
    assertEquals(3.5, ArrayExamples.averageWithoutLowest(input1), 0.001);
  }
}

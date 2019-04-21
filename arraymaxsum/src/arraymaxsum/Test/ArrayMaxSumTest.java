package arraymaxsum.Test;

import static org.junit.Assert.*;

import org.junit.Test;

import arraymaxsum.ArrayMaxSum;

public class ArrayMaxSumTest {

	int[] array = {0,2,-1,2};
	@Test
	public void testArrayMaxSum() {
		
		assertEquals(3,new ArrayMaxSum().arrayMaxSum(array));
	}

}

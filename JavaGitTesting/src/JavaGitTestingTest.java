import static org.junit.Assert.*;

import org.junit.After;
import org.junit.Before;
import org.junit.Test;


public class JavaGitTestingTest {

	@Before
	public void setUp() throws Exception {
	}

	@After
	public void tearDown() throws Exception {
	}

	@Test
	public static int findMin(int[] list)
	{	assert list != null && list.length > 0 : "failed precondition";

		int indexOfMin = 0;
		for(int i = 1; i < list.length; i++)
		{	if(list[i] < list[indexOfMin])
			{	indexOfMin = i;
			}
		}
		return indexOfMin;


	}
}

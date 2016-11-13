import static org.junit.Assert.*;

import org.junit.After;
import org.junit.Before;
import org.junit.Test;


public class JavaGitTestingTest {

	@Before
	public void setUp() throws Exception {
	}

	
public static void main(String[] args) {

	JavaGitTestingTest xyz=new JavaGitTestingTest();
	xyz.findMin(list );
}
	static int[] list= {1,2,3,4};
	
	
	@Test
	public static int findMin(int[] list)
	{	
		
		assert list != null && list.length > 0 : "failed precondition";

		int indexOfMin = 0;
		for(int i = 1; i < list.length; i++)
		{	if(list[i] < list[indexOfMin])
			{	indexOfMin = i;
			}
		}
		return indexOfMin;


	}

	@After
	public void tearDown() throws Exception {
	}
}

package model;

import entity.Map;
import org.junit.*;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertTrue;

/**
 * 
 * @author BIRAHEKA
 *
 */
public class DAOMapTest {
	private DAOMap daoMap;
	
	@BeforeClass
	public static void setUpBeforeClass() throws Exception {
	}

	@AfterClass
	public static void tearDownAfterClass() throws Exception {
	}

	@Before
	public void setUp() throws Exception {
		this.daoMap = new DAOMap(DBConnection.getInstance().getConnection());
	}

	@After
	public void tearDown() throws Exception {
	}

	@Test
	public void testFind() {
		Map test = this.daoMap.find("level1");
		Assert.assertEquals(1, test.getId());
		Assert.assertEquals("level1", test.getName());
		Assert.assertEquals(35, test.getLength());
		Assert.assertEquals(25, test.getWidth());
		Assert.assertEquals(10, test.getGoal());
	}

}

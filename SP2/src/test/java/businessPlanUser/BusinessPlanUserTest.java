package businessPlanUser;

import static org.junit.jupiter.api.Assertions.*;
import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.Test;

class BusinessPlanUserTest {


	@Test
	void test() 
	{
		
		//Test the businessplan user first
		//first you will need to create a new user
		BusinessPlanUser user1 = new BusinessPlanUser("User1","pw1","CSC",true);
		assertEquals("User1",user1.getName());
		
		
		
	}

}

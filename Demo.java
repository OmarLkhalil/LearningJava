package Statickeyword;
import static java.util.Arrays.*;
import java.util.Arrays;

public class Demo {
	public static void main (String args [])
	{
		User user1 = new User();
		System.out.println("User1. getId() " + user1.getId());
		System.out.println("user.getCounter" + user1.getCounter());
		
		System.out.println();
		System.out.println("------------");
		System.out.println();

		
		User user2 = new User();
		System.out.println("User2.getId() = " + user2.getId() );
		System.out.println("User2.getCounter = " + user2.getCounter());
		
		System.out.println();
		System.out.println("------------");
		System.out.println();
		
		User user3 = new Employee();
		user3.doAnyStaticAction();
		
		User.doAnyStaticAction();
		Employee.doAnyStaticActuin();
		
		System.out.println();
		System.out.println("------------");
		System.out.println();
		
		int [] arr = {1, 2, 3};
		Arrays.sort(arr);
		sort(arr);
	
	}
}

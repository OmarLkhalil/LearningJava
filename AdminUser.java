package Polymorphism;

public class AdminUser extends User{
	
	private final String userGroup = "admin";
	
	@Override
	public void validateAccessRights() {
		System.out.println("I am User , I can do whatever I WANT IN THE SYSTEM");
		
	}
	
	@Override 
	public AccountInformation getProfileInformation(Profile profile) {
		
		return new AccountInformation();
		
	}
}

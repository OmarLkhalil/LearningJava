package Polymorphism;

public class ContentManager extends User {
	
	@Override 
	public void validateAccessRights() {
		System.out.println("I'm Content Manager. I have no enough rights to withdraw money.");
		
	}
	
	@Override 
	public ProfileInformationData getProfileInformation(Profile profile) {
		return new AccountInformation();
	}
}

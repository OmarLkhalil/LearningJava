package Polymorphism;

public abstract class User {
	private int id;
	public String name;
	
	public void validateAccessRights() {
		System.out.println("I am abstract user, Idon't have any specific rights.");;
	}
	
	public abstract ProfileInformationData getProfileInformation(Profile profile);
	
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	
}

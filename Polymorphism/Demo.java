package Polymorphism;
import java.io.File;
public class Demo {

	public static void main(String[] args) {
		
		User contenetManager = new ContentManager();
		User admin = new AdminUser();	
		
		contenetManager.validateAccessRights();
		admin.validateAccessRights();
		
		System.out.println();
		System.out.println("============");
		System.out.println();
		
		Archiver zipArchier = new ZipArchiver();
		Archiver rarArchiver = new RarArchiver();
		
		
		zipArchier.achiverFiles(new File(""));
		rarArchiver.achiverFiles(new File(""));

		
		System.out.println();
		System.out.println("==========");
		System.out.println();
		
		contenetManager.getProfileInformation(new UserProfile());
	}

}

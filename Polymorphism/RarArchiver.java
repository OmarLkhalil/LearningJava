package Polymorphism;

import java.io.File;


public class RarArchiver implements Archiver {
	
	@Override 
	public void achiverFiles(File... files) {
		System.out.println("Method of Rar Archiver is called");
	}
}

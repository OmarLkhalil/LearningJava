package Polymorphism;

import java.io.File;

public class ZipArchiver implements Archiver{
	
	@Override 
	public void achiverFiles (File... files) {
		System.out.println("Method of Zip Archiver is called");
	}
	
	public void archiverFiles(int maxArchiveSize, File...files) {}
}

package com.sandeep.java11.newfeature;

import java.io.File;
import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.nio.file.StandardOpenOption;
import java.security.KeyStore.Entry.Attribute;

public class NewFileMethods {

	public static void main(String[] args) {
		//Path filePath = Paths.get("C:\\", "tmp", "gfg.txt");
		try {
			Path f1 = Files.createTempFile("tmp", ".txt");
			File f2 = File.createTempFile("tmp", ".txt", new File("c:\\tmp"));
		
			Files.writeString(f1, "Sample Text", StandardOpenOption.APPEND);
			String fileContent = Files.readString(f1);
			System.out.println(fileContent);
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
		try {
			Path filePath = Files.writeString(Files.createTempFile("C:\\", "tmp", null), "Sample text");
			String fileContent = Files.readString(filePath);
		} catch (Exception e) {
			// TODO: handle exception
		}
		
	}

}

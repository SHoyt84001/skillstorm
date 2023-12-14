package com.skillstorm.projectData;

import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;

public class TestingFiles {
	public static void main(String[] args) {
		String filePath1 = "testSave.dat";
        Path path1 = Paths.get(filePath1);

        try {
            // Create a new empty file
            Files.createFile(path1);
            System.out.println("File created successfully at: " + path1.toAbsolutePath());
        } catch (IOException e) {
            System.err.println("Error creating the file: " + e.getMessage());
        }
	
	 String filePath = "testSave.dat";
        Path path2 = Paths.get(filePath);

        // Check if the file exists
        if (Files.exists(path2)) {
        	
            // Check if the file is readable
            boolean isReadable = Files.isReadable(path2);
            System.out.println("Is readable: " + isReadable);

            // Check if the file is writable
            boolean isWritable = Files.isWritable(path2);
            System.out.println("Is writable: " + isWritable);

            // Check if the file is executable (for directories)
            boolean isExecutable = Files.isExecutable(path2);
            System.out.println("Is executable: " + isExecutable);
        } else {
            System.out.println("File does not exist.");
        }
	}
}

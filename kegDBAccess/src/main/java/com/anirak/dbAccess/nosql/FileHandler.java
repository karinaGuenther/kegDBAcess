package com.anirak.dbAccess.nosql;

import java.io.File;
import java.io.IOException;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.util.List;

public class FileHandler
{

	public File findFile(String location, String filename)
	{
		return new File(location, filename);

	}

	public boolean fileExists(String location, String filename)
	{

		File myfile = findFile(location, filename);
		return myfile.exists();
	}

	public Path createPath(String location)
	{
		return Paths.get(location);
	}

	public static void GetDirectory(String myPath, List myFiles, List myFolders) throws IOException
	{

		// File object is instead constructed
		// with a URI by using Path.toUri()
		// Change is done here
		/*
		 * TODO wants to switch to jre 1.7 with this code.
		 * try (Stream<Path> walk = Files.walk(Paths.get("C:\\projects"))) {
		 * 
		 * List<String> result = walk.filter(Files::isRegularFile).map(x ->
		 * x.toString()).collect(Collectors.toList());
		 * 
		 * result.forEach(System.out::println);
		 * 
		 * } catch (IOException e) {
		 * Logger.error("Unable to find file on path: {}, file(s): {}, folders {}",myPath,myFiles,
		 * myFolders );
		 * }
		 */

	}

}

package me.replapiit.utils;

import me.replapiit.lib.json.JSONObject;
import me.replapiit.lib.json.JSONParser;

import java.io.File;
import java.io.IOException;
import java.util.Scanner;
import java.util.HashMap;

public class QueryReader {
	private static HashMap<String, String> cache = new HashMap<String, String>();

	private QueryReader() {}

	public static String read(String fileInput) {
		if(cache.containsKey(fileInput)) {
			return cache.get(fileInput);
		}

		File f = new File(
			QueryReader.class.getClassLoader().getResource(
				"queries/" +
				fileInput +
				".gql"
			).getFile()
		);

		BufferedReader objReader = null;
		StringBuilder sb = new StringBuilder();

		try {
			objReader = new BufferedReader(new FileReader(f));

			String strCurrentLine;

			while ((strCurrentLine = objReader.readLine()) != null) {
				sb.append(strCurrentLine);
			}
		} catch(IOException ioe) {
			System.err.println("Failed to read file \"" + f.getPath() + "\"");
			ioe.printStackTrace();
		} finally {
			try {
				if (objReader != null)
					objReader.close();
			} catch (IOException ioe) {
				System.err.println("Failed to close BufferedReader");				
				ioe.printStackTrace();
			}
		}

		String result = sb.toString;

		cache.put(fileInput, result);

		return result;
	}
}
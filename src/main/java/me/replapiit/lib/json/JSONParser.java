package me.replapiit.lib.json;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileReader;
import java.io.IOException;

public class JSONParser {
	private JSONParser() {}
	public static JSONObject parse(String data) {
		Types type = Types.NONE;

		if(data.charAt(0) == '[') type = Types.ARRAY;
		if(data.charAt(0) == '{') type = Types.OBJECT;

		// Parse JSON
		return new JSONObject(data.substring(1, data.length() - 1), type);
	}
	public static JSONObject parse(File f) {
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

		String data = sb.toString();

		Types type = Types.NONE;

		if(data.charAt(0) == '[') type = Types.ARRAY;
		if(data.charAt(0) == '{') type = Types.OBJECT;

		return new JSONObject(data.substring(1, data.length() - 1), type);
	}
}
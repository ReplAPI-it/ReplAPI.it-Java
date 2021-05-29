package me.replapiit.lib.json;

public class JSONParser {
	private JSONParser() {}
	public static JSONObject parse(String data) {
		// Declare and initialize type
		Types type = Types.NONE;
		
		// Get type
		if(data.charAt(0) == '[') type = Types.ARRAY;
		if(data.charAt(0) == '{') type = Types.OBJECT;
		
		// Parse JSON
		return new JSONObject(data.substring(1, data.length() - 1), type);
	}
}
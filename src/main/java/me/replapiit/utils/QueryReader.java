package me.replapiit.utils;

import me.replapiit.lib.json.JSONObject;
import me.replapiit.lib.json.JSONParser;

import java.io.File;
import java.io.IOException;
import java.util.Scanner;
import java.util.HashMap;
import java.io.BufferedReader;
import java.io.FileReader;

public class QueryReader {
	private static HashMap<String, String> cache = new HashMap<String, String>();

	private QueryReader() {}

	public static String read(String fileInput) throws Exception {
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
        /**
         * Whatever you did broke this. I'm reverting back to Scanner.
         */

        Scanner scanner = new Scanner(f);
        String result = "";
        while(scanner.hasNextLine()) {
            result += scanner.nextLine() + "\n";
        }

        scanner.close();

		cache.put(fileInput, result);

		return result;
	}
}
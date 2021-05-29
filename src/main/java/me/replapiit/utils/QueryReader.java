package me.replapiit.utils;

import me.replapiit.lib.json.JSONObject;
import me.replapiit.lib.json.JSONParser;

import java.io.File;
import java.io.IOException;
import java.util.Scanner;

public class QueryReader {

	private QueryReader() {}

    public static String read(String fileInput) throws IOException {
        String fileName = "queries/" + fileInput + ".gql";


        File file = new File(ClassLoader.getSystemResource(fileName).getFile());

        String res = "";
        Scanner scanner = new Scanner(file);

        while(scanner.hasNextLine()) {
            res += scanner.nextLine() + "\n";
        }

        return res;
    }
}
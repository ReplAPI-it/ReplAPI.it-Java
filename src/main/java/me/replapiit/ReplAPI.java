package me.replapiit;

import org.json.JSONObject;

public class ReplAPI {
    public static boolean test() {
       JSONObject jo = new JSONObject("{ \"abc\" : \"def\" }");
       System.out.println(jo);
	   return true;
    }
}

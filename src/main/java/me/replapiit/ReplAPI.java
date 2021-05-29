package me.replapiit;

import me.replapiit.lib.json.JSONObject;
import me.replapiit.lib.json.JSONParser;

import me.replapiit.utils.VarBuilder;
import me.replapiit.types.Cycles;

public class ReplAPI {
    public static boolean test() throws Exception {
       // Constructing JSON object
       // Empty object
       JSONObject jo = JSONParser.parse("{}");
       // Empty array
       JSONObject innerArr = JSONParser.parse("[]");
       // Add string
       innerArr.add("testing...");
       // Add int
       innerArr.add(3);
       // Add double
       innerArr.add(3.5);
       // Add boolean
       innerArr.add(false);
       // Add array to object
       jo.set("testArray", innerArr);
       // Add string to object
       jo.set("testStr", "Hello, world!");
       // Add int to object
       jo.set("testNum", 13);
       // Print object JSON
       System.out.println(jo);
       // Test parser again
       System.out.println("" + JSONParser.parse(jo + ""));

        // Now testing GraphQL:
        System.out.println("\n\nGraphQL Testing:");
        Cycles cyclesTest = new Cycles();
        VarBuilder build = new VarBuilder();
        build.set("username", "AmazingMech2418");
        System.out.println(cyclesTest.sendQuery(build).toString());

	   return true;
    }
}

/**
 * Output:
 * {"testNum": 13, "testArray": ["testing...", 3, 3.5, false], "testStr": "Hello, world!"}
 */
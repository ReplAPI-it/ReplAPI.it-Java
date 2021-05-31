package me.replapiit;

import me.replapiit.lib.json.JSONObject;
import me.replapiit.lib.json.JSONParser;

import me.replapiit.utils.VarBuilder;
import me.replapiit.types.Board;
import me.replapiit.types.Cycles;

public class ReplAPI {
	// This method is tempoarary cuz its faster.
    public static boolean test() {
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
        Cycles cycleTest = new Cycles();
        System.out.println(cycleTest.getCycles("AmazingMech2418"));
        Board boardTest = new Board();
        System.out.println(boardTest.boardData("share"));
        System.out.println(boardTest.boardData("learn"));

		return true;
    }
}
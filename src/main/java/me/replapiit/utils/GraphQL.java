package me.replapiit.utils;

/*
 * Sends GraphQL queries
 */

import me.replapiit.lib.json.JSONObject;
import me.replapiit.lib.json.JSONParser;

public class GraphQL {
    private String url;

    public GraphQL() {
		this.url = "https://staging.replit.com/graphql";
    }

	public GraphQL(String url) {
		this.url = url;
	}

    public JSONObject query(String query, JSONObject vars) throws Exception {
        JSONObject body = JSONParser.parse("{}");
        body.set("query", query);
        body.set("variables", vars.toString());
        String data = Request.POST(url, body.toString());
        return JSONParser.parse(data);
    }

	public String getURL() {
		return this.url;
	}

}
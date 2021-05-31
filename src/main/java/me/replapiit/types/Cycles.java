package me.replapiit.types;

import me.replapiit.utils.GraphQL;

import me.replapiit.utils.VarBuilder;
import me.replapiit.utils.QueryReader;
import me.replapiit.lib.json.JSONObject;

public class Cycles extends Type {
	public Cycles() {
		super();
	}

	public JSONObject getCycles(String username) {
		String query = QueryReader.read("cycles");
		VarBuilder builder = new VarBuilder();
		builder.set("username", username);
		return sendQuery(query, builder);
	}
}
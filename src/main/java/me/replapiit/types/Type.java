package me.replapiit.types;

import me.replapiit.utils.GraphQL;

import me.replapiit.utils.VarBuilder;
import me.replapiit.lib.json.JSONObject;

public abstract class Type {

	private GraphQL client;
	
	protected Type() {
		this.client = new GraphQL();
	}

	protected JSONObject sendQuery(String query, VarBuilder vars) {
		return client.query(query, vars.getJSONObject());
	}

}
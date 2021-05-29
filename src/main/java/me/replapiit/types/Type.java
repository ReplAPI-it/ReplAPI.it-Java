// Meant to be main class which all inherit from
package me.replapiit.types;

import me.replapiit.utils.GraphQL;

import me.replapiit.utils.VarBuilder;
import me.replapiit.lib.json.JSONObject;


public abstract class Type {

	private String query;
	private GraphQL client;
    private int id;

	// Make it protected, each board can declare their own constructor as a String like for Board, or an int for id, etc. then that constructor can call super with their respective variables.
	protected Type(String query, int id) {
		this.query = query;
		this.id = id;
		this.client = new GraphQL();
	}

	public JSONObject sendQuery(VarBuilder vars) throws Exception {
		return client.query(this.query, vars.getJSONObject());
	}

}
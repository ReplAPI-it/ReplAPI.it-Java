package me.replapiit.types;

import me.replapiit.utils.GraphQL;

import me.replapiit.utils.VarBuilder;
import me.replapiit.utils.QueryReader;
import me.replapiit.lib.json.JSONObject;

public class Board extends Type {
	public Board() {
		super();
	}

	public JSONObject boardData(String slug) {
		String query = QueryReader.read("board/boardBySlug");
		VarBuilder builder = new VarBuilder();
		builder.set("slug", slug);
		return sendQuery(query, builder);
	}
}
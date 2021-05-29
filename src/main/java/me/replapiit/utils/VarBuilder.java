package me.replapiit.utils;

import me.replapiit.lib.json.JSONObject;
import me.replapiit.lib.json.JSONParser;

public class VarBuilder {
	private JSONObject data;
    
    public VarBuilder() {
        this.data = JSONParser.parse("{}");
    }

    public VarBuilder(String baseJSON) {
        this.data = JSONParser.parse(baseJSON);
    }

    public void set(String key, Object val) {
        this.data.set(key, val);
    }

    public JSONObject getJSONObject() {
        return this.data;
    }
}
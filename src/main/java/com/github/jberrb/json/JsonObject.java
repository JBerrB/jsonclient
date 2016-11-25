package com.github.jberrb.json;

import com.google.gson.Gson;

public class JsonObject {
	
	@Override
	/**
	 * Java object to JSON, and assign to a String
	 */
	public String toString() {
		Gson gson = new Gson();
		String strObj = gson.toJson(this);
		return strObj;
	}
}

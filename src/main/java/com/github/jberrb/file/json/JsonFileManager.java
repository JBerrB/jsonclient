package com.github.jberrb.file.json;

import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.lang.reflect.Array;
import java.util.Arrays;
import java.util.List;

import org.slf4j.LoggerFactory;

import com.google.gson.Gson;
import com.google.gson.JsonIOException;
import com.google.gson.stream.JsonReader;

import ch.qos.logback.classic.Logger;

public class JsonFileManager {
	
	private static final int INITIAL_ARRAY_LENGTH = 100;
	protected static final Logger LOGGER = (Logger) LoggerFactory.getLogger(JsonFileManager.class);
	
	protected Gson gson;
	
	public JsonFileManager() {
		gson = new Gson();
	}
	
	// Read file
		
	public <T> T readJsonFile(String fileName, Class<T> className) {
		JsonReader reader = null;
		try {
			reader = new JsonReader(new FileReader(fileName));
		} catch (FileNotFoundException e) {
			LOGGER.error("Coudln't open file " + fileName, e);
		}
		T obj = gson.fromJson(reader, className);
		
		return obj;
	}
	
	@SuppressWarnings("unchecked")
	public <T> T[] readJsonFileArray(String fileName, Class<T> className) {
		JsonReader reader = null;
		try {
			reader = new JsonReader(new FileReader(fileName));
		} catch (FileNotFoundException e) {
			LOGGER.error("Coudln't open file " + fileName, e);
		}
		T[] objArray = (T[]) Array.newInstance(className, INITIAL_ARRAY_LENGTH);
		objArray = gson.fromJson(reader, objArray.getClass());
		
		return objArray;
	}
	
	public <T> List<T> readListJsonFile(String fileName, Class<T> className) {		
		T[] jsonArray = this.readJsonFileArray(fileName, className);

		return Arrays.asList(jsonArray);
	}
	
	// Save file
	
	/**
	 * Java object to JSON, and save into a file
	 * @throws IOException 
	 * @throws JsonIOException 
	 */
	public void saveJsonFile(String filePath, Object obj) throws JsonIOException, IOException {
		gson.toJson(obj, new FileWriter("file.json"));
	}
}

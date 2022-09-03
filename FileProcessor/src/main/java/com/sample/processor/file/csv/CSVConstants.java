package com.sample.processor.file.csv;

import java.util.Collections;
import java.util.HashMap;
import java.util.Map;

public final class CSVConstants {
	
	 public static final Map<String, Integer> CSV_HEADER = initMap();
	 public static final String USER_ID = "userId";
	 public static final String USERNAME = "userName";
	 public static final String EMAIL_ID = "emailId";
	 public static final String LOCATION = "location";
	 public static final String ORGANIZATION = "organization";

	   private static Map<String, Integer> initMap() {
	      Map<String, Integer> map = new HashMap<>();
	        map.put(USER_ID, 0);
	        map.put(USERNAME, 1);
	        map.put(EMAIL_ID, 2);
	        map.put(LOCATION, 3);
	        map.put(ORGANIZATION, 4);
	        return Collections.unmodifiableMap(map);
	    }

}

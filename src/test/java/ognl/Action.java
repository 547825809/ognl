package ognl;

import java.util.LinkedHashMap;
import java.util.Map;

public class Action {

	// getYtypeList
	public Map<String, String> getYTypeList() {
	    Map<String, String> yTypeList = new LinkedHashMap<String, String>(); // 纵向列表
		yTypeList.put("a", "invalid yTypeList a");
		yTypeList.put("b", "invalid yTypeList b");
		return yTypeList;
	}

	public Map<String, String> getYtypeList() {
	    Map<String, String> yTypeList = new LinkedHashMap<String, String>(); // 纵向列表
		yTypeList.put("a", "standard javabean ytypeList-a1");
		yTypeList.put("b", "standard javabean ytypeList-b1");
		return yTypeList;
	}


	public Map<String, String> getSampleList() {
	    Map<String, String> sampleList = new LinkedHashMap<String, String>();
		sampleList.put("a", "sample-a1");
		sampleList.put("b", "sample-b1");
		return sampleList;
	}

}
package com.examplev;

import java.util.ArrayList;
import java.util.List;

public class ColorChoose {
	public List getColor(String color){
		
		List brandList = new ArrayList();
		if (color.equals("红色")){
			brandList.add("Jim");
			brandList.add("John");
		}
		else if(color.equals("黑色")){
			brandList.add("King");
			brandList.add("Jmmy");
		}
		else if(color.equals("棕色")){
			brandList.add("小红");
			brandList.add("小米");
		}
		else{
			brandList.add("Jail");
			brandList.add("James");
		}
		return brandList;
	}

}

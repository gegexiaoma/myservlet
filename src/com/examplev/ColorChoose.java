package com.examplev;

import java.util.ArrayList;
import java.util.List;

public class ColorChoose {
	public List getColor(String color){
		
		List brandList = new ArrayList();
		if (color.equals("��ɫ")){
			brandList.add("Jim");
			brandList.add("John");
		}
		else if(color.equals("��ɫ")){
			brandList.add("King");
			brandList.add("Jmmy");
		}
		else{
			brandList.add("Jail");
			brandList.add("James");
		}
		return brandList;
	}

}

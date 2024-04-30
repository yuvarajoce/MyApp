package com.myApp.MyApp.Controller;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class Controller {
	
	@RequestMapping("/getNames")
	public List<String> getNames(){
		ArrayList<String> al = new ArrayList<String>();
		al.add("Yuvi");
		al.add("Raj");
		al.add("Java");
		al.add("Delphi");
		al.add("Data");
		return al;
	}
	@RequestMapping("/getDesignations")
	public HashMap<String, String> getDesignations(){
		HashMap<String, String> hm = new HashMap<String, String>();
		hm.put("Yuvi", "TL");
		hm.put("Raj", "SSE");
		return hm;
	}

}

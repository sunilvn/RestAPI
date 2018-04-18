package com.service;

import java.util.ArrayList;
import java.util.List;

import com.bean.Match;

public class ApiUtil {

	public List<Match> getMatch() {

		List<Match> list = new ArrayList<Match>();
		list.add(new Match("CSK", "RCB", "CSK won", "chennai"));
		list.add(new Match("CSK", "RCB", "CSK won", "bangalore"));
		list.add(new Match("MI", "RCB", "MI won", "mumbai"));
		list.add(new Match("RR", "RCB", "RCB won", "bangalore"));

		return list;
	}

}

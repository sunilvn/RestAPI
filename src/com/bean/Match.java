package com.bean;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import com.fasterxml.jackson.annotation.JsonProperty;

@JsonIgnoreProperties()
public class Match {
	
	@JsonProperty("Team1")
	String team1;
	@JsonProperty("Team2")
	String team2;
	@JsonProperty("Result")
	String result;
	@JsonProperty("Venue")
	String venue;

	public Match(String team1, String team2, String result, String venue) {
		super();
		this.team1 = team1;
		this.team2 = team2;
		this.result = result;
		this.venue = venue;
	}

	public String getTeam1() {
		return team1;
	}

	public void setTeam1(String team1) {
		this.team1 = team1;
	}

	public String getTeam2() {
		return team2;
	}

	public void setTeam2(String team2) {
		this.team2 = team2;
	}

	public String getResult() {
		return result;
	}

	public void setResult(String result) {
		this.result = result;
	}

	public String getVenue() {
		return venue;
	}

	public void setVenue(String venue) {
		this.venue = venue;
	}

}

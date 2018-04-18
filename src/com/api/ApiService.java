package com.api;

import java.util.List;

import javax.ws.rs.GET;
import javax.ws.rs.Path;
import javax.ws.rs.Produces;
import javax.ws.rs.core.MediaType;

import com.bean.Match;
import com.service.ApiUtil;

@Path("/ApiService")
public class ApiService {

	@GET
	@Path("/match")
	@Produces(MediaType.APPLICATION_JSON)
	public List<Match> getAllMatches() {

		return new ApiUtil().getMatch();
	}

}

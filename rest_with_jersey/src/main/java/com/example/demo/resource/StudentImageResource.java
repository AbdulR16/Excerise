package com.example.demo.resource;

import java.io.File;

import jakarta.json.Json;
import jakarta.json.JsonObject;
import jakarta.ws.rs.GET;
import jakarta.ws.rs.Path;
import jakarta.ws.rs.Produces;
import jakarta.ws.rs.core.MediaType;

@Path("/rest")
public class StudentImageResource {
	
//	@GET
//	@Path("/image")
//	@Produces("image/jpeg")
//	public File getImageRepresentation() {
//		
//		return new File("F://icon");
//	}
	
	@GET
	@Path("/student/details")
	@Produces(MediaType.APPLICATION_JSON)
	public String getStudentDetails() {
		
		JsonObject map = Json.createObjectBuilder().add("ram",40).add("abd", 80).build();
		
		return map.toString();
	}

}

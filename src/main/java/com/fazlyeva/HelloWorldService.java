package com.fazlyeva;
import javax.ws.rs.GET;
import javax.ws.rs.Path;
import javax.ws.rs.Produces;
import javax.ws.rs.core.MediaType;
import javax.ws.rs.core.Response;

@Path("/hello")
public class HelloWorldService {

    @GET
    @Produces(MediaType.TEXT_PLAIN)
    public Response getMessage() {

        String output = "Hello, world!";
        return Response.status(200).entity(output).build();
    }
}

package com.redhat.training.openshift.hello;

import javax.inject.Inject;
import javax.ws.rs.GET;
import javax.ws.rs.Path;
import javax.ws.rs.Produces;

@Path("/")
public class HelloResource {

    @GET
    @Path("/hello")
    @Produces("text/plain")
    public String hello() {
        String hostname = System.getenv().getOrDefault("HOSTNAME", "unknown");
	      String message = System.getenv().getOrDefault("APP_MSG", null);
	      String response = "";

      	if (message == null)
      	  response = "I love YAYA!!!Hello world from host "+hostname+"\n";
      	else
      	  response = "YAYA so CUTEEEEE!!!! Hello world from host ["+hostname+"]. Message received = "+message+"\n";

        return response;
    }
}

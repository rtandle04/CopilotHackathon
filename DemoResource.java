package com.microsoft.hackathon.quarkus;

import jakarta.ws.rs.GET;
import jakarta.ws.rs.Path;
import jakarta.ws.rs.Produces;
import jakarta.ws.rs.QueryParam;
import jakarta.ws.rs.core.MediaType;

/* 
* The Demo resource should be mapped to the root path.
* 
* Create a GET operation to return the value of a key passed as query parameter in the request. 
* 
* If the key is not passed, return "key not passed".
* If the key is passed, return "hello <key>".
* 
*/
@Path("/hello")
public class DemoResource {

    @GET
    @Produces(MediaType.TEXT_PLAIN)
    public String get(@QueryParam("key") String key) {
        if (key == null) {
            return "key not passed";
        } else {
            return "hello " + key;
        }
    }
    //New operation under /diffdates that calcuates the difference between two dates. The operation should recieved two dates as parameter in format dd-MM-yyyy and return the difference in days.
    
}







package webserver;

import javax.ws.rs.Path;
import javax.ws.rs.Produces;
import javax.ws.rs.GET;

/**
 *
 * @author kshitij
 */

@Path("/test")
public class MyRestAPIConfig {
    @GET
    @Path("/hello")
    @Produces("text/plain")
    public String hello() {
        return "hello";
    }
}

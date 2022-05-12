package rs.restmaven;

import javax.ws.rs.Consumes;
import javax.ws.rs.GET;
import javax.ws.rs.Path;
import javax.ws.rs.core.Response;

/**
 *
 * @author kshitij
 */

@Path("/RESTMaven")
public class RESTMaven {
    @GET
    @Path("/getData")
    @Consumes("application/json")
    public Response getData(){
        String response = "Data";
        return Response.status(200).entity(response).build();
    }
}

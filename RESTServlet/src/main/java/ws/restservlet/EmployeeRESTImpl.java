package ws.restservlet;

import javax.ws.rs.Consumes;
import javax.ws.rs.FormParam;
import javax.ws.rs.POST;
import javax.ws.rs.Path;
import javax.ws.rs.Produces;
import org.json.JSONObject;

/**
 *
 * @author kshitij
 */
@Path("/Employee")
public class EmployeeRESTImpl {

    @POST
    @Path("/getEmployee")
    @Consumes("application/x-www-form-urlencoded")
    @Produces("application/json")
    public String getEmployee(@FormParam("empName") String empName) {
        return buildResponse(empName);
    }

    public String buildResponse(String result) {
        JSONObject resp = new JSONObject();
        resp.put("result", result);
        return resp.toString();
    }
}

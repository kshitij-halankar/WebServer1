package ws.simplecalculator;

import javax.ws.rs.Consumes;
import javax.ws.rs.FormParam;
import javax.ws.rs.POST;
import javax.ws.rs.Path;
import javax.ws.rs.Produces;
import javax.ws.rs.core.Response;
import org.json.JSONObject;
import ws.calculatorapplication.CalculatorImpl;

/**
 *
 * @author kshitij
 */
@Path("/Calculator")
public class CalculatorRESTImpl {

    @POST
    @Path("/add")
    @Consumes("application/x-www-form-urlencoded")
    @Produces("application/json")
    public Response add(@FormParam("num1") int num1, @FormParam("num2") int num2) {
        return buildResponse(CalculatorImpl.add(num1, num2));
    }

    @POST
    @Path("/subtract")
    @Consumes("application/x-www-form-urlencoded")
    @Produces("application/json")
    public Response subtract(@FormParam("num1") int num1, @FormParam("num2") int num2) {
        return buildResponse(CalculatorImpl.subtract(num1, num2));
    }
    @POST
    @Path("/multiply")
    @Consumes("application/x-www-form-urlencoded")
    @Produces("application/json")
    public Response multiply(@FormParam("num1") int num1, @FormParam("num2") int num2) {
        return buildResponse(CalculatorImpl.multiply(num1, num2));
    }
    @POST
    @Path("/divide")
    @Consumes("application/x-www-form-urlencoded")
    @Produces("application/json")
    public Response divide(@FormParam("num1") int num1, @FormParam("num2") int num2) {
        return buildResponse(CalculatorImpl.divide(num1, num2));
    }
    @POST
    @Path("/mod")
    @Consumes("application/x-www-form-urlencoded")
    @Produces("application/json")
    public Response mod(@FormParam("num1") int num1, @FormParam("num2") int num2) {
        return buildResponse(CalculatorImpl.mod(num1, num2));
    }
    @POST
    @Path("/square")
    @Consumes("application/x-www-form-urlencoded")
    @Produces("application/json")
    public Response square(@FormParam("num1") int num1) {
        return buildResponse(CalculatorImpl.square(num1));
    }
    @POST
    @Path("/cube")
    @Consumes("application/x-www-form-urlencoded")
    @Produces("application/json")
    public Response cube(@FormParam("num1") int num1) {
        return buildResponse(CalculatorImpl.cube(num1));
    }
    @POST
    @Path("/sqrt")
    @Consumes("application/x-www-form-urlencoded")
    @Produces("application/json")
    public Response sqrt(@FormParam("num1") int num1) {
        return buildResponse(CalculatorImpl.sqrt(num1));
    }
    
    private Response buildResponse(int result) {
        JSONObject resp = new JSONObject();
        resp.put("result", result);
        return Response.status(200).entity(resp.toString()).build();
    }
}

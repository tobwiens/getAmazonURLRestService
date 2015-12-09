package amazon.geturl.rest;

import com.aol.micro.server.auto.discovery.Rest;
import org.springframework.stereotype.Component;

import javax.ws.rs.GET;
import javax.ws.rs.HeaderParam;
import javax.ws.rs.Path;
import javax.ws.rs.Produces;
import javax.ws.rs.core.Response;

@Path("/watchlog")
@Component
@Rest(isSingleton = true)
public class getAmazonUrlRest {

    @GET
    @Produces("application/json")
    @Path("/logpoints")
    public Response getAllLogpoints() {
        return Response.ok("Yeah").build();
    }
}

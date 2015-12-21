package amazon.geturl.rest;

import amazon.geturl.http.get.GetHttpUrl;
import com.aol.micro.server.auto.discovery.Rest;
import org.json.simple.JSONObject;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import javax.ws.rs.*;
import javax.ws.rs.core.Response;
import java.io.IOException;

@Path("/amazonURL")
@Component
@Rest(isSingleton = true)
public class GetAmazonUrlRest {

    @Autowired
    GetHttpUrl getHttpUrl;

    @GET
    @Produces("application/json")
    @Path("/get")
    public Response getAllLogpoints(@HeaderParam("url") String url) {
        JSONObject result = new JSONObject();
        result.put("type", "productPage");
        result.put("url", url);
        result.put("timestamp", new java.util.Date().getTime());

        try {
            result.put("html", getHttpUrl.getHtml(url));
        } catch (IOException e) {
            return Response.serverError().entity(e.toString()).build();
        }
        return Response.ok(result).build();
    }

}

package exposure;

import javax.ws.rs.Path;
import javax.ws.rs.GET;

import jdk.nashorn.internal.objects.annotations.Getter;

@Path("sayhi")
public class SayHi {

    @GET
    public String getMsg()
    {
        return "Hello there!";
    }

}

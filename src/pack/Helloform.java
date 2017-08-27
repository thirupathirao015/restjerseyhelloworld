package pack;

import javax.ws.rs.FormParam;  
import javax.ws.rs.GET;
import javax.ws.rs.POST;  
import javax.ws.rs.Path;  
import javax.ws.rs.core.Response;

@Path("/product")  
public class Helloform {
 	
	         @POST
	         @Path("/add")  
	    public Response addUser(  
	        @FormParam("id") int id,  
	        @FormParam("name") String name,  
	        @FormParam("price") float price)
	 {  
	   System.out.println("hi thirupathi");
	        return Response.status(200)  
	            .entity(" Product added successfuly! Id: "+id+" Name: " + name+" Price: "+price)  
	            .build();  
	  }  

}

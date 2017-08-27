package pack;

	import javax.ws.rs.GET;  
	import javax.ws.rs.Path;  
	import javax.ws.rs.PathParam;  
	import javax.ws.rs.core.Response;

	@Path("/date")
	public class Jerseydate {
		
	//how to run program::http://localhost:8081/restjerseyhelloworld/rest/date/2017/08/29
		 
			@GET  
		    @Path("{year}/{month}/{day}")  
		    public Response getDate(  
		            @PathParam("year") int year,  
		            @PathParam("month") int month,   
		            @PathParam("day") int day) {  
		   
		       String date = year + "/" + month + "/" + day;  
		   
		       return Response.status(200)  
		        .entity("getDate is called, year/month/day : " + date)  
		        .build();  
		    }  

		

	}




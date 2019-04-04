package com.servicio;

import javax.ws.rs.POST;
import javax.ws.rs.Path;
import javax.ws.rs.Produces;
import javax.ws.rs.QueryParam;
import javax.ws.rs.core.MediaType;

import com.clases.tiempo;

@Path("/java")
public class Calcular {
		
	@POST
    @Path("/vo")
    @Produces(MediaType.APPLICATION_JSON)
    public tiempo getCustomer(@QueryParam("hora") String hora ,@QueryParam("timezone") int timezone) {
		   tiempo time = new tiempo();
		    
		   String stringHora =  hora.substring(0,2);
		    
		   int intHora = Integer.parseInt(stringHora);
		   int sumaHora = Math.abs(intHora + timezone);
		   if(sumaHora > 23) {sumaHora = Math.abs(sumaHora - 24);}
		 
		   String nuevaHora = sumaHora + hora.substring(2);
		   
		   time.setHora(nuevaHora);
		   time.setTimezone("UTC");
		  
		   return time;
    }
	
	
	
	

}

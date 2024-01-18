package ec.edu.ups.prueba64verdugo.prub64verdugo.services;



import java.util.List;

import ec.edu.ups.prueba64verdugo.prub64verdugo.services.ErrorMessage;
import ec.edu.ups.prueba64verdugo.prub64verdugo.Bussiness.GestionCliente;
import ec.edu.ups.prueba64verdugo.prub64verdugo.modelo.Cliente;
import jakarta.inject.Inject;
import jakarta.ws.rs.Consumes;
import jakarta.ws.rs.DELETE;
import jakarta.ws.rs.GET;
import jakarta.ws.rs.POST;
import jakarta.ws.rs.PUT;
import jakarta.ws.rs.Path;
import jakarta.ws.rs.PathParam;
import jakarta.ws.rs.Produces;
import jakarta.ws.rs.QueryParam;
import jakarta.ws.rs.core.MediaType;
import jakarta.ws.rs.core.Response;


@Path("clientes")
public class ClienteServices {

	@Inject
	private GestionCliente gCliente;

	@POST
	@Produces(MediaType.APPLICATION_JSON)
	@Consumes(MediaType.APPLICATION_JSON)
	public Response crear(Cliente cliente) {
		try{
			gCliente.guardarClientes(cliente);
			return Response.ok(cliente).build();
		}catch (Exception e) {
			// TODO: handle exception
			return Response.status(Response.Status.INTERNAL_SERVER_ERROR)
					.build();
		}
	}
	
	
		
}

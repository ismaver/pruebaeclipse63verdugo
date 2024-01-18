package ec.edu.ups.prueba64verdugo.prub64verdugo.Bussiness;


import java.util.List;

import ec.edu.ups.prueba64verdugo.prub64verdugo.DAO.ClienteDAO;
import ec.edu.ups.prueba64verdugo.prub64verdugo.modelo.Cliente;
import jakarta.ejb.*;
import jakarta.inject.Inject;

@Stateless
public class GestionCliente {
	
	@Inject
	private ClienteDAO daoCliente;

	public void guardarClientes(Cliente cliente) {
		Cliente cli = daoCliente.read(cliente.getCodigo());
		if (cli != null){
			daoCliente.update(cliente);
		}else {
			daoCliente.insert(cliente);
		}
	}
	
	public Cliente getClientePorCedula(String cedula) throws Exception{

		if (cedula == null || cedula.trim().isEmpty()) {
	        throw new Exception("La cédula no puede ser nula o vacía");
	    }
		
		if(cedula.length()==10)
			throw new Exception("Cedula incorrecta");

		return daoCliente.getClientePorCedula(cedula);
	}
	
	public List<Cliente> getClientes(){
		return daoCliente.getAll();
	}

}

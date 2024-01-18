package ec.edu.ups.prueba64verdugo.prub64verdugo.Bussiness;



import java.util.Date;
import java.util.List;


import ec.edu.ups.prueba64verdugo.prub64verdugo.DAO.ClienteDAO;
import ec.edu.ups.prueba64verdugo.prub64verdugo.DAO.EmpresaDAO;
import ec.edu.ups.prueba64verdugo.prub64verdugo.modelo.Cliente;
import ec.edu.ups.prueba64verdugo.prub64verdugo.modelo.Empresa;
import jakarta.annotation.PostConstruct;
import jakarta.ejb.Singleton;
import jakarta.ejb.Startup;
import jakarta.inject.Inject;

@Singleton
@Startup
public class GestionDatos {
	
	@Inject
	private ClienteDAO daoCliente;
	@Inject
	private EmpresaDAO daoEmresa;
	
	@PostConstruct
	public void init() {
		System.out.println("Iniciando");
		
		Cliente cliente = new Cliente();
		cliente.setCodigo(1);
		cliente.setCedula("0302142641");
		cliente.setDireccion("Calle Espania");
		cliente.setNombre("Erick Verdugo");
		
		daoCliente.insert(cliente);
		
		Cliente cliente2 = new Cliente();
		cliente2.setCodigo(1);
		cliente2.setCedula("0963258741");
		cliente2.setDireccion("Calle vieja");
		cliente2.setNombre("Ronald Calle");
		
		daoCliente.insert(cliente);
		
		Empresa empresa = new Empresa();
		empresa.setCodigo(12);
		empresa.setCliente(cliente);
		empresa.setNombre("Electrica");
		empresa.setFechdeuda(new Date());
		empresa.setDeuda(78.28);
		
		empresa = new Empresa();
		empresa.setCodigo(17);
		empresa.setCliente(cliente2);
		empresa.setNombre("Electrica");
		empresa.setFechdeuda(new Date());
		empresa.setDeuda(32.50);
		
		empresa = new Empresa();
		empresa.setCodigo(17);
		empresa.setCliente(cliente);
		empresa.setNombre("Electrica");
		empresa.setFechdeuda(new Date());
		empresa.setDeuda(32.50);
		
		empresa = new Empresa();
		empresa.setCodigo(12);
		empresa.setCliente(cliente2);
		empresa.setNombre("Electrica");
		empresa.setFechdeuda(new Date());
		empresa.setDeuda(78.28);
		
		List<Empresa> list2 = daoEmresa.getAll();
		for (Empresa fac: list2) {
			System.out.println(fac);
		}
		
		
	}
	
}

package ec.edu.ups.prueba64verdugo.prub64verdugo.DAO;

import java.util.List;

import ec.edu.ups.prueba64verdugo.prub64verdugo.modelo.Cliente;
import jakarta.persistence.EntityManager;
import jakarta.persistence.PersistenceContext;
import jakarta.persistence.Query;

public class ClienteDAO {
	
	@PersistenceContext 
	private EntityManager em;
	
	public void insert(Cliente cliente ) {
		em.persist(cliente);
	}
	
	public void update(Cliente cliente ) {
		em.merge(cliente);
			
	}
	
	public void remove (int codigo ) {
		Cliente cliente = em.find(Cliente.class, codigo);
		em.remove(cliente);
		
		
	}
	
	public Cliente read (int codigo ) {
		Cliente cliente = em.find(Cliente.class, codigo);
		return cliente;
	}
	
	public List<Cliente> getAll(){
		String jpql= "SELECT c FROM Cliente c";
				Query q =em.createQuery(jpql, Cliente.class);
		return q.getResultList();
	}
	
	public Cliente getClientePorCedula(String cedula){
		String jpql = "SELECT c FROM Cliente c WHERE c.cedula = :cedula";
		Query q = em.createQuery(jpql, Cliente.class);
		q.setParameter("cedula", cedula);
		List<Cliente> clientes = q.getResultList();
		if(clientes.size()>0)
			return clientes.get(0);
		return null;
	}

}

package ec.edu.ups.prueba64verdugo.prub64verdugo.DAO;



import java.util.List;


import ec.edu.ups.prueba64verdugo.prub64verdugo.modelo.Empresa;
import jakarta.ejb.Stateless;
import jakarta.persistence.*;

@Stateless
public class EmpresaDAO {

	@PersistenceContext 
	private EntityManager em;
	
	public void insert(Empresa empresa ) {
		em.persist(empresa);
	}
	
	public void update(Empresa empresa ) {
		em.merge(empresa);
	}
	
	public void remove (int codigo ) {
		Empresa factura = em.find(Empresa.class, codigo);
		em.refresh(factura);
		
	}
	
	public Empresa read (int codigo ) {
		Empresa factura = em.find(Empresa.class, codigo);
		return factura;
	}
	
	public List<Empresa> getAll(){
		String jpql= "SELECT e FROM Empresa e";
				Query q =em.createQuery(jpql, Empresa.class);
		return q.getResultList();
	}
	
	
}

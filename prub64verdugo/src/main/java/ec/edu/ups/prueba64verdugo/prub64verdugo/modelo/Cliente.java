package ec.edu.ups.prueba64verdugo.prub64verdugo.modelo;

import jakarta.persistence.*;

@Entity
public class Cliente {
	@Id
	@GeneratedValue
	@Column(name="id_cli")
	@JoinColumn(name="codigo_cliente")
	private int codigo;
	
	@Column(name="nom_cli")
	private String nombre;
	
	
	@Column(name="dni_cli")
	private String cedula;
	
	
	@Column(name="dire_cli")
	private String direccion;


	public int getCodigo() {
		return codigo;
	}


	public void setCodigo(int codigo) {
		this.codigo = codigo;
	}


	public String getNombre() {
		return nombre;
	}


	public void setNombre(String nombre) {
		this.nombre = nombre;
	}


	public String getCedula() {
		return cedula;
	}


	public void setCedula(String cedula) {
		this.cedula = cedula;
	}


	public String getDireccion() {
		return direccion;
	}


	public void setDireccion(String direccion) {
		this.direccion = direccion;
	}


	@Override
	public String toString() {
		return "Cliente [codigo=" + codigo + ", nombre=" + nombre + ", cedula=" + cedula + ", direccion=" + direccion
				+ "]";
	}


	

}

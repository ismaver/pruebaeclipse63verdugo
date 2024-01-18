package ec.edu.ups.prueba64verdugo.prub64verdugo.modelo;

import java.util.ArrayList;
import java.util.Date;


import jakarta.persistence.*;

@Entity
public class Empresa {

	
	@Id
	@GeneratedValue
	@Column(name="id_empr")
	private int codigo;
	
	//@OneToMany(fetch = FetchType.LAZY)
	@JoinColumn(name="codigo_cliente")
	private Cliente cliente;
	
	
	private String nombre;
	
	private Date fechdeuda;
	
	private double deuda;

	
	
	public int getCodigo() {
		return codigo;
	}

	public void setCodigo(int codigo) {
		this.codigo = codigo;
	}

	public Cliente getCliente() {
		return cliente;
	}

	public void setCliente(Cliente cliente) {
		this.cliente = cliente;
	}

	public String getNombre() {
		return nombre;
	}

	public void setNombre(String nombre) {
		this.nombre = nombre;
	}

	public Date getFechdeuda() {
		return fechdeuda;
	}

	public void setFechdeuda(Date fechdeuda) {
		this.fechdeuda = fechdeuda;
	}

	public double getDeuda() {
		return deuda;
	}

	public void setDeuda(double deuda) {
		this.deuda = deuda;
	}
	
	
	@Override
	public String toString() {
		return "Empresa [codigo=" + codigo + ", cliente=" + cliente + ", nombre=" + nombre + ", fechdeuda=" + fechdeuda
				+ ", deuda=" + deuda + "]";
	}
}

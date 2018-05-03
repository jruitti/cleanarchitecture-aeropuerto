package ar.edu.undec.prog3.data.entity;

import java.io.Serializable;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.SequenceGenerator;

@Entity
@SequenceGenerator(name = "pasajero_seq", sequenceName = "pasajero_seq", initialValue = 0, allocationSize = 1)
public class PasajeroEntity implements Serializable {

	private static final long serialVersionUID = 1L;

	@Id
	@GeneratedValue(strategy = GenerationType.SEQUENCE, generator = "pasajero_seq")
	private Integer idPasajero;
	private String cuil;
	private String apellido;
	private String nombres;
	private String telefono;

	public PasajeroEntity() {

	}

	public Integer getIdPasajero() {
		return idPasajero;
	}

	public void setIdPasajero(Integer idPasajero) {
		this.idPasajero = idPasajero;
	}

	public String getCuil() {
		return cuil;
	}

	public void setCuil(String cuil) {
		this.cuil = cuil;
	}

	public String getApellido() {
		return apellido;
	}

	public void setApellido(String apellido) {
		this.apellido = apellido;
	}

	public String getNombres() {
		return nombres;
	}

	public void setNombres(String nombres) {
		this.nombres = nombres;
	}

	public String getTelefono() {
		return telefono;
	}

	public void setTelefono(String telefono) {
		this.telefono = telefono;
	}

}

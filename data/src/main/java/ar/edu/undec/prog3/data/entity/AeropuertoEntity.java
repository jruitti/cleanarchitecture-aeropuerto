package ar.edu.undec.prog3.data.entity;

import java.io.Serializable;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.ManyToOne;
import javax.persistence.SequenceGenerator;

@Entity
@SequenceGenerator(name = "aeropuerto_seq", sequenceName = "aeropuerto_seq", initialValue = 0, allocationSize = 1)
public class AeropuertoEntity implements Serializable {

	private static final long serialVersionUID = 1L;

	@Id
	@GeneratedValue(strategy = GenerationType.SEQUENCE, generator = "aeropuerto_seq")
	private Integer idAeropuerto;
	private String nombre;
	private String codigo;
	@ManyToOne
	private CiudadEntity ciudad;

	public AeropuertoEntity() {
		// TODO Auto-generated constructor stub
	}

	public Integer getIdAeropuerto() {
		return idAeropuerto;
	}

	public void setIdAeropuerto(Integer idAeropuerto) {
		this.idAeropuerto = idAeropuerto;
	}

	public String getNombre() {
		return nombre;
	}

	public void setNombre(String nombre) {
		this.nombre = nombre;
	}

	public String getCodigo() {
		return codigo;
	}

	public void setCodigo(String codigo) {
		this.codigo = codigo;
	}

	public CiudadEntity getCiudad() {
		return ciudad;
	}

	public void setCiudad(CiudadEntity ciudad) {
		this.ciudad = ciudad;
	}

}

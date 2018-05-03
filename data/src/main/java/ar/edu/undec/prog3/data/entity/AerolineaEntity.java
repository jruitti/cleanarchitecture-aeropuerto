package ar.edu.undec.prog3.data.entity;

import java.io.Serializable;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.SequenceGenerator;

@Entity
@SequenceGenerator(name = "aerolinea_seq", sequenceName = "aerolinea_seq", initialValue = 0, allocationSize = 1)
public class AerolineaEntity implements Serializable {

	private static final long serialVersionUID = 1L;

	@Id
	@GeneratedValue(strategy = GenerationType.SEQUENCE, generator = "aerolinea_seq")
	private Integer idAerolinea;

	private String nombre;

	public AerolineaEntity() {

	}

	public Integer getIdAerolinea() {
		return idAerolinea;
	}

	public void setIdAerolinea(Integer idAerolinea) {
		this.idAerolinea = idAerolinea;
	}

	public String getNombre() {
		return nombre;
	}

	public void setNombre(String nombre) {
		this.nombre = nombre;
	}

}

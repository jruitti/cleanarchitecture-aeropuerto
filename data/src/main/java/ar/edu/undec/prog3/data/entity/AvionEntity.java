package ar.edu.undec.prog3.data.entity;

import java.io.Serializable;
import java.util.Collection;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.OneToMany;
import javax.persistence.SequenceGenerator;

@Entity
@SequenceGenerator(name = "avion_seq", sequenceName = "avion_seq", initialValue = 0, allocationSize = 1)
public class AvionEntity implements Serializable {

	private static final long serialVersionUID = 1L;

	@Id
	@GeneratedValue(strategy = GenerationType.SEQUENCE, generator = "avion_seq")
	private Integer idAvion;
	private String modelo;
	private String matricula;
	@OneToMany
	private Collection<AsientoEntity> listaAsientos;

	public AvionEntity() {

	}

	public Integer getIdAvion() {
		return idAvion;
	}

	public void setIdAvion(Integer idAvion) {
		this.idAvion = idAvion;
	}

	public String getModelo() {
		return modelo;
	}

	public void setModelo(String modelo) {
		this.modelo = modelo;
	}

	public String getMatricula() {
		return matricula;
	}

	public void setMatricula(String matricula) {
		this.matricula = matricula;
	}

	public Collection<AsientoEntity> getListaAsientos() {
		return listaAsientos;
	}

	public void setListaAsientos(Collection<AsientoEntity> listaAsientos) {
		this.listaAsientos = listaAsientos;
	}

}

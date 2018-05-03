package ar.edu.undec.prog3.data.entity;

import java.io.Serializable;
import java.time.LocalDateTime;
import java.util.Collection;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.ManyToMany;
import javax.persistence.ManyToOne;
import javax.persistence.OneToMany;
import javax.persistence.SequenceGenerator;

@Entity
@SequenceGenerator(name = "vuelo_seq", sequenceName = "vuelo_seq", initialValue = 0, allocationSize = 1)
public class VueloEntity implements Serializable {

	private static final long serialVersionUID = 1L;

	@Id
	@GeneratedValue(strategy = GenerationType.SEQUENCE, generator = "vuelo_seq")
	private String codigoVuelo;

	@ManyToOne
	private AeropuertoEntity salida;

	private LocalDateTime fechaHoraSalida;

	@ManyToOne
	private AeropuertoEntity arribo;

	private LocalDateTime fechaHoraArribo;

	@ManyToOne
	private AerolineaEntity aerolinea;

	@ManyToMany
	private Collection<PilotoEntity> pilotos;

	@ManyToOne
	private AvionEntity avion;

	@OneToMany
	private Collection<AsignacionEntity> pasajeros;

	public VueloEntity() {

	}

	public String getCodigoVuelo() {
		return codigoVuelo;
	}

	public void setCodigoVuelo(String codigoVuelo) {
		this.codigoVuelo = codigoVuelo;
	}

	public AeropuertoEntity getSalida() {
		return salida;
	}

	public void setSalida(AeropuertoEntity salida) {
		this.salida = salida;
	}

	public LocalDateTime getFechaHoraSalida() {
		return fechaHoraSalida;
	}

	public void setFechaHoraSalida(LocalDateTime fechaHoraSalida) {
		this.fechaHoraSalida = fechaHoraSalida;
	}

	public AeropuertoEntity getArribo() {
		return arribo;
	}

	public void setArribo(AeropuertoEntity arribo) {
		this.arribo = arribo;
	}

	public LocalDateTime getFechaHoraArribo() {
		return fechaHoraArribo;
	}

	public void setFechaHoraArribo(LocalDateTime fechaHoraArribo) {
		this.fechaHoraArribo = fechaHoraArribo;
	}

	public AerolineaEntity getAerolinea() {
		return aerolinea;
	}

	public void setAerolinea(AerolineaEntity aerolinea) {
		this.aerolinea = aerolinea;
	}

	public Collection<PilotoEntity> getPilotos() {
		return pilotos;
	}

	public void setPilotos(Collection<PilotoEntity> pilotos) {
		this.pilotos = pilotos;
	}

	public AvionEntity getAvion() {
		return avion;
	}

	public void setAvion(AvionEntity avion) {
		this.avion = avion;
	}

	public Collection<AsignacionEntity> getPasajeros() {
		return pasajeros;
	}

	public void setPasajeros(Collection<AsignacionEntity> pasajeros) {
		this.pasajeros = pasajeros;
	}

}

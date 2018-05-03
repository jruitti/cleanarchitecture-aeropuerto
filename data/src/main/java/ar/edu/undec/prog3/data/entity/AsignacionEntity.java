package ar.edu.undec.prog3.data.entity;

import java.io.Serializable;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.ManyToOne;
import javax.persistence.SequenceGenerator;

@Entity
@SequenceGenerator(name = "asignacion_seq", sequenceName = "asignacion_seq", initialValue = 0, allocationSize = 1)
public class AsignacionEntity implements Serializable {

	private static final long serialVersionUID = 1L;

	@Id
	@GeneratedValue(strategy = GenerationType.SEQUENCE, generator = "asignacion_seq")
	private String codigoAsignacion;

	@ManyToOne
	private PasajeroEntity pasajero;

	@ManyToOne
	private AsientoEntity asiento;

	public AsignacionEntity() {

	}

	public String getCodigoAsignacion() {
		return codigoAsignacion;
	}

	public void setCodigoAsignacion(String codigoAsignacion) {
		this.codigoAsignacion = codigoAsignacion;
	}

	public PasajeroEntity getPasajero() {
		return pasajero;
	}

	public void setPasajero(PasajeroEntity pasajero) {
		this.pasajero = pasajero;
	}

	public AsientoEntity getAsiento() {
		return asiento;
	}

	public void setAsiento(AsientoEntity asiento) {
		this.asiento = asiento;
	}

}

package dto;

import java.util.List;

public class ParticularDTO extends ClienteDTO {

	private static final long serialVersionUID = 1L;

	private int DNI;
	private String apellido;

	public ParticularDTO() {
		super();
	}

	public ParticularDTO(int idCliente, String nombre, int DNI,
			String apellido, List<HabilitadoDTO> habilitados) {
		super(idCliente, nombre);
		this.DNI = DNI;
		this.apellido = apellido;
	}

	public int getDNI() {
		return DNI;
	}

	public void setDNI(int dNI) {
		DNI = dNI;
	}

	public String getApellido() {
		return apellido;
	}

	public void setApellido(String apellido) {
		this.apellido = apellido;
	}

	public static long getSerialversionuid() {
		return serialVersionUID;
	}
}

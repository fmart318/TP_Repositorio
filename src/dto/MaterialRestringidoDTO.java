package dto;

import java.io.Serializable;

public class MaterialRestringidoDTO implements Serializable {

	private static final long serialVersionUID = -8179388166695423814L;
	
	private int id;
	private String nombre;
	
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	public String getNombre() {
		return nombre;
	}
	public void setNombre(String nombre) {
		this.nombre = nombre;
	}

}

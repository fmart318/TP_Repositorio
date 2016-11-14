package dto;

import java.util.List;

public class EmpresaDTO extends ClienteDTO {

	private static final long serialVersionUID = 1L;

	private int CUIT;
	private String tipo;
	private String detallePoliticas;
	private List<ProductoDTO> productos;
	private float saldoCuentaCorriente;
	private List<DireccionDTO> direcciones;

	public EmpresaDTO() {
		super();
	}

	public EmpresaDTO(int idCliente, String nombre, int CUIT, String tipo,
			String detallePoliticas, List<ProductoDTO> productos,
			float saldoCuentaCorriente) {
		super(idCliente, nombre);
		this.CUIT = CUIT;
		this.tipo = tipo;
		this.detallePoliticas = detallePoliticas;
		this.productos = productos;
		this.saldoCuentaCorriente = saldoCuentaCorriente;
	}

	public int getCUIT() {
		return CUIT;
	}

	public void setCUIT(int cUIT) {
		CUIT = cUIT;
	}

	public String getTipo() {
		return tipo;
	}

	public void setTipo(String tipo) {
		this.tipo = tipo;
	}

	public String getDetallePoliticas() {
		return detallePoliticas;
	}

	public void setDetallePoliticas(String detallePoliticas) {
		this.detallePoliticas = detallePoliticas;
	}

	public List<ProductoDTO> getProductos() {
		return productos;
	}

	public void setProductos(List<ProductoDTO> productos) {
		this.productos = productos;
	}

	public float getSaldoCuentaCorriente() {
		return saldoCuentaCorriente;
	}

	public void setSaldoCuentaCorriente(float saldoCuentaCorriente) {
		this.saldoCuentaCorriente = saldoCuentaCorriente;
	}

	public List<DireccionDTO> getDirecciones() {
		return direcciones;
	}

	public void setDirecciones(List<DireccionDTO> direcciones) {
		this.direcciones = direcciones;
	}
}

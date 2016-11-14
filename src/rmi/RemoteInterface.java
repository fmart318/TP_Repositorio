package rmi;

import java.rmi.Remote;
import java.rmi.RemoteException;
import java.util.List;

import dto.CargaDTO;
import dto.ClienteDTO;
import dto.DireccionDTO;
import dto.EnvioDTO;
import dto.FacturaDTO;
import dto.HabilitadoDTO;
import dto.MaterialRestringidoDTO;
import dto.PedidoDTO;
import dto.RemitoDTO;
import dto.RutaDTO;
import dto.SucursalDTO;
import dto.TransporteDTO;
import dto.TrayectoDTO;
import dto.VehiculoDTO;
import dto.ViajeDTO;

public interface RemoteInterface extends Remote {

	//Cliente
	public void altaCliente(ClienteDTO clienteDto) throws RemoteException;
	
	public void bajaCliente(int id) throws RemoteException;

	public void modificarCliente(ClienteDTO clienteDto) throws RemoteException;
	
	public ClienteDTO obtenerClientePorID(int id) throws RemoteException;

	public List<ClienteDTO> obtenerClientes() throws RemoteException;
	
	//Pedido
	public void altaPedido(PedidoDTO pedidoDTO) throws RemoteException;
	
	public void bajaPedido(int id);
	
	public void modificarPedido(PedidoDTO pedidoDTO) throws RemoteException;
	
	public PedidoDTO obtenerPedido(int idPedido) throws RemoteException;
	
	public List<PedidoDTO> obtenerPedidos() throws RemoteException;
	
	public void actualizarPedido(PedidoDTO pedido) throws RemoteException;
	
	//Factura y Remito
	public void altaFactura(FacturaDTO facturaDto) throws RemoteException;
	
	public void altaRemito(RemitoDTO remitoDto) throws RemoteException;
	
	//Recepcion Pedido
	public List<ViajeDTO> controlarPedidosDeCliente(ClienteDTO c)
			throws RemoteException;
	
	public List<HabilitadoDTO> obtenerHabilitados() throws RemoteException;
	
	public List<MaterialRestringidoDTO> obtenerMaterialesRestringidos() throws RemoteException;

	//Direccion
	public void altaDireccion(DireccionDTO direccionDto) throws RemoteException;
	
	public List<DireccionDTO> obtenerDirecciones() throws RemoteException;
	
	//Rutas y Sucursales
	public List<SucursalDTO> obtenerSucursales() throws RemoteException;
	
	public List<RutaDTO> obtenerRutas() throws RemoteException;

	//Vehiculo
	public List<VehiculoDTO> obtenerVehiculos() throws RemoteException;
	
	public List<VehiculoDTO> obtenerVehiculosDisponibles() throws RemoteException;
	
	
	
	
	
	
	
	
	
	public List<EnvioDTO> obtenerEnviosDelCliente(int idCliente) throws RemoteException;
	
	public VehiculoDTO obtenerVehiculo(int vehiculoId) throws RemoteException;

	public void agregarTrayectoAMapaDeRutas(TrayectoDTO t) throws RemoteException;

	public List<TransporteDTO> obtenerTransportesDeTerceros(CargaDTO c,
			TransporteDTO tr) throws RemoteException;

	public String validarCredenciales(String username, String password)
			throws RemoteException;

	public void viajeFinalizado(ViajeDTO v) throws RemoteException;

	public List<CargaDTO> obtenerCargasDeUnPedido(PedidoDTO pedido)
			throws RemoteException;

	public List<TransporteDTO> obtenerTransportes() throws RemoteException;

	public boolean controlarMantenimientoVehiculo(VehiculoDTO vehiculoDTO)
			throws RemoteException;

	public void enviar() throws RemoteException;

}

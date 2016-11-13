package rmi;

import java.rmi.Remote;
import java.rmi.RemoteException;
import java.util.List;

import dto.CargaDTO;
import dto.ClienteDTO;
import dto.EnvioDTO;
import dto.FacturaDTO;
import dto.HabilitadoDTO;
import dto.PedidoDTO;
import dto.SucursalDTO;
import dto.TransporteDTO;
import dto.TrayectoDTO;
import dto.VehiculoDTO;
import dto.ViajeDTO;

public interface RemoteInterface extends Remote {

	public List<SucursalDTO> obtenerSucursales() throws RemoteException;

	public void altaPedido(PedidoDTO pedidoDTO) throws RemoteException;

	public void altaCliente(ClienteDTO clienteDto) throws RemoteException;

	public VehiculoDTO obtenerVehiculo(int vehiculoId) throws RemoteException;

	public List<ViajeDTO> controlarPedidosDeCliente(ClienteDTO c)
			throws RemoteException;

	public void agregarTrayectoAMapaDeRutas(TrayectoDTO t) throws RemoteException;

	public List<TransporteDTO> obtenerTransportesDeTerceros(CargaDTO c,
			TransporteDTO tr) throws RemoteException;

	public void altaFactura(FacturaDTO f) throws RemoteException;

	public List<PedidoDTO> obtenerPedidos() throws RemoteException;

	public void actualizarPedido(PedidoDTO pedido) throws RemoteException;

	public ClienteDTO obtenerClientePorID(int id) throws RemoteException;

	public List<ClienteDTO> obtenerClientes() throws RemoteException;

	public String validarCredenciales(String username, String password)
			throws RemoteException;

	public void viajeFinalizado(ViajeDTO v) throws RemoteException;

	public PedidoDTO obtenerPedido(int idPedido) throws RemoteException;

	public List<CargaDTO> obtenerCargasDeUnPedido(PedidoDTO pedido)
			throws RemoteException;

	public List<HabilitadoDTO> obtenerHabilitados() throws RemoteException;

	public List<EnvioDTO> obtenerEnviosDelCliente(int idCliente) throws RemoteException;

	public List<TransporteDTO> obtenerTransportes() throws RemoteException;

	public List<VehiculoDTO> obtenerVehiculos() throws RemoteException;

	public boolean controlarMantenimientoVehiculo(VehiculoDTO vehiculoDTO)
			throws RemoteException;

	public void enviar() throws RemoteException;

}

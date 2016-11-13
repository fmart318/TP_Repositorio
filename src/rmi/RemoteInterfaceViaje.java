package rmi;

import java.rmi.Remote;
import java.rmi.RemoteException;
import java.util.List;

import dto.SucursalDTO;
import dto.TrayectoDTO;
import dto.VehiculoDTO;
import dto.ViajeDTO;

public interface RemoteInterfaceViaje extends Remote {

	public void altaViaje(ViajeDTO viajeDTO);
	
	public List<ViajeDTO> ObtenerViajesDeCliente(int idCliente);

	public float SeleccionarViaje(int idViaje);
	
	public List<ViajeDTO> obtenerViajes() throws RemoteException;
	
	public ViajeDTO obtenerViajePorVehiculo(VehiculoDTO vehiculo);

	public void actualiarViaje(ViajeDTO viajeDTO);

	public void demorarViaje(ViajeDTO viajeDTO, int m);

	public ViajeDTO obtenerViaje(ViajeDTO viajeDTO);

	public void actualizarViajes(TrayectoDTO trayDTO, SucursalDTO sucursalDTO);

	
}

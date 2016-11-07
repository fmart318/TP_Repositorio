package rmi;

import java.rmi.Remote;
import java.rmi.RemoteException;
import java.util.List;

import dto.VehiculoDTO;

public interface RemoteInterfaceVehiculo extends Remote {

	public void altaVehiculo(VehiculoDTO vehiculoDTO) throws RemoteException;

	public List<VehiculoDTO> obtenerVehiculos() throws RemoteException;

	public boolean ControlarVehiculo(VehiculoDTO vehiculoDTO) throws RemoteException;

	public VehiculoDTO obtenerVehiculo(VehiculoDTO vehiculoDTO) throws RemoteException;

	public List<VehiculoDTO> obtenerVehiculosListos() throws RemoteException;

}

package rmi;

import java.rmi.Remote;
import java.rmi.RemoteException;
import java.util.List;

import dto.ProveedorDTO;

public interface RemoteInterfaceProveedor extends Remote {
	
	public List<ProveedorDTO> obtenerProveedores() throws RemoteException;
	
	public ProveedorDTO obtenerProveedor(int idProveedor) throws RemoteException;
	
	public void altaProveedor(ProveedorDTO proveedor) throws RemoteException;
	
	public void eliminarProveedor(int idProveedor) throws RemoteException;
	
	public void modificarProveedor(ProveedorDTO nuevoProveedor) throws RemoteException;
}

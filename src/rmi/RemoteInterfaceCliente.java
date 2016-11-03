package rmi;

import java.rmi.Remote;
import java.rmi.RemoteException;
import java.util.List;

import dto.ClienteDTO;

public interface RemoteInterfaceCliente extends Remote {

	public void altaCliente(ClienteDTO clienteDto) throws RemoteException;

	public void bajaCliente(int id) throws RemoteException;

	public void modificarCliente(ClienteDTO clienteDto) throws RemoteException;

	public ClienteDTO obtenerClientePorID(int id) throws RemoteException;

	public List<ClienteDTO> obtenerClientes() throws RemoteException;

}

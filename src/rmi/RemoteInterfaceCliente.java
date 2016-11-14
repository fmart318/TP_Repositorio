package rmi;

import java.rmi.Remote;
import java.rmi.RemoteException;
import java.util.List;

import dto.ClienteDTO;

public interface RemoteInterfaceCliente extends Remote {

	public void altaCliente(ClienteDTO clienteDto) throws RemoteException;

	





}

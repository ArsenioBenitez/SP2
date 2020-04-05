package businessPlanUser;

import java.rmi.registry.Registry;
import java.rmi.registry.LocateRegistry;
import java.rmi.RemoteException;
import java.rmi.server.UnicastRemoteObject;
import java.rmi.registry.LocateRegistry;
import java.rmi.registry.Registry;
import java.rmi.server.UnicastRemoteObject;

public class BPServer extends UnicastRemoteObject implements MyRemote {
	
	public BPServer() {}
	
	public String login()
	{
		return "Hello!\n";
	}
	public static void main(String[] args)
	{
		try {
			BPServer service = new BPServer();
	        MyRemote stub = (MyRemote) UnicastRemoteObject.exportObject(service, 0);
// Bind the remote object's stub in the registry
	        Registry registry = LocateRegistry.getRegistry();
	        registry.bind("MyRemote", stub);
		}catch (Exception e) {
			System.err.println("Server exception: " + e.toString());
            e.printStackTrace();
		}
	}

}

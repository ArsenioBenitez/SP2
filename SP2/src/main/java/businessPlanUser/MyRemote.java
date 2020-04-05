package businessPlanUser;

import java.rmi.Remote;
import java.rmi.RemoteException;


public interface MyRemote extends Remote {
	//This interface defines the remote methods that you want to call. 
	//login/authenticate
	public String login() throws RemoteException;
	
}

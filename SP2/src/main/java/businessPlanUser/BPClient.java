package businessPlanUser;
import java.rmi.registry.LocateRegistry;
import java.rmi.registry.Registry;


public class BPClient {
	
/*
 * this is a simple client class that uses RMI to connect with BPServer 
 * this class only has memory for the current BP that the user is viewing or editing.
 * and has a serverobject to "do everything"
 */
	static BusinessPlanUser user;
	
	//step one, connect with BPServer
	public static void main(String[] args)
	{
		String host = (args.length < 1) ? null : args[0];
        try {
            Registry registry = LocateRegistry.getRegistry(host);
            MyRemote stub = (MyRemote) registry.lookup("MyRemote");
            String response = stub.login();
            System.out.println("response: " + response);
        } catch (Exception e) {
            System.err.println("Client exception: " + e.toString());
            e.printStackTrace();
        }
	}
	
	
}


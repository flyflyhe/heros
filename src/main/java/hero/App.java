package hero;

import boot.Manager;
import sockets.DefaultServer;

public class App {
	public static Manager manager;
	
	public static void main(String[] argv) throws InterruptedException
	{
		manager = new Manager();
		System.out.println("hello hero");
		DefaultServer defaultServer = new DefaultServer();
		defaultServer.start();
		while(true) {
			Thread.sleep(1000);
		}
	}
}

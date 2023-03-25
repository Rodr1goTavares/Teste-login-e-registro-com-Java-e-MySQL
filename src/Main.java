import br.com.crud.App;

public class Main {
	public static void main(String[] args) {
		/*
		 * How it works ?
		 * This application get the user info and save on database. It's a simple CRUD, but only Create. 
		 * It starts on method bellow, that method starts the App interface. In App interface he get the user input
		 * and checks if the user chose "login" or "register". After this, he sends the user info to Register class.
		 * The register class create a new instance at AccountModel class (This class crate a model to user object with getters and setters), and
		 * sends a instanced object(account) to ConnectDAO class. In the ConnectDAO class, she receives then and save it on database. 
		 */
		App.start();
	}
}

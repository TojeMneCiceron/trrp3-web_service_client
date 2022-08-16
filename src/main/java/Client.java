import org.lab3client.ILab3Service;
import org.lab3client.Lab3Service;

public class Client {
	
	
	public static void main(String[] args) {
		Lab3Service service = new Lab3Service();
		ILab3Service client = service.getBasicHttpBindingILab3Service();
		int count = client.getRowsCount();
		System.out.println(count);
		
		Database.DropTables();
		Database.CreateTables();
		
		for (int i = 0; i < count; i++) {
			System.out.println("\nGetting row: " + i);
			Database.WriteRow(client.getRow(i));
		}
	}
}
	
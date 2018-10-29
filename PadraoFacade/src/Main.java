import java.util.Date;

public class Main {
	
	public static void main(String[] args) {
		
		DatabaseConnection databaseConnection = new DatabaseConnection();
		DatabaseTransaction databaseTransaction = new DatabaseTransaction();
		TaskDatabase taskDatabase = new TaskDatabase();
		
		Task task = new Task("To study", new Date());
		
		databaseConnection.openConnection();
		databaseTransaction.openTransaction();
		taskDatabase.save(task);
		databaseTransaction.commitTransaction();
		databaseTransaction.closeTransaction();
		databaseConnection.closeConnection();
		
	}

}

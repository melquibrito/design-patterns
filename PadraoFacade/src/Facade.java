
public class Facade {
	
	private DatabaseConnection databaseConnection = new DatabaseConnection();
	private DatabaseTransaction databaseTransaction = new DatabaseTransaction();
	private TaskDatabase taskDatabase = new TaskDatabase();
	
	public void saveTask(Task task) {
		databaseConnection.openConnection();
		databaseTransaction.openTransaction();
		taskDatabase.save(task);
		databaseTransaction.commitTransaction();
		databaseTransaction.closeTransaction();
		databaseConnection.closeConnection();
	}
	
	public void removeTask(Task task) {
		databaseConnection.openConnection();
		databaseTransaction.openTransaction();
		taskDatabase.remove(task);
		databaseTransaction.commitTransaction();
		databaseTransaction.closeTransaction();
		databaseConnection.closeConnection();
	}

}

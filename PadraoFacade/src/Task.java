import java.util.Date;

public class Task {

	private String name;
	private Date date;

	public Task(String name, Date date) {
		this.name = name;
		this.date = date;
	}
	
	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public Date getDate() {
		return date;
	}

	public void setDate(Date date) {
		this.date = date;
	}
	
	@Override
	public String toString() {
		return date + " - " + name;
	}

}

package beans;

public class Priority {
	
	private int id;
	private String priority;
	private int issue_id;
	
	public Priority() {}
	
	public Priority(int id, String priority, int issue_id) {		
		this.id = id;
		this.priority = priority;
		this.issue_id = issue_id;
	}
	
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	public String getPriority() {
		return priority;
	}
	public void setPriority(String priority) {
		this.priority = priority;
	}
	public int getIssue_id() {
		return issue_id;
	}
	public void setIssue_id(int issue_id) {
		this.issue_id = issue_id;
	}
	

	
}

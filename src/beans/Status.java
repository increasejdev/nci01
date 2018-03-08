package beans;

public class Status {
	private int id;
	private String status;
	private int issue_id;
	
	public Status() {}
	
	public Status(int id, String status, int issue_id) {		
		this.id = id;
		this.status = status;
		this.issue_id = issue_id;
	}
	
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	public String getStatus() {
		return status;
	}
	public void setStatus(String status) {
		this.status = status;
	}
	public int getIssue_id() {
		return issue_id;
	}
	public void setIssue_id(int issue_id) {
		this.issue_id = issue_id;
	}
	@Override
	public String toString() {
		return "Status [id=" + id + ", status=" + status + ", issue_id=" + issue_id + "]";
	}
	

	
	
}

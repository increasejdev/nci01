package beans;

public class Rfc {
	
	private int id;
	private String rfc;
	private int issue_id;
	
	public Rfc() {
		
	}
	
	public Rfc(int id, String rfc, int issue_id) {
		this.id = id;
		this.rfc = rfc;
		this.issue_id = issue_id;
	}
	
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	public String getRfc() {
		return rfc;
	}
	public void setRfc(String rfc) {
		this.rfc = rfc;
	}

	public int getIssue_id() {
		return issue_id;
	}

	public void setIssue_id(int issue_id) {
		this.issue_id = issue_id;
	}

	@Override
	public String toString() {
		return "Rfc [id=" + id + ", rfc=" + rfc + ", issue_id=" + issue_id + "]";
	}

	
	
	
	
}

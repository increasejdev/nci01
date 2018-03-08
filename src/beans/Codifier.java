package beans;

public class Codifier {
	private int id;
	private String codifier;
	private int issue_id;
	
	public Codifier() {
		
	}
	
	public Codifier(int id, String codifier, int issue_id) {
			this.id = id;
			this.codifier = codifier;
			this.issue_id = issue_id;
	}
	
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	public String getCodifier() {
		return codifier;
	}
	public void setCodifier(String codifier) {
		this.codifier = codifier;
	}
	public int getIssue_id() {
		return issue_id;
	}
	public void setIssue_id(int issue_id) {
		this.issue_id = issue_id;
	}
	@Override
	public String toString() {
		return "Codifier [id=" + id + ", codifier=" + codifier + ", issue_id=" + issue_id + "]";
	}
	
	
	

}

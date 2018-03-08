package beans;

public class Solution {
	private int id;
	private String solution;
	private int issue_id;
	
	public Solution() {}
	
	public Solution(int id, String solution, int issue_id) {		
		this.id = id;
		this.solution = solution;
		this.issue_id = issue_id;
	}
	
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	public String getSolution() {
		return solution;
	}
	public void setSolution(String solution) {
		this.solution = solution;
	}
	public int getIssue_id() {
		return issue_id;
	}
	public void setIssue_id(int issue_id) {
		this.issue_id = issue_id;
	}

	@Override
	public String toString() {
		return "Solution [id=" + id + ", solution=" + solution + ", issue_id=" + issue_id + "]";
	}
	
	
	
}

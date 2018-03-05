package beans;

import java.util.Date;

public class Issue {

	private int id;
	private String issue;
	private int status_id;
	private int codifier_id;
	private String description;
	private int priority_id;
	private int solution_id;
	private Date data;
	private int rfc_id;
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	public String getIssue() {
		return issue;
	}
	public void setIssue(String issue) {
		this.issue = issue;
	}
	public int getStatus_id() {
		return status_id;
	}
	public void setStatus_id(int status_id) {
		this.status_id = status_id;
	}
	public int getCodifier_id() {
		return codifier_id;
	}
	public void setCodifier_id(int codifier_id) {
		this.codifier_id = codifier_id;
	}
	public String getDescription() {
		return description;
	}
	public void setDescription(String description) {
		this.description = description;
	}
	public int getPriority_id() {
		return priority_id;
	}
	public void setPriority_id(int priority_id) {
		this.priority_id = priority_id;
	}
	public int getSolution_id() {
		return solution_id;
	}
	public void setSolution_id(int solution_id) {
		this.solution_id = solution_id;
	}
	public Date getData() {
		return data;
	}
	public void setData(Date data) {
		this.data = data;
	}
	public int getRfc_id() {
		return rfc_id;
	}
	public void setRfc_id(int rfc_id) {
		this.rfc_id = rfc_id;
	}






}
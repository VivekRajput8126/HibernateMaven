package Hello.Project4_CollectionMapping;

import java.util.*; 
import javax.persistence.*;

@Entity
@Table(name = "Interview_Schduled")
public class Interview {
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	@Column(name = "interview_id")
	private int interview_id;
	@Column(name = "name", nullable = false)
	private String name;
	@Column(name = "ex_organisation", nullable = false)
	private String ex_organisation;
	@Column(name = "current_salary", nullable = false)
	private String current_salary;
	
	/*
	 * @ElementCollection
	 * 
	 * @CollectionTable(name = "candiates", joinColumns = @JoinColumn(name =
	 * "myinterview_id"))
	 * 
	 * @OrderColumn(name="vivek_official")
	 * 
	 * @MapKeyColumn(name = "ref")
	 * 
	 * @Column(name = "references")
	 */
	@ElementCollection
	@CollectionTable(name="candiates",joinColumns=@JoinColumn(name="myinterview_id"))
	@OrderColumn (name="vivek_official")
	@MapKeyColumn (name="empname")
	@Column(name="Contact_Number")
	private Map<String, Integer> references;
	
	public Interview() {
	}
	
	public Interview(String name, String ex_organisation, String current_salary) {
		this.name = name;
		this.ex_organisation = ex_organisation;
		this.current_salary = current_salary;
	}

	public Interview(String name, String ex_organisation, String current_salary, Map<String, Integer> references) {
		this.name = name;
		this.ex_organisation = ex_organisation;
		this.current_salary = current_salary;
		this.references = references;
	}
	
	public int getInterview_id() {
		return interview_id;
	}

	public void setInterview_id(int interview_id) {
		this.interview_id = interview_id;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getEx_organisation() {
		return ex_organisation;
	}

	public void setEx_organisation(String ex_organisation) {
		this.ex_organisation = ex_organisation;
	}

	public String getCurrent_salary() {
		return current_salary;
	}

	public void setCurrent_salary(String current_salary) {
		this.current_salary = current_salary;
	}

	public Map<String, Integer> getReferences() {
		return references;
	}

	public void setReferences(Map<String, Integer> references) {
		this.references = references;
	}

	@Override
	public String toString() {
		return "Interview [interview_id=" + interview_id + ", name=" + name + ", ex_organisation=" + ex_organisation
				+ ", current_salary=" + current_salary + ", references=" + references + "]";
	}
}

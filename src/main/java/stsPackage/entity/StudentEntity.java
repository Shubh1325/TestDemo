package stsPackage.entity;

import jakarta.persistence.*;

@Entity
@Table(name="student")
public class StudentEntity {
	
	@Id
	@Column(name="sr_no")
	private long sr_no;
	
	@Column(name="student_name")
	private String student_name;
	
	@Column(name="standard")
	private char standard;
	
	@Column(name="percentage")
	private double percentage;
	
	
	
	public long getSr_no() {
		return sr_no;
	}

	public void setSr_no(long sr_no) {
		this.sr_no = sr_no;
	}

	public String getStudent_name() {
		return student_name;
	}

	public void setStudent_name(String student_name) {
		this.student_name = student_name;
	}

	public char getStandard() {
		return standard;
	}

	public void setStandard(char standard) {
		this.standard = standard;
	}

	public double getPercentage() {
		return percentage;
	}

	public void setPercentage(double percentage) {
		this.percentage = percentage;
	}
}

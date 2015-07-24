package com.beingjavaguys.domain;
import javax.persistence.*;
import java.util.Set;

@Entity
@Table(name = "cars")
public class Cars {

	@Id
	@GeneratedValue
	@Column(name="cars_id")
	private int id;
	
	@Column(name="mark")
	private String mark;
	
	@Column(name="model")
	private String model;

	@Column(name="year")
	private String year;

	@ManyToOne
	@JoinColumn(name = "employee_id", referencedColumnName = "id")
	public Employee employee;

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public String getMark() {
		return mark;
	}

	public void setMark(String mark) {
		this.mark = mark;
	}

	public String getModel() {
		return model;
	}

	public void setModel(String model) {
		this.model = model;
	}

	public String getYear() {
		return year;
	}

	public void setYear(String year) {
		this.year = year;
	}

	public Employee getEmployee() {
		return employee;
	}

}

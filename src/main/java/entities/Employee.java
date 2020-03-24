package entities;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Table;

import io.quarkus.hibernate.orm.panache.PanacheEntity;

@Entity
@Table (name = "public.employee")
public class Employee extends PanacheEntity{
	
	@Column(name = "id")
	public Long id;
	
	@Column(name = "name")
	public String name;
	
	@Column(name = "department")
	public String department;
	
	


	public Long getId() {
		return id;
	}
	public void setId(Long id) {
		this.id = id;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public String getDepartment() {
		return department;
	}
	public void setDepartment(String department) {
		this.department = department;
	}

    
}
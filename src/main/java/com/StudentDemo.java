package com;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;

import lombok.Data;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Data
@Table(name="student")
public class StudentDemo {
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	@Column(name="eid")
	int id;
	@Column(name="ename")
	String name;
	@Column(name="e_email")
	String email;
	@Column(name="e_age")
	Integer age;
}

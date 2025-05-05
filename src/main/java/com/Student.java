package com;

import javax.persistence.Entity;
import lombok.Data;
import javax.persistence.Id;

@Entity
@Data
public class Student {
	@Id
	int id;
	String name;
	Integer age;
}

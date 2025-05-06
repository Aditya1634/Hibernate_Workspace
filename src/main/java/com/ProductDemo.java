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
@Table(name="product")
public class ProductDemo {

	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	@Column(name="pid")
	int id;
	@Column(name="pname")
	String name;
	@Column(name="p_price")
	double price;
	@Column(name="p_qty")
	int quantity;
}
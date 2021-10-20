package com.colorproject.model;

import javax.persistence.Column;
import javax.persistence.ElementCollection;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.OrderColumn;
import javax.persistence.Table;

import lombok.Data;

@Table
@Entity
@Data
public class User {

	@Id
	@GeneratedValue
	int id;
	
	@Column
	String userName;
	
	@ElementCollection
    @OrderColumn(name = "user_color")
	String[] colors;
			
}

package com.ars.entity;


import com.fasterxml.jackson.annotation.JsonBackReference;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.JoinColumn;
import jakarta.persistence.ManyToOne;
import jakarta.persistence.Table;
import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

@Entity
@Data
@NoArgsConstructor
@AllArgsConstructor
@Table(name = "passenger")
@Builder
//entity class for passenger
public class Passenger {
	
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private Integer passengerId;
	private String passengerName;
	private String mobileNo;

	//many to one relationship
	@ManyToOne
	@JoinColumn(name = "flight_id")  //join the column
	@JsonBackReference               //linkage between two field,parent and child role
	private Admin flight_id; 
}

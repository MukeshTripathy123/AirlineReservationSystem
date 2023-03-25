package com.ars.entity;

import java.time.LocalDateTime;
import java.util.List;

import jakarta.persistence.CascadeType;
import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.OneToMany;
import jakarta.persistence.Table;
import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@AllArgsConstructor
@NoArgsConstructor
@Table(name = "admin")
@Builder
@Entity
//Entity class for admin
public class Admin {
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	@Column(name = "flight_id")
	private int flightId;
	private String flightName;
	private LocalDateTime flightDateTime;
	private String flightFrom;
	private String flightTo;
	
	//one to many relationship
	@OneToMany(mappedBy = "flight_id", cascade = CascadeType.ALL)
	private List<Passenger> passengers;

}

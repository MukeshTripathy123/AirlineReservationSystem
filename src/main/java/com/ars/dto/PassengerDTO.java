package com.ars.dto;


import jakarta.validation.constraints.NotBlank;
import jakarta.validation.constraints.NotNull;
import jakarta.validation.constraints.Pattern;
import jakarta.validation.constraints.Size;
import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

@AllArgsConstructor
@NoArgsConstructor
@Data
@Builder
//this class is responsible for validation
public class PassengerDTO {

	@NotBlank(message = "Invalid Name: Empty Name")
	@NotNull(message = "Invalid Name: name is NULL")
	@Size(min = 3, max = 25, message = "Invalid Name: Must be of 3-25 characters")
	private String passengerName;
	
	@NotNull(message = "Invalid Phone Number: number is NULL")
	@NotBlank(message = "Invalid Phone Number: Empty Number")
	@Pattern(regexp = "^\\d{10}$", message = "Invalid phone Number!!!!")
	private String mobileNo;
}

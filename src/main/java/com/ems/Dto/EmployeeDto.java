package com.ems.Dto;

import jakarta.validation.constraints.Email;
import jakarta.validation.constraints.NotNull;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@NoArgsConstructor
@AllArgsConstructor(staticName ="build")
public class EmployeeDto {
	
	@NotNull(message = "Username should not be null")
	private String FirstName;
	private String LastName;
	@Email(message ="Invalid email address")
	private String email;
	@NotNull(message ="Nationality shoud not be null")
	private String nationality;
	
}

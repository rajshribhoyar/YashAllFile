package com.blog.payloads;

import java.util.HashSet;
import java.util.Set;

import javax.validation.constraints.Email;
import javax.validation.constraints.NotEmpty;
import javax.validation.constraints.NotNull;
import javax.validation.constraints.Null;
import javax.validation.constraints.Size;

import com.blog.entities.Role;
import com.fasterxml.jackson.annotation.JsonIgnore;

import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@NoArgsConstructor
@Setter
@Getter
public class UserDto {
	private int id;
	
	@NotEmpty
	@Size(min=4,message="Username must be min of 4 characters")
	private String name;
	
	@Email(message="Email address is not valid !!")
	private String email;
	
	@NotEmpty
	@NotNull
	@Size(min=4,max=10,message="Password must be min og 4 chars and max of 10 chars !! ")
	private String password;
	
	@NotEmpty
	private String about;

	private Set<RoleDto> roles = new HashSet<>();
	
	
	
	
	
	
	
	
	
	
	
	
	
//	  @JsonIgnore
	  //public String getPassword() { return this.password; }
	 
}

package com.masai.model;

import javax.persistence.Entity;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@Getter
@Setter
@AllArgsConstructor
@NoArgsConstructor
@Entity
public class Customer {
		private String customerId;
		private String firstName;
		private String lastName;
		private String mobileNumber;
		private Address address;
		private String email;
}
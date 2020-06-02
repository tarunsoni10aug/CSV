package com.telstra.codechallenge.User;

import com.fasterxml.jackson.annotation.JsonProperty;

import lombok.Data;

@Data
public class UserDetails {
	@JsonProperty("id")
	long  id;
	@JsonProperty("login")
	String 	  login;
	@JsonProperty("html_url")
	String 	  html_url;
}

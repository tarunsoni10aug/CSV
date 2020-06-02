package com.telstra.codechallenge.User;

import java.util.List;

import com.fasterxml.jackson.annotation.JsonProperty;

import lombok.Data;
import lombok.Getter;
import lombok.Setter;

@Data
@Getter
@Setter
public class UserMapper {
	
	@JsonProperty("total_count")
	private String total_count;
	@JsonProperty("incomplete_results")
	private boolean incomplete_results;
	@JsonProperty("items")
	private List<UserDetails>items;
	public String getTotal_count() {
		return total_count;
	}
	public void setTotal_count(String total_count) {
		this.total_count = total_count;
	}
	public boolean isIncomplete_results() {
		return incomplete_results;
	}
	public void setIncomplete_results(boolean incomplete_results) {
		this.incomplete_results = incomplete_results;
	}
	public List<UserDetails> getItems() {
		return items;
	}
	public void setItems(List<UserDetails> items) {
		this.items = items;
	}
	
	

}

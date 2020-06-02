package com.telstra.codechallenge.User;

import java.util.List;
import java.util.stream.Collectors;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Service;
import org.springframework.web.client.RestTemplate;

@Service
public class UserService {
	@Autowired
	private RestTemplate restTemplate;
	@Value("${user.base.url}")
	private String userUrl;

	public List<UserDetails> getOldestUser(int limit) {
		UserMapper mapper = restTemplate.getForObject(userUrl, UserMapper.class);
		List<UserDetails> collect = mapper.getItems().stream().limit(limit).collect(Collectors.toList());
		System.out.println(collect);
		return collect;
	}
}

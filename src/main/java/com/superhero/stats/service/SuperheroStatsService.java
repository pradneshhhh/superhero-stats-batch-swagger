package com.superhero.stats.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.superhero.stats.dto.SuperheroStats;

@Service
public class SuperheroStatsService {
	
	@Autowired
	private SuperheroStatsRepo repo;
	
	public SuperheroStats getByName(String name) {
		return repo.getByName(name);
	}
	
	public List<SuperheroStats> getByGender(String gender) {
		return repo.getByGender(gender);
	}
}
